package work.model.service;

import java.util.ArrayList;

import work.model.dao.BiasDao;
import work.model.dao.DialogDao;
import work.model.dao.LikesDao;
import work.model.dao.MessageDao;
import work.model.dao.OpinionDao;
import work.model.dao.TeamDao;
import work.model.dao.TeamMemberDao;
import work.model.dao.VoteDao;
import work.model.dto.Bias;
import work.model.dto.Dialog;
import work.model.dto.Likes;
import work.model.dto.Message;
import work.model.dto.Opinion;
import work.model.dto.Team;
import work.model.dto.Vote;

public class TeamService {
	public static TeamService instance = new TeamService();
	private TeamDao teamDao = new TeamDao();
	private TeamMemberDao teamMemberDao = new TeamMemberDao();
	private MessageDao messageDao = new MessageDao();
	private BiasDao biasDao = new BiasDao();
	private VoteDao voteDao = new VoteDao();
	private OpinionDao opinionDao = new OpinionDao();
	private DialogDao dialogDao = new DialogDao();
	private LikesDao likesDao = new LikesDao();
	
	private TeamService() {

	}

	public static TeamService getInstance() {
		return instance;
	}

	public Boolean stringMakeBoolean(String bool) {
		if (bool.equalsIgnoreCase("TRUE")) {
			return true;
		} else if (bool.equalsIgnoreCase("FALSE")) {
			return false;
		}
		return null;
	}

	/**
	 *  �ߺ��Ǵ� Team�̸� �˻� �� 
	 *  Team ����, team_member ���̺��� team, nickname �߰�
	 *  team ������ false return
	 */
	// �̹� �� �̸��� �ִ��� ��ȿ�� �˻��ؾ���.
	public boolean makeTeam(String nickname, String teamName, String subject, Boolean open) {
		ArrayList<Team> teamList = teamDao.selectAll();
		for(int i=0; i<teamList.size(); ++i) {
			if(teamList.get(i).getTeamName().equals(teamName)) {
				return false;  // ���� ���̸� ����
			}
		}
		String strOpen = null;
		if(open == true) {
			strOpen = "TRUE";
		} else {
			strOpen = "FALSE";
		}
		Team dto = new Team(teamName, subject, strOpen);
		teamDao.insert(dto);
		teamMemberDao.insert(teamName, nickname);
		return true;
	}

	
	public boolean setOpen(String teamName) {
		ArrayList<Team> teamList = new ArrayList<Team>();
		for(int i=0; i<teamList.size(); ++i) {
			if(teamList.get(i).getTeamName().equals(teamName)) {
				teamDao.setOpen(teamName);
				return true;
			}
		}
		return false;
	}

	//�ۼ��ڰ� �����ڿ��� �޽����� ����
	public void makeMessage(String writer, String receiver, String content) {
		Message message = new Message(content, writer, receiver, "false");
		messageDao.insert(message);
	}

	
	//��������� �г���, �����, ������ �޾Ƽ� �����˴ϴ�.
	public boolean makeOpinion(String nickname, String voteName, String biasName, String content) {
		ArrayList<Bias> biasList = biasDao.selectAll();
		ArrayList<Vote> voteList = voteDao.selectAll();
		Opinion opinion = null;
		int biasId = 0;
		int voteId = 0;
		for(int i=0; i<voteList.size(); ++i) {
			if(voteList.get(i).getNickname().equals(voteName)) {
				for(int j=0; j<biasList.size(); ++j) {
					if(biasList.get(j).getBiasName().equals(biasName)) {
						voteId = voteList.get(i).getVoteId();
						biasId = biasList.get(j).getBiasId();
					}
				}
			}
		}
		if(biasId != 0) {
			opinion = new Opinion(nickname, biasId, content);
			opinionDao.insert(opinion);
			return true; 
		}
		return false;
	}

	//����ڿ��� �г��Ӱ� �����,��ǥ��,������ �޾Ƽ� �ǰ��� �����մϴ�.
	public boolean deleteOpinion(String nickname, String biasName, String voteName, String teamName) {
		ArrayList<Vote> voteList = voteDao.selectAll();
		ArrayList<Bias> biasList = biasDao.selectAll();
		int voteId =0;
		int biasId = 0;
		for(int i=0; i<voteList.size(); ++i) {
			if(voteList.get(i).getNickname().equals(voteName)) {
				for(int j=0; j<biasList.size(); ++j) {
					if(biasList.get(j).getBiasName().equals(biasName)) {
						voteId = voteList.get(i).getVoteId();
						biasId = biasList.get(j).getBiasId();
					}
				}
			}
		}
		if(voteId != 0 && biasId != 0) {
			opinionDao.delete(biasId);
			return true;
		}
		return false;
	}

	/**
	 * <pre>	
	 * ����ڿ��Լ� �ۼ��ڿ� �ۼ����� �޾Ƽ� ���̾�α��� id�� Ư��ȭ ��Ų �� �װ� �������� ���ƿ並 ã�Ƴ��� �� ���ƿ䰡 ���� ����������� �ʴٸ�
	 * ���ƿ並 ���θ���� �ִٸ� ���ֹ�����. ���ָ� false�� ��ȯ�ϰ� �������״ٸ� true�� ��ȯ�Ѵ�.
	 * </pre>
	 */
	
	/*
	 * writer = member�� nickname
	 * liker = member��  nickname
	 */
	public boolean likesOpinion(String writer, String writeDate, String liker) {
		Dialog dialog = dialogDao.selectOne(writer, writeDate);
		int dialogId = dialog.getDialogId();
		Likes dto = likesDao.selectOne(dialogId);
		if(dto == null) {
			likesDao.insert(dto);
			return true;
		} else {
			likesDao.delete(dialogId);
			return false;
		}
	}

	/**
	 * <pre>
	 * ����ڿ��� �����,��ǥ��,������ �޾Ƽ� �����ϳ��� Ư��ȭ���Ѽ� ���� ID�� �ް� �� ���� �г����� �̿��ؼ� �ǰ��� Ư��ȭ��Ų��.
	 * �׷��� Ư��ȭ ���Ѽ� ������ ������.
	 * </pre>
	 */
	public boolean editOpinion(String nickname, String biasName, String voteName, String teamName, String content) {
		
		return true;
	}

	/**
	 * <pre>
	 * ����ڿ��� id�� team�̸��� �޾Ƽ� ����ڰ� team���� Ż����.
	 * </pre>
	 * @param memberId
	 * @param teamName
	 * @return
	 */
	public boolean dropTeam(String memberId, String teamName) {
		return true;
	}
}