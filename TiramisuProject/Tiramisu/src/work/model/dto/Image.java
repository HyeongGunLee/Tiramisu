package dto;

/**
 * 사진
 * ID : 시퀀스 + 프라이머리
 * 파일명 : 200자
 * @author cse
 *
 */
public class Image {
	
	private int imageId;
	
	private String fileName;

	/**
	 * Image 기본 생성자
	 */
	public Image() {
		super();
	}

	/**
	 * Image 필수 / 모든 데이터 생성자
	 * @param imageId
	 * @param fileName
	 */
	public Image(int imageId, String fileName) {
		super();
		this.imageId = imageId;
		this.fileName = fileName;
	}

	/**
	 * @return the imageId
	 */
	public int getImageId() {
		return imageId;
	}

	/**
	 * @param imageId the imageId to set
	 */
	public void setImageId(int imageId) {
		this.imageId = imageId;
	}

	/**
	 * @return the fileName
	 */
	public String getFileName() {
		return fileName;
	}

	/**
	 * @param fileName the fileName to set
	 */
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	/* (non-Javadoc)
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
