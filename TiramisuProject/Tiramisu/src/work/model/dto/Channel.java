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
	 */
	public Channel(int channelId, String channelName) {
		super();
		this.channelId = channelId;
		this.channelName = channelName;
	}

	/**
	 * @return the channelId
	 */
	public int getChannelId() {
		return channelId;
	}

	/**
	 * @param channelId the channelId to set
	 */
	public void setChannelId(int channelId) {
		this.channelId = channelId;
	}

	/**
	 * @return the channelName
	 */
	public String getChannelName() {
		return channelName;
	}

	/**
	 * @param channelName the channelName to set
	 */
	public void setChannelName(String channelName) {
		this.channelName = channelName;
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
		return builder.toString();
	}
	
	
	
	

}
