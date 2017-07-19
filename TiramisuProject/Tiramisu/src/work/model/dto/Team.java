package work.model.dto;

/**
 * ��
 * ���� : 20�� + �����̸Ӹ�
 * ���� : 50�� + null���
 * ������ : �ο︰�� (�� ����/����� ����)
 * @author cse
 *
 */
public class Team {
	
	private String teamName;
	
	private String subject;
	
	private String open ;

	/**
	 * Team �⺻ ������
	 */
	public Team() {
		super();
	}

	/**
	 * Team �ʼ� ������ ������
	 * @param teamName
	 * @param open
	 */
	public Team(String teamName, String open) {
		super();
		this.teamName = teamName;
		this.open = open;
	}

	/**
	 * Team ��� ������ ������
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
