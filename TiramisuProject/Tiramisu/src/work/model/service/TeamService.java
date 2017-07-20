package work.model.service;

import java.util.ArrayList;

import work.model.dao.BiasDao;
import work.model.dao.DialogDao;
import work.model.dao.LikesDao;
import work.model.dao.MemberDao;
import work.model.dao.MessageDao;
import work.model.dao.OpinionDao;
import work.model.dao.TeamDao;
import work.model.dao.TeamMemberDao;
import work.model.dao.VoteDao;
import work.model.dto.Bias;
import work.model.dto.Dialog;
import work.model.dto.Files;
import work.model.dto.Image;
import work.model.dto.Likes;
import work.model.dto.Member;
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
	private MemberDao memberDao = new MemberDao();
	
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
	 *  Team ����, team_member ���̺� team, nickname �߰�
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
		if(isCorrectTeam(teamName, subject)) {
			Team dto = new Team(teamName, subject, strOpen);
			teamDao.insert(dto);
			teamMemberDao.insert(teamName, nickname);
			return true;
		}
		return false;
	}
	
	/**
	 * teamName, subject üũ
	 */
	public boolean isCorrectTeam(String teamName, String subject) {
		if(teamName.length()>0 && teamName.length()<21 && subject.length()<51) {
			return true;
		}
		return false;
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
			if(voteList.get(i).getVoteName().equals(voteName)) {
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
			if(voteList.get(i).getVoteName().equals(voteName)) {
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
	 * image Check
	 */
	public boolean isCorrectImage(Image image) {
		if(image.getFileName().length()>0 && image.getFileName().length()<=200) {
			return true;
		}
		return false;
	}
	
	/**
	 * vote name ���� check
	 */
	public boolean isCorrectVoteName(String voteName) {
		if(voteName.length()<=20) {
			return true;
		}
		return false;
	}
	
	/**
	 * opinion content ���� check
	 */
	public boolean isCorrectOpinionContent(String content) {
		if(content.length()<=200) {
			return true;
		}
		return false;
	}
	
	/**
	 *  file content ���� check
	 */
	public boolean isCorrectFile(Files file) {
		if(file.getFileName().length()>0 && file.getFileName().length()<=200) {
			return true;
		}
		return false;
	}
	
	/**
	 * channel�̸� check
	 */
	public boolean isCorrectChannelName(String channelName) {
		if(channelName.length()<21) {
			return true;
		}
		return false;
	}
	
	/**
	 * bias name check
	 */
	public boolean isCorrectBiasName(String biasName) {
		if(biasName.length()<=10 && biasName.length()>0) {
			return true;
		}
		return false;
	}
	
	/**
	 *  dialog  channel�� 20������, content 300�� ���� Check
	 */
	public boolean isCorrectDialog(Dialog dialog) {
		if(isCorrectChannelName(dialog.getChannelName())) {
			if(dialog.getContent().length()<=300) {
				return true;
			}
		}
		return false;
	}

	/**
	 * <pre>
	 * ����ڿ��� �����,��ǥ��,������ �޾Ƽ� �����ϳ��� Ư��ȭ���Ѽ� ���� ID�� �ް� �� ���� �г����� �̿��ؼ� �ǰ��� Ư��ȭ��Ų��.
	 * �׷��� Ư��ȭ ���Ѽ� ������ ������.
	 * </pre>
	 */
	public boolean editOpinion(String nickname, String biasName, String voteName, String teamName, String content) {
		ArrayList<Bias> biasList = biasDao.selectAll();
		ArrayList<Vote> voteList = voteDao.selectAll();
		Opinion dto = null;
		int biasId = 0;
		int voteId = 0;
		
		//biasList, voteList���� ������ �̸��� �´� voteId, biasId �˻� �� set.
		for(int i=0; i<voteList.size(); ++i) {
			if(voteList.get(i).getVoteName().equals(voteName)) {
				for(int j=0; j<biasList.size(); ++j) {
					if(biasList.get(i).getBiasName().equals(biasName)) {
						voteId = voteList.get(i).getVoteId();
						biasId = biasList.get(j).getBiasId();
					}
				}
			}
		}
		//bias�� vote ������ false
		//�Ѵ� 0�� �ƴϸ� dto set�ϰ� opinion update.
		if(biasId == 0 || voteId == 0) {
			return false;
		} else {
			dto.setBiasId(biasId);
			dto.setContent(content);
			dto.setNickname(nickname);
			opinionDao.update(dto);
			return true;
		}
	}

	/**
	 * <pre>
	 * ����ڿ��� id�� team�̸��� �޾Ƽ� ����ڰ� team���� Ż����.
	 * </pre>
	 */
	public boolean dropTeam(String memberId, String teamName) {
		String nickname = null;
		ArrayList<Member> memberList = memberDao.selectAll();
		for(int i=0; i<memberList.size(); ++i) {
			if(memberList.get(i).getMemberId().equals(memberId)) {
				nickname = memberList.get(i).getNickname();
			}
		}
		/*
		 * memberId�� �´� ����� nickname �˻� ��
		 * nickname�� null�̸� false return
		 * null�� �ƴϸ� teamMember table���� ���� ��
		 * return true
		 */
		if(nickname == null) {
			return false;
		} else {
			teamMemberDao.delete(teamName, nickname);
			return true;
		}
	}

}