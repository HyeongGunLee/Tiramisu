package work.model.dto;

/**
 * ���ƿ�
 * ���̾�α�ID : ���̾�α� �����̼��� ID�� ���۷���
 * ��õ�� : ȸ�� �����̼��� �г��� ���۷���
 * �����̸Ӹ�(��õ��,���̾�α�ID)
 * @author cse
 *
 */
public class Likes {
	
	private int dialogId;
	
	private String liker;

	/**
	 * Likes �⺻ ������
	 */
	public Likes() {
		super();
	}

	/**
	 * Likes �ʼ� / ��� ������ ������
	 * @param dialogId
	 * @param liker
	 */
	public Likes(int dialogId, String liker) {
		super();
		this.dialogId = dialogId;
		this.liker = liker;
	}

	/**
	 * ���ƿ� ���� ����� ����
	 * @param liker
	 */
	public Likes(String liker) {
		super();
		this.liker = liker;
	}

	/**
	 * @return the dialogId
	 */
	public int getDialogId() {
		return dialogId;
	}

	/**
	 * @param dialogId the dialogId to set
	 */
	public void setDialogId(int dialogId) {
		this.dialogId = dialogId;
	}

	/**
	 * @return the liker
	 */
	public String getLiker() {
		return liker;
	}

	/**
	 * @param liker the liker to set
	 */
	public void setLiker(String liker) {
		this.liker = liker;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(dialogId);
		builder.append(", ");
		builder.append(liker);
		return builder.toString();
	}
	
	
	

}
