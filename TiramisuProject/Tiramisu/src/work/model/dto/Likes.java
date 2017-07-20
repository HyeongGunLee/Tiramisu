package work.model.dto;

/**
 * 좋아요
 * 다이얼로그ID : 다이얼로그 릴레이션의 ID명 레퍼런스
 * 추천자 : 회원 릴레이션의 닉네임 레퍼런스
 * 프라이머리(추천자,다이얼로그ID)
 * @author cse
 *
 */
public class Likes {
	
	private int dialogId;
	
	private String liker;

	/**
	 * Likes 기본 생성자
	 */
	public Likes() {
		super();
	}

	/**
	 * Likes 필수 / 모든 데이터 생성자
	 * @param dialogId
	 * @param liker
	 */
	public Likes(int dialogId, String liker) {
		super();
		this.dialogId = dialogId;
		this.liker = liker;
	}

	/**
	 * 좋아요 누른 사람만 생성
	 * @param liker
	 */
	public Likes(String liker) {
		super();
		this.liker = liker;
	}

	/**
	 * @return the dialogId
	 */
	public int getDialogId() {
		return dialogId;
	}

	/**
	 * @param dialogId the dialogId to set
	 */
	public void setDialogId(int dialogId) {
		this.dialogId = dialogId;
	}

	/**
	 * @return the liker
	 */
	public String getLiker() {
		return liker;
	}

	/**
	 * @param liker the liker to set
	 */
	public void setLiker(String liker) {
		this.liker = liker;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(dialogId);
		builder.append(", ");
		builder.append(liker);
		return builder.toString();
	}
	
	
	

}
