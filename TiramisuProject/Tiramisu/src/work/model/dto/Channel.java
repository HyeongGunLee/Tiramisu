package work.model.dto;

/**
 * 채널
 * 채널ID : 시퀀스 + 프라이머리
 * 채널명 : 20자
 * @author cse
 *
 */

public class Channel {
	
	private int channelId;
	
	private String channelName;
	
	private String teamName;

	/**
	 * Channel 기본 생성자
	 */
	public Channel() {
		super();
	}

	

	/**
	 * Channel 필수 / 모든 데이터 생성자
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
