package erp_practice.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import erp_practice.conn.JdbcUtil;
import erp_practice.dao.TitleDao;
import erp_practice.dto.Title;
import erp_practice.exception.SqlConstraintException;

public class TitleDaoImpl implements TitleDao {

	private static final TitleDaoImpl instance = new TitleDaoImpl();
	
	
	public static TitleDaoImpl getInstance() {
		return instance;
	}

	private TitleDaoImpl() {}
	
	
	@Override
	public Title selectTitleByNo(int tNo) {
		String sql = "select * from title where tno = ?";
		try(Connection conn = JdbcUtil.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql)){
			pstmt.setInt(1, tNo);
			// 리턴 타입이 Title 객체이니까
			// 어떻게 Title 객체를 만들어 낼 수 있을지 고민해야한다.
			try(ResultSet rs = pstmt.executeQuery();){
				if(rs.next()) {
					return getTitle(rs);
//					getTitle 메서드를 따로 만드는데. rs가 어떤 형태로 되어 있는지 먼저 알아야 될 것이다.
//					그래야 rs의 정보를 Title의 형태로 어떻게 받아올지 생각할 수 있기 때문이다.
//					물론 getTitle의 반환값은 Title 타입이여야 할 것이다.
				}
			}
			return null;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	private Title getTitle(ResultSet rs) throws SQLException {
			int tNo = rs.getInt("tno");
			String tName = rs.getString("tname");
			return new Title(tNo, tName);
	}

	@Override
	public List<Title> selectTitleAll() {
		
		return null;
	}

	@Override
	public int insertTitle(Title title) {
		String sql = "insert into title values(?,?)";
		try(Connection conn = JdbcUtil.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql)){
			pstmt.setInt(1, title.gettNo());
			pstmt.setString(2, title.gettName());
		return pstmt.executeUpdate();
		}catch(SQLException e){
			throw new SqlConstraintException(e.getMessage(), e);
		}
		
	}

	@Override
	public int deleteTitle(int tNo) {
		String sql = "delete from title where tno = ?";
		try(Connection conn = JdbcUtil.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql)){
			pstmt.setInt(1, tNo);
			return pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return 0;
	}

	@Override
	public int updateTitle(Title title) {
		String sql = "update title set tname = ? where tno = ?;";
		try(Connection conn = JdbcUtil.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql)){
			pstmt.setString(1, title.gettName());
			pstmt.setInt(2, title.gettNo());
			return pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	
}
