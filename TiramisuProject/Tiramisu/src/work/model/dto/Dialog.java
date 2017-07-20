package work.model.dto;

/**
 * ID : 시퀀스 + 프라이머리 채널ID : 채널 릴레이션의 채널ID 레퍼런스 내용 : 300자 작성자 : 회원 릴레이션의 닉네임 레퍼런스
 * 작성일 : Date 파일ID : 파일 릴레이션의 ID 레퍼런스 + null허용 + null default
 * 
 * @author cse
 *
 */
public class Dialog {

	private int dialogId;

	private String channelName;

	private String teamName;

	private String content;

	private String writer;

	private String writeDate;

	private int fileId = 1 ;

	/**
	 * Dialog 기본 생성자
	 */
	public Dialog() {
		super();
	}

	/**
	 * Dialog 필수 데이터 생성자
	 * 
	 * @param dialogId
	 * @param channelId
	 * @param content
	 * @param writer
	 * @param writeDate
	 */
	public Dialog(int dialogId, String channelName, String teamName, String content, String writer, String writeDate) {
		super();
		this.dialogId = dialogId;
		this.channelName = channelName;
		this.teamName = teamName;
		this.content = content;
		this.writer = writer;
		this.writeDate = writeDate;
	}

	/**
	 * Dialog 모든 데이터 생성자
	 * 
	 * @param dialogId
	 * @param channelId
	 * @param content
	 * @param writer
	 * @param writeDate
	 * @param fileId
	 */
	public Dialog(int dialogId, String channelName, String teamName, String content, String writer, String writeDate,
			int fileId) {
		super();
		this.dialogId = dialogId;
		this.channelName = channelName;
		this.teamName = teamName;
		this.content = content;
		this.writer = writer;
		this.writeDate = writeDate;
		this.fileId = fileId;
	}

	/**
	 * 시퀀스 생성자
	 * 
	 * @param channelId
	 * @param content
	 * @param writer
	 * @param fileId
	 */

	public Dialog(String channelName, String teamName, String content, String writer, String writeDate, int fileId) {
		super();
		this.channelName = channelName;
		this.teamName = teamName;
		this.content = content;
		this.writer = writer;
		this.writeDate = writeDate;
		this.fileId = fileId;
	}
	
	/**
	 * 시퀀스 생성자
	 * 
	 * @param channelId
	 * @param content
	 * @param writer
	 * @param fileId
	 */

	public Dialog(String channelName, String teamName, String content, String writer, String writeDate) {
		super();
		this.channelName = channelName;
		this.teamName = teamName;
		this.content = content;
		this.writer = writer;
		this.writeDate = writeDate;
		
	}

	public int getDialogId() {
		return dialogId;
	}

	public void setDialogId(int dialogId) {
		this.dialogId = dialogId;
	}

	public String getChannelName() {
		return this.channelName;
	}
	
	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}
	
	public String getTeamName()	{
		return this.teamName;
	}
	
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getWriteDate() {
		return writeDate;
	}

	public void setWriteDate(String writeDate) {
		this.writeDate = writeDate;
	}

	public int getFileId() {
		return fileId;
	}

	public void setFileId(int fileId) {
		this.fileId = fileId;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(dialogId);
		builder.append(", ");
		builder.append(channelName);
		builder.append(", ");
		builder.append(teamName);
		builder.append(", ");
		builder.append(content);
		builder.append(", ");
		builder.append(writer);
		builder.append(", ");
		builder.append(writeDate);
		builder.append(", ");
		builder.append(fileId);
		return builder.toString();
	}

}
