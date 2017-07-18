package dto;

/**
 * �޽��� => ���� ����
 * ID : ������ + �����̸Ӹ�
 * ���� : 1000��
 * �ۼ��� : ȸ�� �����̼��� �г��� ���۷���
 * �ۼ��� : Date
 * ������ : ȸ�� �����̼��� �г��� ���۷���
 * Ȯ�� : �ο︰��
 * @author cse
 *
 */
public class Message {
	private int messageId;
	
	private String content;
	
	private String writer;
	
	private String writeDate;
	
	private String receiver;
	
	private String confirm ;

	/**
	 * Message �⺻ ������
	 */
	public Message() {
		super();
	}

	/**
	 * Message �ʼ�/��� ������ ������
	 * @param messageId
	 * @param content
	 * @param writer
	 * @param writeDate
	 * @param receiver
	 * @param confirm
	 */
	public Message(int messageId, String content, String writer, String writeDate, String receiver, String confirm) {
		super();
		this.messageId = messageId;
		this.content = content;
		this.writer = writer;
		this.writeDate = writeDate;
		this.receiver = receiver;
		this.confirm = confirm;
	}

	/**
	 * @return the messageId
	 */
	public int getmessageId() {
		return messageId;
	}

	/**
	 * @param messageId the messageId to set
	 */
	public void setmessageId(int messageId) {
		this.messageId = messageId;
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
	 * @return the writeDate
	 */
	public String getwriteDate() {
		return writeDate;
	}

	/**
	 * @param writeDate the writeDate to set
	 */
	public void setwriteDate(String writeDate) {
		this.writeDate = writeDate;
	}

	/**
	 * @return the receiver
	 */
	public String getReceiver() {
		return receiver;
	}

	/**
	 * @param receiver the receiver to set
	 */
	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}

	/**
	 * @return the confirm
	 */
	public String isConfirm() {
		return confirm;
	}

	/**
	 * @param confirm the confirm to set
	 */
	public void setConfirm(String confirm) {
		this.confirm = confirm;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(messageId);
		builder.append(", ");
		builder.append(content);
		builder.append(", ");
		builder.append(writer);
		builder.append(", ");
		builder.append(writeDate);
		builder.append(", ");
		builder.append(receiver);
		builder.append(", ");
		builder.append(confirm);
		return builder.toString();
	}
	
	
	
	
	
	
}
