package work.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import work.model.dto.Dialog;
import work.model.dto.Member;

public class DialogDao {
	
	private FactoryDao factory = FactoryDao.getInstance();
	private Connection conn = null;
	private Statement stmt = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	
	public Connection getConnection() {
		return factory.getConnection();
	}
	
	public int insert(Dialog dto) {
		String sql = "insert into dialog values(seq_dialog.nextval,?,?,?,?,sysdate,null)";
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getChannelName());
			pstmt.setString(2, dto.getTeamName());
			pstmt.setString(3, dto.getContent());
			pstmt.setString(4, dto.getWriter());
			
			return pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Debug(Dialog Insert Error: " + e.getMessage());
		} finally {
			factory.close(rs, pstmt, conn);
		}
		return 0;
	}
	
	public int delete(int dialogId) {
		String sql = "delete dialog where dialog_id=?";
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, dialogId);
			
			return pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Debug(Dialog Delete Error: " + e.getMessage());
		} finally {
			factory.close(rs, pstmt, conn);
		}
		return 0;
	}
	
	
	public Dialog selectOne(int dialogId) {
		String sql = "select * from dialog where dialog_id=?";
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, dialogId);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				dialogId = rs.getInt("dialog_id");
				String channelName = rs.getString("channel_name");
				String teamName = rs.getString("team_name");
				String content = rs.getString("content");
				String writer = rs.getString("writer");
				String writeDate = rs.getString("write_date");
				int fileId = rs.getInt("file_id");
				
				return new Dialog(dialogId, channelName, teamName, content, writer, writeDate, fileId); 	
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Debug(Dialog SelectOne Error: " + e.getMessage());
		} finally {
			factory.close(rs, pstmt, conn);
		}
		return null;
	}
	
	public Dialog selectOne(String writer, String writeDate) {
		String sql = "select * from dialog where writer=? and write_date=?";
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, writer);
			pstmt.setString(2, writeDate);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				int dialogId = rs.getInt("dialog_id");
				String channelName = rs.getString("channel_name");
				String teamName = rs.getString("team_name");
				String content = rs.getString("content");
				writer = rs.getString("writer");
				writeDate = rs.getString("write_date");
				int fileId = rs.getInt("file_id");
				
				return new Dialog(dialogId, channelName, teamName, content, writer, writeDate, fileId); 	
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Debug(Dialog SelectOne Error: " + e.getMessage());
		} finally {
			factory.close(rs, pstmt, conn);
		}
		return null;
	}
	
	public ArrayList<Dialog> selectAll() {
		ArrayList<Dialog> list = new ArrayList<Dialog>();
		String sql = "select * from dialog";
		try {
			conn = getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			Dialog dto = null;
			
			while(rs.next()) {
				int dialogId = rs.getInt("dialog_id");
				String channelName = rs.getString("channel_name");
				String teamName = rs.getString("team_name");
				String content = rs.getString("content");
				String writer = rs.getString("writer");
				String writeDate = rs.getString("write_date");
				int fileId = rs.getInt("file_id");
				
				dto = new Dialog(dialogId, channelName, teamName, content, writer, writeDate, fileId);
				list.add(dto);	
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Debug(Dialog SelectAll() Error: " + e.getMessage());
		} finally {
			factory.close(rs, stmt, conn);
		}
		return list;
	}
	
	public int update(Dialog dto) {
		StringBuilder sql = new StringBuilder();
		sql.append("update dialog set ");
		sql.append("channel_name=?, team_name=?, content=?, writer=?, write_date=sysdate, file_id=?");
		sql.append("where dialog_id=?");
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql.toString());
			pstmt.setString(1, dto.getChannelName());
			pstmt.setString(2, dto.getTeamName());
			pstmt.setString(3, dto.getContent());
			pstmt.setString(4, dto.getWriter());
			pstmt.setInt(5, dto.getFileId());
			pstmt.setInt(6, dto.getDialogId());
			
			return pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Debug(Dialog Update Error: " + e.getMessage());
		} finally {
			factory.close(rs, pstmt, conn);
		}
		return 0;
	}
	
	
}
