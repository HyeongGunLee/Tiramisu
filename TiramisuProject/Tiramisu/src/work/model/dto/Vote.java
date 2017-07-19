package work.model.dto;

/**
 * 투표
 * ID : 시퀀스 + 프라이머리
 * 투표명 : 20자
 * 팀명 : 팀 릴레이션의 팀명 레퍼런스
 * @author cse
 *
 */

public class Vote {
 
 private int voteId; 
 
 private String voteName; //투표명
 
 private String teamName;

 /**
  * Vote 기본 생성자
  */
 public Vote() {
  super();
 }

 /**
  * Vote 필수 / 모든 데이터 생성자
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
  * 시퀀스 생성자
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
