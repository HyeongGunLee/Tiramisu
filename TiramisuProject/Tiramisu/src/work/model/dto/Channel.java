package work.model.dto;

/**
 * ä��
 * ä��ID : ������ + �����̸Ӹ�
 * ä�θ� : 20��
 * @author cse
 *
 */

public class Channel {
	
	private int channelId;
	
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
	 * @param channelId
	 * @param channelName
	 * @param teamName
	 */
	public Channel(int channelId, String channelName, String teamName) {
		super();
		this.channelId = channelId;
		this.channelName = channelName;
		this.teamName = teamName;
	}

	public int getChannelId() {
		return channelId;
	}



	public void setChannelId(int channelId) {
		this.channelId = channelId;
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



	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(channelId);
		builder.append(", ");
		builder.append(channelName);
		builder.append(", ");
		builder.append(teamName);
		return builder.toString();
	}
	
	
	
	

}
