package work.model.dto;

/**
 * 의견
 * 닉네임 : 회원 릴레이션의 닉네임 레퍼런스
 * 경향ID : 경향 릴레이션의 경향ID 래퍼런스
 * 프라이머리(경향ID,닉네임)
 * 내용 : 200자
 * @author cse
 *
 */
public class Opinion {
	
	private String nickname;
	
	private int biasId;
	
	private String content;

	/**
	 * Opinion 기본 생성자
	 */
	public Opinion() {
		super();
	}

	/**
	 * Opinion 필수 / 모든데이터 생성자
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
