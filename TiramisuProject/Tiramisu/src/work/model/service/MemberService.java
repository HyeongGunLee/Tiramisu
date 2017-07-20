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
	 * Id가 정확한지 확인하는 메소드
	 * id 4~10글자 소문자만 허용
	 * @
	 * 도메인 길이 '.'있는지 확인
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
	 * pw가 정확한지 확인하는 메소드
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
	 * 답변의 길이가 1자 이상 20자 이하 인지 확인하는 메소드
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
	 * 닉네임의 길이가 정확한지 확인하는 메소드 
	 * 닉네임의 유니크는 디비에서 확인?
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
	 * 멤버를 불러와서 닉네임이랑 확인후 닉네임이 있으면 false 리턴 없으면 true 리턴
	 * 닉네임 있는지 없는지 확인가능
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
	 * checkNicknameLength + checkNicknameIsUnique 을 이용해서 닉네임의 사용가능을 체크하는 메소드
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
	 * 스트링 타입의 불린값을 넣으면 불린 데이터로 변환하는 메소드 
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
	 * checkNicknameIsUnique 와 반대 있으면 true //가독성때매 추가 
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