package erp_practice.dao;

import java.util.List;

import erp_practice.dto.Title;

public interface TitleDao {
	List<Title> selectTitleByNo(int tNo);
	
	List<Title> selectTitleAll();
	
	int insertTitle(Title title);
	void deleteTitle(int tNo);
	void updateTitle(Title title);
	
}
