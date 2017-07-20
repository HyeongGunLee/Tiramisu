package work.model.service;

import java.util.ArrayList;
import java.util.Random;

import work.model.dao.ImageDao;
import work.model.dao.MemberDao;
import work.model.dao.TeamMemberDao;
import work.model.dto.Image;
import work.model.dto.Member;

public class MemberService {

	public static MemberService instance = new MemberService();
	private MemberDao dao = new MemberDao();
	private ImageDao imageDao = new ImageDao();

	private MemberService() {

	}

	public static MemberService getInstance() {
		return instance;
	}

	/**
	 * ID, PW ������ true return
	 */
	public boolean loginCheck(String memberId, String memberPw) {
		Member member = dao.selectOne(memberId);
		// �α��� ���̵� ������ ����
		if (member == null) {
			return false;
		} else {
			if (member.getMemberPw().equals(memberPw)) {
				return true;
			} else {
				return false;
			}
		}
	}

	/**
	 * memberId�� unique���� �׽�Ʈ
	 */
	public boolean idUniqueTest(String memberId) {
		ArrayList<Member> list = new ArrayList<Member>();
		list = dao.selectAll();
		for (int i = 0; i < list.size(); ++i) {
			if (list.get(i).getMemberId().equals(memberId)) {
				return false;
			}
		}
		return true;
	}

	/**
	 * Pw�� Ȯ�� PW �´��� Ȯ�� ������ True ����
	 * 
	 * @param memberPw
	 * @param memberPwV
	 * @return
	 */
	public boolean passwordVerifiedTest(String memberPw, String memberPwV) {
		if (memberPw.equals(memberPwV)) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Member Insert ���� id ������ insert
	 */
	public boolean insertMember(String memberId, String memberPw, String question, String answer, String nickname,
			String imagePath) {
		Integer imageId = findImageId(nickname);
		
		if (dao.selectOne(memberId) == null) {
			Member dto = new Member();
			dto.setMemberPw(memberPw);
			dto.setQuestion(question);
			dto.setAnswer(answer);
			dto.setNickname(nickname);
			dto.setImage(imageId);
			dao.insert(dto);
			return true;
		}
		return false;
	}

	/**
	 * Member ���� Member Password�� ������ Member Password�� ������ UPDATE edit ���� =>
	 * return true edit ���� => return false;
	 */
	public boolean editMember(String memberPw, String imagePath, String nickname, String question, String answer) {
		ArrayList<Member> list = dao.selectAll();
		Member dto = null;
		Integer imageId = findImageId(nickname);
		for (int i = 0; i < list.size(); ++i) {
			if (list.get(i).getNickname().equals(nickname)) {
				String memberId = list.get(i).getMemberId();
				dto.setMemberId(memberId);
				dto.setMemberPw(memberPw);
				dto.setImage(imageId);
				dto.setNickname(nickname);
				dto.setQuestion(question);
				dto.setAnswer(answer);
				dao.update(dto);
				return true;
			}
		}
		return false;
	}
	
	/**
	 *   Member�� nickname���� Member�� Image return
	 */
	public Integer findImageId(String nickname) {
		ArrayList<Member> memberList = dao.selectAll();
		Integer imageId = null;
		for(int i=0; i<memberList.size(); ++i) {
			if(memberList.get(i).getNickname().equals(nickname)) {
				imageId = memberList.get(i).getImage();
				return imageId;
			}
		}
		return null;
	}
	

	/**
	 * Return member ID
	 * 
	 * Member List���� ���� �г����� ������ Member�� Id�� Return ������ null return
	 */
	public String bringId(String nickname, String question, String answer) {
		ArrayList<Member> list = dao.selectAll();
		for (int i = 0; i < list.size(); ++i) {
			if (list.get(i).getNickname().equals(nickname)) {
				return list.get(i).getMemberId();
			}
		}
		return null;
	}

	/**
	 * MemberId�� ���� Member�� �����ϰ� question, answer�� ������ true ���� �ٸ��� false ����
	 */
	public boolean idExist(String memberId, String question, String answer) {
		Member dto = dao.selectOne(memberId);
		if (dto != null && dto.getQuestion().equals(question) && dto.getAnswer().equals(answer)) {
			return true;
		}
		return false;
	}

	/**
	 * ???? ????
	 * 
	 * @return n??리�?? ?��?? ???? ????
	 */
	public String randomN(int n) {
		return new Random().nextInt(10 * n) + "";
	}

	/**
	 * password ����
	 */
	public boolean editMemberPw(String memberId, String newMemberPw) {
		dao.updatePassword(memberId, newMemberPw);
		return true;
	}

	/**
	 * Member�� ���� Team List ��ȯ
	 */
	public ArrayList<String> memberHaveTeam(String memberId) {
		ArrayList<String> teamList = new ArrayList<>();
		String nickname = memberIdToNickname(memberId);
		TeamMemberDao teamMemberDao = new TeamMemberDao();
		teamList = teamMemberDao.selectTeamList(nickname);
		return teamList;
	}

	/**
	 * MemberId�� NickName���� ��ȯ
	 * 
	 * @param memberId
	 * @return
	 */
	public String memberIdToNickname(String memberId) {
		Member dto = dao.selectOne(memberId);
		if (dto != null) {
			return dto.getNickname();
		}
		return null;
	}

	/**
	 * Id�� ��Ȯ���� Ȯ���ϴ� �޼ҵ�
	 * id 4~10���� �ҹ��ڸ� ���
	 * @
	 * ������ ���� '.'�ִ��� Ȯ��
	 * @param memberId
	 * @return
	 */
	public boolean checkMemberId(String memberId) {
		String regex = "^([a-z0-9]{3,10})\\@([a-z0-9]{3,10})\\.([a-z0-9]{3,10})";
		if ( memberId.matches(regex)) {
			return true;
		}
		return false;
	}
	
	/**
	 * pw�� ��Ȯ���� Ȯ���ϴ� �޼ҵ�
	 * @param memberPw
	 * @return
	 */
	public boolean checkMemberPw(String memberPw) {
		String regex = "^[a-zA-Z0-9]{8,20}";
		if ( memberPw.matches(regex)) {
			return true;
		}
		return false;
	}
	
	/**
	 * �亯�� ���̰� 1�� �̻� 20�� ���� ���� Ȯ���ϴ� �޼ҵ�
	 * @param memberPw
	 * @return
	 */
	public boolean checkAnswerLength(String answer) {
		int length = answer.length();
		if (length >= 1 && length <= 20) {
			return true;
		}
		return false;
	}
	/**
	 * �г����� ���̰� ��Ȯ���� Ȯ���ϴ� �޼ҵ� 
	 * �г����� ����ũ�� ��񿡼� Ȯ��?
	 * @param nickname
	 * @return
	 */
	public boolean checkNicknameLength(String nickname) {
		int length = nickname.length();
		if (length >= 1 && length <= 20) {
			return true;
		}
		return false;
	}
	
	/**
	 * ����� �ҷ��ͼ� �г����̶� Ȯ���� �г����� ������ false ���� ������ true ����
	 * �г��� �ִ��� ������ Ȯ�ΰ���
	 * @param nickname
	 * @return
	 */
	public boolean checkNicknameIsUnique(String nickname) {
		ArrayList<Member> members = dao.selectAll();
		for (int i = 0 ; i < members.size() ; i ++) {
			if (nickname.equals(members.get(i).getNickname())) {
				return false;
			}
		}
		return true;
	}
	
	/**
	 * checkNicknameLength + checkNicknameIsUnique �� �̿��ؼ� �г����� ��밡���� üũ�ϴ� �޼ҵ�
	 * @param nickname
	 * @return
	 */
	public boolean checkNickname(String nickname) {
		if (checkNicknameLength(nickname) == false) {
			return false;
		} else {
			if (checkNicknameIsUnique(nickname) == true) {
				return true;
			}
			return false;
		}
	}

	
	/**
	 * ��Ʈ�� Ÿ���� �Ҹ����� ������ �Ҹ� �����ͷ� ��ȯ�ϴ� �޼ҵ� 
	 * @param bool
	 * @return
	 */
	public boolean stringBooleanDataToTypeData(String bool) {
		if (bool.equals("FALSE")) {
			return false;
		} else {
			return true;
		}
	}
	
	/**
	 * checkNicknameIsUnique �� �ݴ� ������ true //���������� �߰� 
	 * @param nickname
	 * @return
	 */
	public boolean isInNickname(String nickname) {
		ArrayList<Member> members = dao.selectAll();
		for (int i = 0 ; i < members.size() ; i ++) {
			if (nickname.equals(members.get(i).getNickname())) {
				return true;
			}
		}
		return false;
	}
	
	
}