package work.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import work.model.dto.TeamMember;

public class TeamMemberDao {
	private FactoryDao factory = FactoryDao.getInstance();
	private Connection conn = null;
	private Statement stmt = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	
	public Connection getConnection() {
		return factory.getConnection();
	}
	
	public int insert(TeamMember dto) {
		String sql = "insert into team_member values(?,?)";
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getTeamName());
			pstmt.setString(2, dto.getNickname());
			
			return pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Debug(TeamMember Insert Error: " + e.getMessage());
		} finally {
			factory.close(rs, pstmt, conn);
		}
		return 0;
	}
	
	
	public int insert(String teamName, String nickname) {
		String sql = "insert into team_member values(?,?)";
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, teamName);
			pstmt.setString(2, nickname);
			
			return pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Debug(TeamMember Insert Error: " + e.getMessage());
		} finally {
			factory.close(rs, pstmt, conn);
		}
		return 0;
	}
	
	public int delete(String teamName, String nickName) {
		String sql = "delete team_member where team_name=? and nickname=?";
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, teamName);
			pstmt.setString(2, nickName);
			
			return pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Debug(TeamMember Delete Error: " + e.getMessage());
		} finally {
			factory.close(rs, pstmt, conn);
		}
		return 0;
	}
	/* teamName에 포함된 member들의 nickname 검색 */
	public ArrayList<String> selectTeamMember(String teamName) {
		ArrayList<String> list = new ArrayList<String>();
		String sql = "select * from team_member";
		try {
			conn = getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			String nickname = null;
			
			while(rs.next()) {
				nickname = rs.getString("nickname");
				list.add(nickname);	
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Debug(TeamMember SelectTeamMember() Error: " + e.getMessage());
		} finally {
			factory.close(rs, stmt, conn);
		}
		return list;
	}
	/* nickname으로 TeamName 검색 */
	public ArrayList<String> selectTeamList(String nickname) {
		ArrayList<String> list = new ArrayList<String>();
		String sql = "select team_name from team_member where nickname=?";
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, nickname);
			rs = pstmt.executeQuery();
			String teamName = null;
			
			while(rs.next()) {
				teamName = rs.getString("team_name");
				list.add(teamName);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Debug(TeamMember selectTeamList Error: " + e.getMessage());
		} finally {
			factory.close(rs, pstmt, conn);
		}
		return null;
	}
	
	public int update(String teamName, String nickname) {
		StringBuilder sql = new StringBuilder();
		sql.append("update team_member set ");
		sql.append("nickname=? ");
		sql.append("where team_name=?");
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql.toString());
			pstmt.setString(1, nickname);
			pstmt.setString(2, teamName);
			
			return pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Debug(TeamMember Update Error: " + e.getMessage());
		} finally {
			factory.close(rs, pstmt, conn);
		}
		return 0;
	}

}
