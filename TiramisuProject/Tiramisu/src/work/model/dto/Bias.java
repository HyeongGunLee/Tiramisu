package work.model.dto;
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
 
 private int voteId;
 
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
  * 시퀀스 생성자
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
