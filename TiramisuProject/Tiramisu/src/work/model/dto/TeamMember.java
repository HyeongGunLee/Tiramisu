package work.model.dto;

/**
 * ���� ���� ȸ��
 * ���� : �� �����̼��� ���� ���۷���
 * �г��� : ȸ�� �����̼��� �г��� ���۷���
 * �����̸Ӹ�(����,�г���)
 * @author cse
 *
 */
public class TeamMember {
	
	private String teamName;
	
	private String nickname;

	/**
	 * TeamMember �⺻ ������
	 */
	public TeamMember() {
		super();
	}

	/**
	 * TeamMember �ʼ� / ��� ������ ������
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
