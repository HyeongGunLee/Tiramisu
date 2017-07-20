package work.model.dto;

/**
 * ���� ID : ������ + �����̸Ӹ� ���ϸ� : 200��
 * 
 * @author cse
 *
 */
public class Image {

	private Integer imageId;

	private String fileName;

	/**
	 * Image �⺻ ������
	 */
	public Image() {
		super();
	}

	/**
	 * Image �ʼ� / ��� ������ ������
	 * 
	 * @param imageId
	 * @param fileName
	 */
	public Image(Integer imageId, String fileName) {
		super();
		this.imageId = imageId;
		this.fileName = fileName;
	}

	/**
	 * ������ ������
	 * 
	 * @param fileName
	 */

	public Image(String fileName) {
		super();
		this.fileName = fileName;
	}

	/**
	 * @return the imageId
	 */
	public Integer getImageId() {
		return imageId;
	}

	/**
	 * @param imageId
	 *            the imageId to set
	 */
	public void setImageId(Integer imageId) {
		this.imageId = imageId;
	}

	/**
	 * @return the fileName
	 */
	public String getFileName() {
		return fileName;
	}

	/**
	 * @param fileName
	 *            the fileName to set
	 */
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(imageId);
		builder.append(", ");
		builder.append(fileName);
		return builder.toString();
	}
}
