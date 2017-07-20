package work.model.dto;

/**
 * ID : 시퀀스 + 프라이머리 팀명 : 팀 릴레이션의 팀명 레퍼런스 작성일 : Date 작성자 : 회원 릴레이션의 닉네임 레퍼런스 내용 :
 * 100자
 * 
 * @author cse
 *
 */
public class Notice {

	private int noticeId;

	private String teamName;

	private String writeDate;

	private String writer;

	private String content;

	/**
	 * Notice 기본 생성자
	 */
	public Notice() {
		super();
	}

	/**
	 * Notice 필수 / 모든 데이터 생성자
	 * 
	 * @param noticeId
	 * @param teamName
	 * @param writeDate
	 * @param writer
	 * @param content
	 */
	public Notice(int noticeId, String teamName, String writeDate, String writer, String content) {
		super();
		this.noticeId = noticeId;
		this.teamName = teamName;
		this.writeDate = writeDate;
		this.writer = writer;
		this.content = content;
	}

	/*
	 * 시퀀스 sysdate
	 */
	public Notice(String teamName, String writeDate, String writer, String content) {
		super();
		this.teamName = teamName;
		this.writeDate = writeDate;
		this.writer = writer;
		this.content = content;
	}
	/*
	 * 시퀀스 sysdate
	 */
	public Notice(String teamName,  String writer, String content) {
		super();
		this.teamName = teamName;
		this.writer = writer;
		this.content = content;
	}

	/**
	 * @return the noticeId
	 */
	public int getNoticeId() {
		return noticeId;
	}

	/**
	 * @param noticeId
	 *            the noticeId to set
	 */
	public void setNoticeId(int noticeId) {
		this.noticeId = noticeId;
	}

	/**
	 * @return the teamName
	 */
	public String getTeamName() {
		return teamName;
	}

	/**
	 * @param teamName
	 *            the teamName to set
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
	 * @param writeDate
	 *            the writeDate to set
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
	 * @param writer
	 *            the writer to set
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
	 * @param content
	 *            the content to set
	 */
	public void setContent(String content) {
		this.content = content;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(noticeId);
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
