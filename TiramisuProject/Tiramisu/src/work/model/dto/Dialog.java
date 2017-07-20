package work.model.dto;

/**
 * ID : ������ + �����̸Ӹ� ä��ID : ä�� �����̼��� ä��ID ���۷��� ���� : 300�� �ۼ��� : ȸ�� �����̼��� �г��� ���۷���
 * �ۼ��� : Date ����ID : ���� �����̼��� ID ���۷��� + null��� + null default
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
	 * Dialog �⺻ ������
	 */
	public Dialog() {
		super();
	}

	/**
	 * Dialog �ʼ� ������ ������
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
	 * Dialog ��� ������ ������
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
	 * ������ ������
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
	 * ������ ������
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
