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
	/* teamName�� ���Ե� member���� nickname �˻� */
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
	/* nickname���� TeamName �˻� */
	public String selectTeam(String nickname) {
		String sql = "select team_name from team_member where nickname=?";
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, nickname);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				String teamName = rs.getString("team_name");
				
				return teamName;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Debug(TeamMember selectTeam Error: " + e.getMessage());
		} finally {
			factory.close(rs, pstmt, conn);
		}
		return null;
	}

}