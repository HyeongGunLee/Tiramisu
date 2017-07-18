package dto;

/**
 * ���� => ���̾�α׿� �ĺ�����
 * ID : ������ + �����̸Ӹ�
 * ���ϸ� : 200��
 * @author cse
 *
 */
public class Files {
	
	private int fileId;
	
	private String fileName;

	/**
	 *  Files �⺻ ������
	 */
	public Files() {
		super();
	}

	/**
	 * Files �ʼ� / ��� ������ ������
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