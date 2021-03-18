package erp_practice.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import erp_practice.conn.JdbcUtil;
import erp_practice.dao.TitleDao;
import erp_practice.dto.Title;

public class TitleDaoImpl implements TitleDao {

	private static final TitleDaoImpl instance = new TitleDaoImpl();
	
	
	public static TitleDaoImpl getInstance() {
		return instance;
	}

	@Override
	public List<Title> selectTitleByNo(int tNo) {
		
		return null;
	}

	@Override
	public List<Title> selectTitleAll() {
		
		return null;
	}

	@Override
	public int insertTitle(Title title) {
		String sql = "insert into title value(?,?)";
		try(Connection conn = JdbcUtil.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql)){
			pstmt.setInt(1, title.gettNo());
			pstmt.setString(2, title.gettName());
		return pstmt.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public void deleteTitle(int tNo) {
		String sql = "";

	}

	@Override
	public void updateTitle(Title title) {
		

	}

	
}
