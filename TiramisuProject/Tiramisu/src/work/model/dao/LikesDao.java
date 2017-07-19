package work.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import work.model.dto.Likes;
import work.model.dto.Member;

public class LikesDao {
	private FactoryDao factory = FactoryDao.getInstance();
	private Connection conn = null;
	private Statement stmt = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	
	public Connection getConnection() {
		return factory.getConnection();
	}
	
	public int insert(Likes dto) {
		String sql = "insert into MEMBER values(seq_likes.nextval,?)";
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getLiker());

			return pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Debug(Likes Insert Error: " + e.getMessage());
		} finally {
			factory.close(rs, pstmt, conn);
		}
		return 0;
	}
	
	public int delete(int dialogId) {
		String sql = "delete likes where dialog_id=?";
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, dialogId);
			
			return pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Debug(Likes Delete Error: " + e.getMessage());
		} finally {
			factory.close(rs, pstmt, conn);
		}
		return 0;
	}
	
	public Likes selectOne(int dialogId) {
		String sql = "select * from likes where dialog_id=?";
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, dialogId);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				dialogId = rs.getInt("dialog_id");
				String liker = rs.getString("liker");
				
				return new Likes(dialogId, liker);	
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Debug(Likes SelectOne Error: " + e.getMessage());
		} finally {
			factory.close(rs, pstmt, conn);
		}
		return null;
	}
	
	public ArrayList<Likes> selectAll() {
		ArrayList<Likes> list = new ArrayList<Likes>();
		String sql = "select * from likes";
		try {
			conn = getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			Likes dto = null;
			
			while(rs.next()) {
				int dialogId = rs.getInt("dialog_id");
				String liker = rs.getString("liker");
				dto = new Likes(dialogId, liker);
				list.add(dto);	
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Debug(Member SelectAll() Error: " + e.getMessage());
		} finally {
			factory.close(rs, stmt, conn);
		}
		return list;
	}
	
	public int update(Likes dto) {
		StringBuilder sql = new StringBuilder();
		sql.append("update likes set ");
		sql.append("liker=? ");
		sql.append("where dialog_id=?");
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql.toString());
			pstmt.setString(1, dto.getLiker());
			pstmt.setInt(2, dto.getDialogId());
			
			return pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Debug(Likes Update Error: " + e.getMessage());
		} finally {
			factory.close(rs, pstmt, conn);
		}
		return 0;
	}
}
