package dto;

/**
 * 파일 => 다이얼로그와 식별관계
 * ID : 시퀀스 + 프라이머리
 * 파일명 : 200자
 * @author cse
 *
 */
public class Files {
	
	private int fileId;
	
	private String fileName;

	/**
	 *  Files 기본 생성자
	 */
	public Files() {
		super();
	}

	/**
	 * Files 필수 / 모든 데이터 생성자
	 * @param fileId
	 * @param fileName
	 */
	public Files(int fileId, String fileName) {
		super();
		this.fileId = fileId;
		this.fileName = fileName;
	}

	/**
	 * @return the fileId
	 */
	public int getFileId() {
		return fileId;
	}

	/**
	 * @param fileId the fileId to set
	 */
	public void setFileId(int fileId) {
		this.fileId = fileId;
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
		builder.append(fileId);
		builder.append(", ");
		builder.append(fileName);
		return builder.toString();
	}	
}