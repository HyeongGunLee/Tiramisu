package work.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import work.model.dto.Channel;
import work.model.dto.Member;

public class ChannelDao {
	private FactoryDao factory = FactoryDao.getInstance();
	private Connection conn = null;
	private Statement stmt = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	
	public Connection getConnection() {
		return factory.getConnection();
	}
	
	public int insert(Channel dto) {
		String sql = "insert into team values(?,?,?)";
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, dto.getChannelId());
			pstmt.setString(2, dto.getChannelName());
			pstmt.setString(3, dto.getTeamName());
			
			return pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Debug(Channel Insert Error: " + e.getMessage());
		} finally {
			factory.close(rs, pstmt, conn);
		}
		return 0;
	}
	
	public int delete(int channelId) {
		String sql = "delete channel where channel_id=?";
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, channelId);
			
			return pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Debug(Channel Delete Error: " + e.getMessage());
		} finally {
			factory.close(rs, pstmt, conn);
		}
		return 0;
	}
	
	public Channel selectOne(int channelId) {
		String sql = "select * from channel where channel_id=?";
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, channelId);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				channelId = rs.getInt("channel_id");
				String channelName = rs.getString("channel_name");
				String teamName = rs.getString("team_name");
				
				return new Channel(channelId, channelName, teamName);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Debug(Channel SelectOne Error: " + e.getMessage());
		} finally {
			factory.close(rs, pstmt, conn);
		}
		return null;
	}
	
	public ArrayList<Channel> selectAll() {
		ArrayList<Channel> list = new ArrayList<Channel>();
		String sql = "select * from channel";
		try {
			conn = getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			Channel dto = null;
			
			while(rs.next()) {
				int channelId = rs.getInt("channel_id");
				String channelName = rs.getString("channel_name");
				String teamName = rs.getString("team_name");
				
				dto = new Channel(channelId, channelName, teamName);
				list.add(dto);	
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Debug(Channel SelectAll() Error: " + e.getMessage());
		} finally {
			factory.close(rs, stmt, conn);
		}
		return list;
	}
	
	public int update(Channel dto) {
		StringBuilder sql = new StringBuilder();
		sql.append("update channel set ");
		sql.append("channel_name=?, team_name=? ");
		sql.append("where channel_id=?");
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql.toString());
			pstmt.setString(1, dto.getChannelName());
			pstmt.setString(2, dto.getTeamName());
			pstmt.setInt(3,  dto.getChannelId());
			
			return pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Debug(Channel Update Error: " + e.getMessage());
		} finally {
			factory.close(rs, pstmt, conn);
		}
		return 0;
	}
	
}
