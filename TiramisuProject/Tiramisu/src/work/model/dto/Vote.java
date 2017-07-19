package work.model.dto;

/**
 * ��ǥ
 * ID : ������ + �����̸Ӹ�
 * ��ǥ�� : 20��
 * ���� : �� �����̼��� ���� ���۷���
 * @author cse
 *
 */

public class Vote {
 
 private int voteId; 
 
 private String voteName; //��ǥ��
 
 private String teamName;

 /**
  * Vote �⺻ ������
  */
 public Vote() {
  super();
 }

 /**
  * Vote �ʼ� / ��� ������ ������
  * @param voteId
  * @param nickname
  * @param teamName
  */
 public Vote(int voteId, String voteName, String teamName) {
  super();
  this.voteId = voteId;
  this.voteName = voteName;
  this.teamName = teamName;
 }
 
 /**
  * ������ ������
  * @param voteName
  * @param teamName
  */

 public Vote(String voteName, String teamName) {
  super();
  this.voteName = voteName;
  this.teamName = teamName;
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
  * @return the nickname
  */
 public String getVoteName() {
  return voteName;
 }

 /**
  * @param nickname the nickname to set
  */
 public void setVoteName(String voteName) {
  this.voteName = voteName;
 }

 /**
  * @return the teamName
  */
 public String getTeamName() {
  return teamName;
 }

 /**
  * @param teamName the teamName to set
  */
 public void setTeamName(String teamName) {
  this.teamName = teamName;
 }

 /* (non-Javadoc)
  * @see java.lang.Object#toString()
  */
 @Override
 public String toString() {
  StringBuilder builder = new StringBuilder();
  builder.append(voteId);
  builder.append(", ");
  builder.append(voteName);
  builder.append(", ");
  builder.append(teamName);
  return builder.toString();
 }
}
