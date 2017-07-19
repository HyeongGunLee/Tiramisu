package work.model.dto;

/**
 * 팀에 속한 회원
 * 팀명 : 팀 릴레이션의 팀명 레퍼런스
 * 닉네임 : 회원 릴레이션의 닉네임 레퍼런스
 * 프라이머리(팀명,닉네임)
 * @author cse
 *
 */
public class TeamMember {
	
	private String teamName;
	
	private String nickname;

	/**
	 * TeamMember 기본 생성자
	 */
	public TeamMember() {
		super();
	}

	/**
	 * TeamMember 필수 / 모든 데이터 생성자
	 * @param teamName
	 * @param nickname
	 */
	public TeamMember(String teamName, String nickname) {
		super();
		this.teamName = teamName;
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

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(teamName);
		builder.append(", ");
		builder.append(nickname);
		return builder.toString();
	}
}
