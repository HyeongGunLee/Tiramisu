/**
 * Dummy Class 입니다.
 */

package work.model.service;

public class MemberService {

	public boolean loginCheck(String memberId, String memberPw) {
		return true;
	}

	public boolean idUniqueTest(String memberId) {
		return true;
	}

	public boolean passwordVerifiedTest(String memberPw, String memberPwV) {
		return true;
	}
	
	public boolean insertMember(String memberId,String memberPw, String question,String answer,String nickname,String imagePath){
		return true;
	}

}
