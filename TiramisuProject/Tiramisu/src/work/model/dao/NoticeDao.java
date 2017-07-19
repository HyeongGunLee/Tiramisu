package work.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import work.model.dto.Notice;

public class NoticeDao {
	private FactoryDao factory = FactoryDao.getInstance();
	private Connection conn = null;
	private Statement stmt = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	
	public Connection getConnection() {
		return factory.getConnection();
	}
	
	public int insert(Notice dto) {
		String sql = "insert into notice values(seq_notice.nextval,?,sysdate,?,?)";
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getTeamName());
			pstmt.setString(2, dto.getWriter());
			pstmt.setString(3, dto.getContent());
			
			return pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Debug(Notice Insert Error: " + e.getMessage());
		} finally {
			factory.close(rs, pstmt, conn);
		}
		return 0;
	}
	
	public int delete(int noticeId) {
		String sql = "delete notice where notice_id=?";
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, noticeId);
			
			return pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Debug(Notice Delete Error: " + e.getMessage());
		} finally {
			factory.close(rs, pstmt, conn);
		}
		return 0;
	}
	
	public Notice selectOne(int noticeId) {
		String sql = "select * from notice where notice_id=?";
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, noticeId);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				noticeId = rs.getInt("notice_id");
				String teamName = rs.getString("team_name");
				String writeDate = rs.getString("write_date");
				String writer = rs.getString("writer");
				String content = rs.getString("content");
				return new Notice(noticeId, teamName, writeDate, writer, content);	
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Debug(Notice SelectOne Error: " + e.getMessage());
		} finally {
			factory.close(rs, pstmt, conn);
		}
		return null;
	}
	
	public ArrayList<Notice> selectAll() {
		ArrayList<Notice> list = new ArrayList<Notice>();
		String sql = "select * from notice";
		try {
			conn = getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			Notice dto = null;
			
			while(rs.next()) {
				int noticeId = rs.getInt("notice_id");
				String teamName = rs.getString("team_name");
				String writeDate = rs.getString("write_date");
				String writer = rs.getString("writer");
				String content = rs.getString("contetn");
				
				dto = new Notice(noticeId, teamName, writeDate, writer, content);
				list.add(dto);	
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Debug(Notice SelectAll() Error: " + e.getMessage());
		} finally {
			factory.close(rs, stmt, conn);
		}
		return list;
	}
	
	public int update(Notice dto) {
		StringBuilder sql = new StringBuilder();
		sql.append("update notice set ");
		sql.append("team_name=?, write_date=sysdate, writer=?, content=?");
		sql.append("where notice_id=?");
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql.toString());
			pstmt.setString(1, dto.getTeamName());
			pstmt.setString(2, dto.getWriter());
			pstmt.setString(3, dto.getContent());
			pstmt.setInt(4, dto.getNoticeId());
			
			return pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Debug(Notice Update Error: " + e.getMessage());
		} finally {
			factory.close(rs, pstmt, conn);
		}
		return 0;
	}
}
