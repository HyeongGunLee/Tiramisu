package work.model.dto;
/**
 * 알림
 * ID : 시퀀스 + 프라이머리
 * 팀명 : 팀 릴레이션의 팀명 레퍼런스
 * 작성일 : Date
 * 내용 : 50자
 * @author cse
 *
 */

public class Notification {
	
	private int notificationId;
	
	private String teamName;
	
	private String writeDate;
	
	private String writer;
	
	private String content;

	/**
	 * Notification 기본 생성자
	 */
	public Notification() {
		super();
	}

	/**
	 * Notification 필수 / 모든 데이터 생성자
	 * @param notificationId
	 * @param teamName
	 * @param writeDate
	 * @param writer
	 * @param content
	 */
	public Notification(int notificationId, String teamName, String writeDate, String writer, String content) {
		super();
		this.notificationId = notificationId;
		this.teamName = teamName;
		this.writeDate = writeDate;
		this.writer = writer;
		this.content = content;
	}

	/**
	 * @return the notificationId
	 */
	public int getNotificationId() {
		return notificationId;
	}

	/**
	 * @param notificationId the notificationId to set
	 */
	public void setNotificationId(int notificationId) {
		this.notificationId = notificationId;
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
	 * @return the writeDate
	 */
	public String getWriteDate() {
		return writeDate;
	}

	/**
	 * @param writeDate the writeDate to set
	 */
	public void setWriteDate(String writeDate) {
		this.writeDate = writeDate;
	}

	/**
	 * @return the writer
	 */
	public String getWriter() {
		return writer;
	}

	/**
	 * @param writer the writer to set
	 */
	public void setWriter(String writer) {
		this.writer = writer;
	}

	/**
	 * @return the content
	 */
	public String getContent() {
		return content;
	}

	/**
	 * @param content the content to set
	 */
	public void setContent(String content) {
		this.content = content;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(notificationId);
		builder.append(", ");
		builder.append(teamName);
		builder.append(", ");
		builder.append(writeDate);
		builder.append(", ");
		builder.append(writer);
		builder.append(", ");
		builder.append(content);
		return builder.toString();
	}
	
	
	
	
}
