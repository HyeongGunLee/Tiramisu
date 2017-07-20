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
	 * ID, PW 같으면 true return
	 */
	public boolean loginCheck(String memberId, String memberPw) {
		Member member = dao.selectOne(memberId);
		// 로그인 아이디 없으면 실패
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
	 * memberId가 unique인지 테스트
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
	 * Pw와 확인 PW 맞는지 확인 같으면 True 리턴
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
	 * Member Insert 같은 id 없으면 insert
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
	 * Member 수정 Member Password가 기존의 Member Password와 같으면 UPDATE edit 성공 =>
	 * return true edit 실패 => return false;
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
	 *   Member의 nickname으로 Member의 Image return
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
	 * Member List에서 같은 닉네임을 가지는 Member의 Id를 Return 없으면 null return
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
	 * MemberId와 같은 Member가 존재하고 question, answer가 같으면 true 리턴 다르면 false 리턴
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
	 * @return n??由ъ?? ?レ?? ???? ????
	 */
	public String randomN(int n) {
		return new Random().nextInt(10 * n) + "";
	}

	/**
	 * password 변경
	 */
	public boolean editMemberPw(String memberId, String newMemberPw) {
		dao.updatePassword(memberId, newMemberPw);
		return true;
	}

	/**
	 * Member가 속한 Team List 반환
	 */
	public ArrayList<String> memberHaveTeam(String memberId) {
		ArrayList<String> teamList = new ArrayList<>();
		String nickname = memberIdToNickname(memberId);
		TeamMemberDao teamMemberDao = new TeamMemberDao();
		teamList = teamMemberDao.selectTeamList(nickname);
		return teamList;
	}

	/**
	 * MemberId를 NickName으로 변환
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
	 * 올바른 Member인지 Check
	 */
	public boolean isCorrectMember(Member member) {
		if (isCorrectId(member.getMemberId()) && isCorrectPw(member.getMemberPw()) && isCorrectAnswer(member.getAnswer()) 
				&& isCorrectNickname(member.getNickname()) && isCorrectImage(member.getImage())) {
			return true;
		}
		return false;
	}
	
	public boolean isCorrectId(String memberId) {
		
		return false;
	}
	
	public boolean isCorrectPw(String memberPw) {
		return false;
	}
	
	public boolean isCorrectAnswer(String answer) {
		return false;
	}
	
	public boolean isCorrectNickname(String nickname) {
		return false;
	}
	
	public boolean isCorrectImage(Integer image) {
		return false;
	}
	
	
	
}