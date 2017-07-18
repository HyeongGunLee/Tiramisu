package work.model.dto;

/**
 * ID : ������ + �����̸Ӹ�
 * ä��ID : ä�� �����̼��� ä��ID ���۷���
 * ���� : 300��
 * �ۼ��� : ȸ�� �����̼��� �г��� ���۷���
 * �ۼ��� : Date
 * ����ID : ���� �����̼��� ID ���۷��� + null��� + null default
 * @author cse
 *
 */
public class Dialog {
	
	private int dialogId;
	
	private int channelId;
	
	private String content;
	
	private String writer;
	
	private String writeDate;
	
	private int fileId;

	/**
	 * Dialog �⺻ ������
	 */
	public Dialog() {
		super();
	}

	/**
	 * Dialog �ʼ� ������ ������
	 * @param dialogId
	 * @param channelId
	 * @param content
	 * @param writer
	 * @param writeDate
	 */
	public Dialog(int dialogId, int channelId, String content, String writer, String writeDate) {
		super();
		this.dialogId = dialogId;
		this.channelId = channelId;
		this.content = content;
		this.writer = writer;
		this.writeDate = writeDate;
	}

	/**
	 * Dialog ��� ������ ������
	 * @param dialogId
	 * @param channelId
	 * @param content
	 * @param writer
	 * @param writeDate
	 * @param fileId
	 */
	public Dialog(int dialogId, int channelId, String content, String writer, String writeDate, int fileId) {
		super();
		this.dialogId = dialogId;
		this.channelId = channelId;
		this.content = content;
		this.writer = writer;
		this.writeDate = writeDate;
		this.fileId = fileId;
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

	public String getwriteDate() {
		return writeDate;
	}

	public void setwriteDate(String writeDate) {
		this.writeDate = writeDate;
	}

	public int getfileId() {
		return fileId;
	}

	public void setfileId(int fileId) {
		this.fileId = fileId;
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
		builder.append(writeDate);
		builder.append(", ");
		builder.append(fileId);
		return builder.toString();
	}
	
	
	
	
	
	
	
	
	
	
}