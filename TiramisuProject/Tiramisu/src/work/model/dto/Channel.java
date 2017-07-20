package work.model.dto;

/**
 * ä�� ä��ID : ������ + �����̸Ӹ� ä�θ� : 20��
 * 
 * @author cse
 *
 */

public class Channel {

	private String channelName;

	private String teamName;

	/**
	 * Channel �⺻ ������
	 */
	public Channel() {
		super();
	}

	/**
	 * Channel �ʼ� / ��� ������ ������
	 */
	public Channel(String channelName, String teamName) {
		super();
		this.channelName = channelName;
		this.teamName = teamName;
	}

	public String getChannelName() {
		return channelName;
	}

	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(channelName);
		builder.append(", ");
		builder.append(teamName);
		return builder.toString();
	}
}
