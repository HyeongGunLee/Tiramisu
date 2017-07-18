package dto;

/**
 * 투표
 * ID : 시퀀스 + 프라이머리
 * 투표명 : 20자
 * 팀명 : 팀 릴레이션의 팀명 레퍼런스
 * @author cse
 *
 */

public class Vote {
	
	private int voteId; 
	
	private String nickname;
	
	private String teamName;

	/**
	 * Vote 기본 생성자
	 */
	public Vote() {
		super();
	}

	/**
	 * Vote 필수 / 모든 데이터 생성자
	 * @param voteId
	 * @param nickname
	 * @param teamName
	 */
	public Vote(int voteId, String nickname, String teamName) {
		super();
		this.voteId = voteId;
		this.nickname = nickname;
		this.teamName = teamName;
	}

	/**
	 * @return the voteId
	 */
	public int getVoteId() {
		return voteId;
	}

	/**
	 * @param voteId the voteId to set
	 */
	public void setVoteId(int voteId) {
		this.voteId = voteId;
	}

	/**
	 * @return the nickname
	 */
	public String getNickname() {
		return nickname;
	}

	/**
	 * @param nickname the nickname to set
	 */
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	/**
	 * @return the teamName
	 */
	public String getTeamName() {
		return teamName;
	}

	/**
	 * @param teamName the teamName to set
	 */
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(voteId);
		builder.append(", ");
		builder.append(nickname);
		builder.append(", ");
		builder.append(teamName);
		return builder.toString();
	}
}
