/**
 * Dummy Class ������.
 */

package work.model.service;

import java.util.ArrayList;
import java.util.Random;

public class MemberService {
	public static MemberService instance = new MemberService();
	
	private MemberService(){
		
	}
	
	public static MemberService getInstance(){
		return instance;
	}

	public boolean loginCheck(String memberId, String memberPw) {
		return true;
	}

	public boolean idUniqueTest(String memberId) {
		return true;
	}

	public boolean passwordVerifiedTest(String memberPw, String memberPwV) {
		return true;
	}

	public boolean insertMember(String memberId, String memberPw, String question, String answer, String nickname,
			String imagePath) {
		return true;
	}

	public boolean editMember(String memberPw, String imagePath, String nickname, String question, String answer) {
		return true;
	}

	public String bringId(String nickname, String question, String answer) {
		return null;
	}

	public boolean idExist(String memberId, String question, String answer) {
		return true;
	}

	/**
	 * ���� ����
	 * 
	 * @return n��由ъ�� �レ�� ���� ����
	 */
	public String randomN(int n) {
		return new Random().nextInt(10 * n) + "";
	}

	public boolean editMemberPw(String memberId, String newMemberPw) {
		return true;
	}
	
	public ArrayList<String> memberHaveTeam(String memberId){
		ArrayList<String> tmp = new ArrayList<>();
		tmp.add("WebProject");
		tmp.add("공공데이터 공모전2");
		tmp.add("보쌈 부서");
		return tmp;
	}

	public String memberIdToNickname(String memberId) {
		return "변다영";
	}
}