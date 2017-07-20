package work.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import work.model.dto.Member;
import work.model.dto.Team;

/**
 * TeamDao 
 * @author henry!
 *
 */
public class TeamDao {
	private FactoryDao factory = FactoryDao.getInstance();
	private Connection conn = null;
	private Statement stmt = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	
	public Connection getConnection() {
		return factory.getConnection();
	}
	
	public int insert(Team dto) {
		String sql = "insert into team values(?,?,?)";
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getTeamName());
			pstmt.setString(2, dto.getSubject());
			pstmt.setString(3,  dto.getOpen());
			
			return pstmt.executeUpdate();
		}catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Debug(Team Insert Error: " + e.getMessage());
		} finally {
			factory.close(rs, pstmt, conn);
		}
		return 0;
	}
	
	public int delete(String teamName) {
		String sql = "delete team where team_name=?";
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, teamName);
			
			return pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Debug(Team Delete Error: " + e.getMessage());
		} finally {
			factory.close(rs, pstmt, conn);
		}
		return 0;
	}
	
	public Team selectOne(String teamName) {
		String sql = "select * from team where team_name=?";
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, teamName);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				teamName = rs.getString("team_name");
				String subject = rs.getString("subject");
				String open = rs.getString("open");
				
				return new Team(teamName, subject, open);	
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Debug(Team SelectOne Error: " + e.getMessage());
		} finally {
			factory.close(rs, pstmt, conn);
		}
		return null;
	}
	
	public ArrayList<Team> selectAll() {
		ArrayList<Team> list = new ArrayList<Team>();
		String sql = "select * from team";
		try {
			conn = getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			Team dto = null;
			
			while(rs.next()) {
				String teamName = rs.getString("team_name");
				String subject = rs.getString("subject");
				String open = rs.getString("open");
				dto = new Team(teamName, subject, open);
				list.add(dto);	
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Debug(Team SelectAll() Error: " + e.getMessage());
		} finally {
			factory.close(rs, stmt, conn);
		}
		return list;
	}
	
	public int update(Team dto) {
		StringBuilder sql = new StringBuilder();
		sql.append("update team set ");
		sql.append("subject=?, open=? ");
		sql.append("where team_name=?");
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql.toString());
			pstmt.setString(1, dto.getSubject());
			pstmt.setString(2, dto.getOpen());
			pstmt.setString(3, dto.getTeamName());
			
			return pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Debug(Team Update Error: " + e.getMessage());
		} finally {
			factory.close(rs, pstmt, conn);
		}
		return 0;
	}
	
	public int setOpen(String teamName) {
		StringBuilder sql = new StringBuilder();
		sql.append("update team set ");
		sql.append("open=? ");
		sql.append("where team_name=?");
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql.toString());
			pstmt.setString(1, "TRUE");
			pstmt.setString(2, teamName);
			
			return pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Debug(Team setOpen Error: " + e.getMessage());
		} finally {
			factory.close(rs, pstmt, conn);
		}
		return 0;
	}
	
	public boolean isOpen(String open) {
		if(open.toUpperCase().equals("TRUE")) {
			return true;
		}
		return false;
	}
}
