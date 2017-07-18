package work.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.sql.Date;

import work.model.dto.Message;

public class MessageDao {

	private FactoryDao factory = FactoryDao.getInstance();
	private Connection conn = null;
	private Statement stmt = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;

	public Connection getConnection() {
		return factory.getConnection();
	}

	public int insert(Message dto) {
		String sql = "insert into MESSAGE values(?,?,?,?,?,?)";

		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, dto.getMessageId());
			;
			pstmt.setString(2, dto.getContent());
			pstmt.setString(3, dto.getWriter());
			pstmt.setString(4, dto.getWriteDate());
			pstmt.setString(5, dto.getReceiver());
			pstmt.setString(6, dto.getConfirm());

			return pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Debug(Message insert): " + e.getMessage());
		} finally {
			factory.close(rs, pstmt, conn);
		}
		return 0;
	}

	public int delete(String messageId) {
		String sql = "delete MESSAGE where (message_id=?)";

		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, messageId);

			return pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Debug(Message delete): " + e.getMessage());
		} finally {
			factory.close(rs, pstmt, conn);
		}
		return 0;
	}

	public Message selectOne(int messageId) {
		String sql = "select * from MESSAGE where message_id=?";

		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, messageId);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				messageId = rs.getInt("message_id");
				String content = rs.getString("content");
				String writer = rs.getString("writer");
				String writeDate = rs.getString("write_date");
				String receiver = rs.getString("receiver");
				String confirm = rs.getString("confirm");

				return new Message(messageId, content, writer, writeDate, receiver, confirm);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Debug(Message SelectOne Error: " + e.getMessage());
		} finally {
			factory.close(rs, pstmt, conn);
		}
		return null;
	}

	public ArrayList<Message> selectAll() {
		ArrayList<Message> list = new ArrayList<Message>();
		String sql = "select * from MESSAGE";
		try {
			conn = getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			Message dto = null;

			while (rs.next()) {
				int messageId = rs.getInt("message_id");
				String content = rs.getString("content");
				String writer = rs.getString("writer");
				String writeDate = rs.getString("write_date");
				String receiver = rs.getString("receiver");
				String confirm = rs.getString("confirm");

				dto = new Message(messageId, content, writer, writeDate, receiver, confirm);
				list.add(dto);
			}

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Debug(Message SelectAll() Error: " + e.getMessage());
		} finally {
			factory.close(rs, stmt, conn);
		}
		return list;
	}

	public int update(Message dto) {
		StringBuilder sql = new StringBuilder();
		sql.append("update MESSAGE set ");
		sql.append("content=?, writer=?, write_date=?, receiver=?, confirm=?");
		sql.append("where message_id=?");

		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql.toString());
			pstmt.setString(1, dto.getContent());
			pstmt.setString(2, dto.getWriter());
			pstmt.setString(3, dto.getWriteDate());
			pstmt.setString(4, dto.getReceiver());
			pstmt.setString(5, dto.getConfirm());
			pstmt.setInt(6, dto.getMessageId());

			return pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Debug(Message Update Error: " + e.getMessage());
		} finally {
			factory.close(rs, pstmt, conn);
		}
		return 0;
	}
	
	public boolean checkConfirm(String confirm) {
		if(confirm.toUpperCase().equals("TRUE")) {
			return true;
		}
		return false;
	}
}
