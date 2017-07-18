package dto;

/**
 * 경향(bias)
 * 경향ID(bias_id)
 * 투표ID(opinion_id)
 * 경향명(bias_name)
 * @author cse
 *
 */
public class Bias {

	private int biasId;
	
	private int opinionId;
	
	private String biasName;

	/**
	 * Bias 기본 생성자
	 */
	public Bias() {
		super();
	}

	/**
	 * Bias 필수 / 모든 데이터 생성자
	 * @param biasId
	 * @param opinionId
	 * @param biasName
	 */
	public Bias(int biasId, int opinionId, String biasName) {
		super();
		this.biasId = biasId;
		this.opinionId = opinionId;
		this.biasName = biasName;
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
	 * @return the opinionId
	 */
	public int getOpinionId() {
		return opinionId;
	}

	/**
	 * @param opinionId the opinionId to set
	 */
	public void setOpinionId(int opinionId) {
		this.opinionId = opinionId;
	}

	/**
	 * @return the biasName
	 */
	public String getBiasName() {
		return biasName;
	}

	/**
	 * @param biasName the biasName to set
	 */
	public void setBiasName(String biasName) {
		this.biasName = biasName;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(biasId);
		builder.append(", ");
		builder.append(opinionId);
		builder.append(", ");
		builder.append(biasName);
		return builder.toString();
	}
	
	
	
	
}
