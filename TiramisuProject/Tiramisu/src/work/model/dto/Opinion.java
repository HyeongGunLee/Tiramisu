package work.model.dto;

/**
 * �ǰ�
 * �г��� : ȸ�� �����̼��� �г��� ���۷���
 * ����ID : ���� �����̼��� ����ID ���۷���
 * �����̸Ӹ�(����ID,�г���)
 * ���� : 200��
 * @author cse
 *
 */
public class Opinion {
	
	private String nickname;
	
	private int biasId;
	
	private String content;

	/**
	 * Opinion �⺻ ������
	 */
	public Opinion() {
		super();
	}

	/**
	 * Opinion �ʼ� / ��絥���� ������
	 * @param nickname
	 * @param biasId
	 * @param content
	 */
	public Opinion(String nickname, int biasId, String content) {
		super();
		this.nickname = nickname;
		this.biasId = biasId;
		this.content = content;
	}

	/**
	 * @return the nickname
	 */
	public String getNickname() {
		return nickname;
	}

	/**
	 * @param nickname the nickname to set
	 */
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	/**
	 * @return the biasId
	 */
	public int getBiasId() {
		return biasId;
	}

	/**
	 * @param biasId the biasId to set
	 */
	public void setBiasId(int biasId) {
		this.biasId = biasId;
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
		builder.append(nickname);
		builder.append(", ");
		builder.append(biasId);
		builder.append(", ");
		builder.append(content);
		return builder.toString();
	}
}
