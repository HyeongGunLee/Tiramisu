package work.model.dto;
/**
 * ����(bias)
 * ����ID(bias_id)
 * ��ǥID(opinion_id)
 * �����(bias_name)
 * @author cse
 *
 */
public class Bias {

 private int biasId;
 
 private int voteId;
 
 private String biasName;

 /**
  * Bias �⺻ ������
  */
 public Bias() {
  super();
 }

 /**
  * Bias �ʼ� / ��� ������ ������
  * @param biasId
  * @param voteId
  * @param biasName
  */
 public Bias(int biasId, int voteId, String biasName) {
  super();
  this.biasId = biasId;
  this.voteId = voteId;
  this.biasName = biasName;
 }

 /**
  * ������ ������
  * @param voteId
  * @param biasName
  */
 public Bias(int voteId, String biasName) {
  super();
  this.voteId = voteId;
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
  * @return the voteId
  */
 public int getVoteId() {
  return voteId;
 }

 /**
  * @param voteId the voteId to set
  */
 public void setVoteId(int voteId) {
  this.voteId = voteId;
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
  builder.append(voteId);
  builder.append(", ");
  builder.append(biasName);
  return builder.toString();
 }
 
 
 
 
}
