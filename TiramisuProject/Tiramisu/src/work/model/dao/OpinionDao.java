package work.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import work.model.dto.Member;
import work.model.dto.Opinion;

public class OpinionDao {
	
	private FactoryDao factory = FactoryDao.getInstance();
	private Connection conn = null;
	private Statement stmt = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	
	
	public Connection getConnection() {
		return factory.getConnection();
	}
	
	public int insert(Opinion dto) {
		String sql = "insert into opinion values(?,?,?)";
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getNickname());
			pstmt.setInt(2, dto.getBiasId());
			pstmt.setString(3, dto.getContent());
			
			return pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Debug(Opinion Insert Error: " + e.getMessage());
		} finally {
			factory.close(rs, pstmt, conn);
		}
		return 0;
	}
	
	public int delete(int biasId) {
		String sql = "delete opinion where bias_id=?";
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, biasId);
			
			return pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Debug(Opinion Delete Error: " + e.getMessage());
		} finally {
			factory.close(rs, pstmt, conn);
		}
		return 0;
	}
	
	public Opinion selectOne(int biasId) {
		String sql = "select * from opinion where bias_id=?";
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, biasId);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				String nickname = rs.getString("nickname");
				biasId = rs.getInt("bias_id");
				String content = rs.getString("content");
				
				return new Opinion(nickname, biasId, content);	
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Debug(Opinion SelectOne Error: " + e.getMessage());
		} finally {
			factory.close(rs, pstmt, conn);
		}
		return null;
	}
	
	public ArrayList<Opinion> selectAll() {
		ArrayList<Opinion> list = new ArrayList<Opinion>();
		String sql = "select * from opinion";
		try {
			conn = getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			Opinion dto = null;
			
			while(rs.next()) {
				String nickname = rs.getString("nickname");
				int biasId = rs.getInt("bias_id");
				String content = rs.getString("content");
				
				dto = new Opinion(nickname, biasId, content);
				list.add(dto);	
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Debug(Opinion SelectAll() Error: " + e.getMessage());
		} finally {
			factory.close(rs, stmt, conn);
		}
		return list;
	}
	
	public int update(Opinion dto) {
		StringBuilder sql = new StringBuilder();
		sql.append("update opinion set ");
		sql.append("nickname=?, content=? ");
		sql.append("where bias_id=?");
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql.toString());
			pstmt.setString(1, dto.getNickname());
			pstmt.setString(2, dto.getContent());
			pstmt.setInt(3, dto.getBiasId());

			return pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Debug(Opinion Update Error: " + e.getMessage());
		} finally {
			factory.close(rs, pstmt, conn);
		}
		return 0;
	}
}
