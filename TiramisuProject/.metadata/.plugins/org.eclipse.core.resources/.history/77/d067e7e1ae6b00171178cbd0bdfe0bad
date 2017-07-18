package work.model.dto;

/**
 * ID : 시퀀스 + 프라이머리
 * 채널ID : 채널 릴레이션의 채널ID 레퍼런스
 * 내용 : 300자
 * 작성자 : 회원 릴레이션의 닉네임 레퍼런스
 * 작성일 : Date
 * 파일ID : 파일 릴레이션의 ID 레퍼런스 + null허용 + null default
 * @author cse
 *
 */
public class Dialog {
	
	private int dialogId;
	
	private int channelId;
	
	private String content;
	
	private String writer;
	
	private String write_date;
	
	private int file_id;

	/**
	 * Dialog 기본 생성자
	 */
	public Dialog() {
		super();
	}

	/**
	 * Dialog 필수 데이터 생성자
	 * @param dialogId
	 * @param channelId
	 * @param content
	 * @param writer
	 * @param write_date
	 */
	public Dialog(int dialogId, int channelId, String content, String writer, String write_date) {
		super();
		this.dialogId = dialogId;
		this.channelId = channelId;
		this.content = content;
		this.writer = writer;
		this.write_date = write_date;
	}

	/**
	 * Dialog 모든 데이터 생성자
	 * @param dialogId
	 * @param channelId
	 * @param content
	 * @param writer
	 * @param write_date
	 * @param file_id
	 */
	public Dialog(int dialogId, int channelId, String content, String writer, String write_date, int file_id) {
		super();
		this.dialogId = dialogId;
		this.channelId = channelId;
		this.content = content;
		this.writer = writer;
		this.write_date = write_date;
		this.file_id = file_id;
	}

	public int getDialogId() {
		return dialogId;
	}

	public void setDialogId(int dialogId) {
		this.dialogId = dialogId;
	}

	public int getChannelId() {
		return channelId;
	}

	public void setChannelId(int channelId) {
		this.channelId = channelId;
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

	public String getWrite_date() {
		return write_date;
	}

	public void setWrite_date(String write_date) {
		this.write_date = write_date;
	}

	public int getFile_id() {
		return file_id;
	}

	public void setFile_id(int file_id) {
		this.file_id = file_id;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(dialogId);
		builder.append(", ");
		builder.append(dialogId);
		builder.append(", ");
		builder.append(content);
		builder.append(", ");
		builder.append(writer);
		builder.append(", ");
		builder.append(write_date);
		builder.append(", ");
		builder.append(file_id);
		return builder.toString();
	}
	
	
	
	
	
	
	
	
	
	
}
