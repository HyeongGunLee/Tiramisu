package work.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import work.model.dto.Vote;


public class VoteDao {
	
	private FactoryDao factory = FactoryDao.getInstance();
	private Connection conn = null;
	private Statement stmt = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	
	
	public Connection getConnection() {
		return factory.getConnection();
	}
	
	public int insert(Vote dto) {
		String sql = "insert into vote values(?,?,?)";
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, dto.getVoteId());
			pstmt.setString(2, dto.getNickname());
			pstmt.setString(3, dto.getTeamName());
			
			return pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Debug(Vote Insert Error: " + e.getMessage());
		} finally {
			factory.close(rs, pstmt, conn);
		}
		return 0;
	}
	
	public int delete(int voteId) {
		String sql = "delete vote where vote_id=?";
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, voteId);
			
			return pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Debug(Vote Delete Error: " + e.getMessage());
		} finally {
			factory.close(rs, pstmt, conn);
		}
		return 0;
	}
	
	
	public Vote selectOne(int voteId) {
		String sql = "select * from vote where vote_id=?";
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, voteId);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				voteId = rs.getInt("vote_id");
				String nickname = rs.getString("nickname");
				String teamName = rs.getString("team_name");
				
				return new Vote(voteId, nickname, teamName);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Debug(Vote SelectOne Error: " + e.getMessage());
		} finally {
			factory.close(rs, pstmt, conn);
		}
		return null;
	}
	
	public ArrayList<Vote> selectAll() {
		ArrayList<Vote> list = new ArrayList<Vote>();
		String sql = "select * from vote";
		try {
			conn = getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			Vote dto = null;
			
			while(rs.next()) {
				int voteId = rs.getInt("vote_id");
				String nickname = rs.getString("nickname");
				String teamName = rs.getString("team_name");
				
				dto = new Vote(voteId, nickname, teamName);
				list.add(dto);	
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Debug(Vote SelectAll() Error: " + e.getMessage());
		} finally {
			factory.close(rs, stmt, conn);
		}
		return list;
	}
	
	public int update(Vote dto) {
		StringBuilder sql = new StringBuilder();
		sql.append("update vote set ");
		sql.append("nickname=?, team_name=? ");
		sql.append("where vote_id=?");
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql.toString());
			pstmt.setString(1, dto.getNickname());
			pstmt.setString(2, dto.getTeamName());
			pstmt.setInt(3, dto.getVoteId());
			
			return pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Debug(Vote Update Error: " + e.getMessage());
		} finally {
			factory.close(rs, pstmt, conn);
		}
		return 0;
	}
}
