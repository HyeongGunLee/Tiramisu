package work.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import work.model.dto.Bias;

public class BiasDao {

	private FactoryDao factory = FactoryDao.getInstance();
	private Connection conn = null;
	private Statement stmt = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	
	public Connection getConnection() {
		return factory.getConnection();
	}
	
	public int insert(Bias dto) {
		String sql = "insert into bias values(seq_bias.nextval,?,?)";
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			//pstmt.setInt(1, dto.getBiasId());
			pstmt.setInt(1, dto.getVoteId());
			pstmt.setString(2, dto.getBiasName());
			return pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Debug(Bias Insert Error: " + e.getMessage());
		} finally {
			factory.close(rs, pstmt, conn);
		}
		return 0;
	}
	
	public int insert(int voteId, String biasName) {
		String sql = "insert into bias values(seq_bias.nextval,?,?)";
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			//pstmt.setInt(1, dto.getBiasId());
			pstmt.setInt(1, voteId);
			pstmt.setString(2, biasName);
			return pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Debug(Bias Insert Error: " + e.getMessage());
		} finally {
			factory.close(rs, pstmt, conn);
		}
		return 0;
	}
	
	public int delete(int biasId) {
		String sql = "delete from bias where bias_id=?";
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, biasId);
			
			return pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Debug(Bias Delete Error: " + e.getMessage());
		} finally {
			factory.close(rs, pstmt, conn);
		}
		return 0;
	}
	
	/*SQL> desc bias;
		 Name                                      Null?    Type
		 ----------------------------------------- -------- --------------
		 BIAS_ID                                   NOT NULL NUMBER(4)
		 VOTE_ID                                   NOT NULL NUMBER(4)
		 BIAS_NAME                                 NOT NULL VARCHAR2(60)
	 */
	public Bias selectOne(int biasId) {
		String sql = "select * from bias where bias_id=?";
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, biasId);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				biasId = rs.getInt("bias_id");
				int voteId = rs.getInt("vote_id");
				String biasName = rs.getString("bias_name");
				
				return new Bias(biasId, voteId, biasName);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Debug(Bias SelectOne Error: " + e.getMessage());
		} finally {
			factory.close(rs, pstmt, conn);
		}
		return null;
	}
	
	public ArrayList<Bias> selectAll() {
		ArrayList<Bias> list = new ArrayList<Bias>();
		String sql = "select * from bias";
		try {
			conn = getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			Bias dto = null;
			
			while(rs.next()) {
				int biasId = rs.getInt("bias_id");
				int voteId = rs.getInt("vote_id");
				String biasName = rs.getString("bias_name");
				
				dto = new Bias(biasId, voteId, biasName);
				list.add(dto);	
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Debug(Bias SelectAll() Error: " + e.getMessage());
		} finally {
			factory.close(rs, stmt, conn);
		}
		return list;
	}
	
	public int update(Bias dto) {
		StringBuilder sql = new StringBuilder();
		sql.append("update bias set ");
		sql.append("vote_id=?, bias_name=? ");
		sql.append("where bias_id=?");
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql.toString());
			pstmt.setInt(1, dto.getVoteId());
			pstmt.setString(2, dto.getBiasName());
			pstmt.setInt(3, dto.getBiasId());
			
			return pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Debug(Bias Update Error: " + e.getMessage());
		} finally {
			factory.close(rs, pstmt, conn);
		}
		return 0;
	}
	
	
}
