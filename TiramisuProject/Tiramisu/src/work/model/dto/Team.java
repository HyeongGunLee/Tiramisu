package work.model.dto;

/**
 * 팀
 * 팀명 : 20자 + 프라이머리
 * 주제 : 50자 + null허용
 * 공개도 : 부울린명 (팀 공개/비공개 설정)
 * @author cse
 *
 */
public class Team {
	
	private String teamName;
	
	private String subject;
	
	private String open ;

	/**
	 * Team 기본 생성자
	 */
	public Team() {
		super();
	}

	/**
	 * Team 필수 데이터 생성자
	 * @param teamName
	 * @param open
	 */
	public Team(String teamName, String open) {
		super();
		this.teamName = teamName;
		this.open = open;
	}

	/**
	 * Team 모든 데이터 생성자
	 * @param teamName
	 * @param subject
	 * @param open
	 */
	public Team(String teamName, String subject, String open) {
		super();
		this.teamName = teamName;
		this.subject = subject;
		this.open = open;
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
	 * @return the subject
	 */
	public String getSubject() {
		return subject;
	}

	/**
	 * @param subject the subject to set
	 */
	public void setSubject(String subject) {
		this.subject = subject;
	}

	/**
	 * @return the open
	 */
	public String getOpen() {
		return open;
	}

	/**
	 * @param open the open to set
	 */
	public void setOpen(String open) {
		this.open = open;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(teamName);
		builder.append(", ");
		builder.append(subject);
		builder.append(", ");
		builder.append(open);
		return builder.toString();
	}
}
