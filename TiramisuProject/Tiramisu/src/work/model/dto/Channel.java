package work.model.dto;

/**
 * 채널 채널ID : 시퀀스 + 프라이머리 채널명 : 20자
 * 
 * @author cse
 *
 */

public class Channel {

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
