package work.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import work.model.dto.*;

/**
 * MemberDao 
 * @author henry!
 *
 */
public class MemberDao {

	private FactoryDao factory = FactoryDao.getInstance();
	private Connection conn = null;
	private Statement stmt = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	
	
	public Connection getConnection() {
		return factory.getConnection();
	}
	
	public int insert(Member dto) {
		String sql = "insert into MEMBER values(?,?,?,?,?,?)";
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getMemberId());
			pstmt.setString(2, dto.getMemberPw());
			pstmt.setString(3, dto.getQuestion());
			pstmt.setString(4, dto.getAnswer());
			pstmt.setString(5, dto.getNickname());
			pstmt.setInt(6, dto.getImagePath());
			
			return pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Debug(Member Insert Error: " + e.getMessage());
		} finally {
			factory.close(rs, pstmt, conn);
		}
		return 0;
	}
	
	public int delete(String memberId) {
		String sql = "delete MEMBER where member_id=?";
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, memberId);
			
			return pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Debug(Member Delete Error: " + e.getMessage());
		} finally {
			factory.close(rs, pstmt, conn);
		}
		return 0;
	}
	
	public Member selectOne(String memberId) {
		String sql = "select * from MEMBER where member_id=?";
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, memberId);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				memberId = rs.getString("member_id");
				String memberPw = rs.getString("member_pw");
				String question = rs.getString("question");
				String answer = rs.getString("answer");
				String nickname = rs.getString("nickname");
				int imagePath = rs.getInt("image_path");
				
				return new Member(memberId, memberPw, question, answer, nickname, imagePath);	
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Debug(Member SelectOne Error: " + e.getMessage());
		} finally {
			factory.close(rs, pstmt, conn);
		}
		return null;
	}
	
	public ArrayList<Member> selectAll() {
		ArrayList<Member> list = new ArrayList<Member>();
		String sql = "select * from MEMBER";
		conn = getConnection();
		try {
			conn = getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			Member dto = null;
			
			while(rs.next()) {
				String memberId = rs.getString("member_id");
				String memberPw = rs.getString("member_pw");
				String question = rs.getString("question");
				String answer = rs.getString("answer");
				String nickname = rs.getString("nickname");
				int imagePath = rs.getInt("image_path");
				
				dto = new Member(memberId, memberPw, question, answer, nickname, imagePath);
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
	
	public int update(Member dto) {
		StringBuilder sql = new StringBuilder();
		sql.append("update MEMBER set ");
		sql.append("member_pw=?, question=?, answer=?, nickname=?, image_path=? ");
		sql.append("where member_id=?");
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql.toString());
			pstmt.setString(1, dto.getMemberPw());
			pstmt.setString(2, dto.getQuestion());
			pstmt.setString(3, dto.getAnswer());
			pstmt.setString(4, dto.getNickname());
			pstmt.setInt(5, dto.getImagePath());
			pstmt.setString(6, dto.getMemberId());
			
			return pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Debug(Member Update Error: " + e.getMessage());
		} finally {
			factory.close(rs, pstmt, conn);
		}
		return 0;
	}
	
	public boolean loginCheck(String memberId, String memberPw) {
		String sql = "select member_pw from MEMBER where member_id =?";
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, memberId);
			rs = pstmt.executeQuery();
			if(rs.next() && memberPw.equals(rs.getString("member_pw"))) {
				return true;
			} else {
				return false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Debug(Member loginCheck Error: " + e.getMessage());
		} finally {
			factory.close(rs,  pstmt, conn);
		}
		return false;
	}
	
	public int updatePassword(String memberId, String memberPw, String newMemberPw) {
		StringBuilder sql = new StringBuilder();
		sql.append("update MEMBER set ");
		sql.append("member_pw=? ");
		sql.append("where member_id=? and member_pw=?");
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql.toString());
			pstmt.setString(1, newMemberPw);
			pstmt.setString(2, memberId);
			pstmt.setString(3, memberPw);
			
			return pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Debug(Member updatePassword Error: " + e.getMessage());		
		} finally {
			factory.close(rs,  pstmt, conn);
		}
		
		return 0;
	}
	

}
