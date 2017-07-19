package work.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import work.model.dto.Member;
import work.model.dto.Notification;

public class NotificationDao {
	private FactoryDao factory = FactoryDao.getInstance();
	private Connection conn = null;
	private Statement stmt = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	
	public Connection getConnection() {
		return factory.getConnection();
	}
	
	public int insert(Notification dto) {
		String sql = "insert into notification values(seq_notification.nextval,?,sysdate,?,?)";
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getTeamName());
			pstmt.setString(2, dto.getWriter());
			pstmt.setString(3, dto.getContent());
			
			return pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Debug(Notification Insert): " + e.getMessage());
		} finally {
			factory.close(rs, pstmt, conn);
		}
		return 0;
	}
	
	public int delete(int notificationId) {
		String sql = "delete notification where notification_ID=?";
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, notificationId);
			
			return pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Debug(Notification Delete Error: " + e.getMessage());
		} finally {
			factory.close(rs, pstmt, conn);
		}
		return 0;
	}
	
	public Notification selectOne(int notificationId) {
		String sql = "select * from notification where notification_ID=?";
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, notificationId);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				notificationId = rs.getInt("notification_id");
				String teamName = rs.getString("team_name");
				String writeDate = rs.getString("write_date");
				String writer = rs.getString("writer");
				String content = rs.getString("content");
				
				return new Notification(notificationId, teamName, writeDate, writer, content);	
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Debug(Notification SelectOne Error: " + e.getMessage());
		} finally {
			factory.close(rs, pstmt, conn);
		}
		return null;
	}
	
	public ArrayList<Notification> selectAll() {
		ArrayList<Notification> list = new ArrayList<Notification>();
		String sql = "select * from notification";
		try {
			conn = getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			Notification dto = null;
			
			while(rs.next()) {
				int notificationId = rs.getInt("notification_ID");
				String teamName = rs.getString("team_name");
				String writeDate = rs.getString("write_date");
				String writer = rs.getString("writer");
				String content = rs.getString("content");
				
				dto = new Notification(notificationId, teamName, writeDate, writer, content);
				list.add(dto);	
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Debug(Notification SelectAll() Error: " + e.getMessage());
		} finally {
			factory.close(rs, stmt, conn);
		}
		return list;
	}
	
	public int update(Notification dto) {
		StringBuilder sql = new StringBuilder();
		sql.append("update notification set ");
		sql.append("team_name=?, write_date=?, writer=sysdate, content=?");
		sql.append("where (notification_ID=?)");
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql.toString());
			pstmt.setString(1, dto.getTeamName());
			pstmt.setString(2, dto.getWriter());
			pstmt.setString(3, dto.getContent());
			pstmt.setInt(4, dto.getNotificationId());
			
			return pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Debug(Member Update Error: " + e.getMessage());
		} finally {
			factory.close(rs, pstmt, conn);
		}
		return 0;
	}
}
