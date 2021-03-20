package erp_practice.dao;

import java.util.List;

import erp_practice.dto.Title;

public interface TitleDao {
	Title selectTitleByNo(int tNo);
	
	List<Title> selectTitleAll();
	
	int insertTitle(Title title);
	int deleteTitle(int tNo);
	int updateTitle(Title title);
	
}
