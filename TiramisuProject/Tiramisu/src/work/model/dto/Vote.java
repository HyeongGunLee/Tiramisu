package dto;

/**
 * ��ǥ
 * ID : ������ + �����̸Ӹ�
 * ��ǥ�� : 20��
 * ���� : �� �����̼��� ���� ���۷���
 * @author cse
 *
 */

public class Vote {
	
	private int voteId; 
	
	private String nickname;
	
	private String teamName;

	/**
	 * Vote �⺻ ������
	 */
	public Vote() {
		super();
	}

	/**
	 * Vote �ʼ� / ��� ������ ������
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
