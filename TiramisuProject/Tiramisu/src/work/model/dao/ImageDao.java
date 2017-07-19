package work.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import work.model.dto.Image;
import work.model.dto.Member;

public class ImageDao {
	private FactoryDao factory = FactoryDao.getInstance();
	private Connection conn = null;
	private Statement stmt = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	
	
	public Connection getConnection() {
		return factory.getConnection();
	}
	
	public int insert(Image dto) {
		String sql = "insert into image values(seq_vote.nextval,?)";
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getFileName());
			
			return pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Debug(Image Insert Error: " + e.getMessage());
		} finally {
			factory.close(rs, pstmt, conn);
		}
		return 0;
	}
	
	public int delete(int imageId) {
		String sql = "delete image where image_id=?";
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, imageId);
			
			return pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Debug(Image Delete Error: " + e.getMessage());
		} finally {
			factory.close(rs, pstmt, conn);
		}
		return 0;
	}
	
	public Image selectOne(int imageId) {
		String sql = "select * from image where image_id=?";
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, imageId);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				imageId = rs.getInt("image_id");
				String fileName = rs.getString("file_name");
				
				return new Image(imageId, fileName);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Debug(Image SelectOne Error: " + e.getMessage());
		} finally {
			factory.close(rs, pstmt, conn);
		}
		return null;
	}
	
	public ArrayList<Image> selectAll() {
		ArrayList<Image> list = new ArrayList<Image>();
		String sql = "select * from Image";
		try {
			conn = getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			Image dto = null;
			
			while(rs.next()) {
				int imageId = rs.getInt("image_id");
				String fileName = rs.getString("file_name");
				
				dto = new Image(imageId, fileName);
				list.add(dto);	
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Debug(Image SelectAll() Error: " + e.getMessage());
		} finally {
			factory.close(rs, stmt, conn);
		}
		return list;
	}
	
	public int update(Image dto) {
		StringBuilder sql = new StringBuilder();
		sql.append("update image set ");
		sql.append("file_name=? ");
		sql.append("where image_id=?");
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql.toString());
			pstmt.setString(1, dto.getFileName());
			pstmt.setInt(2, dto.getImageId());
			
			return pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Debug(Image Update Error: " + e.getMessage());
		} finally {
			factory.close(rs, pstmt, conn);
		}
		return 0;
	}
	
}
