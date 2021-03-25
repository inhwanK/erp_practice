package erp_practice.service;

import java.util.List;

import erp_practice.dao.TitleDao;
import erp_practice.dao.impl.TitleDaoImpl;
import erp_practice.dto.Title;

public class TitleService {
	private TitleDao dao = TitleDaoImpl.getInstance();
	
	public List<Title> showTitles(){
		return dao.selectTitleAll();
	}
	
	public void insertTitle(Title title) {
		dao.insertTitle(title);
	}
	
	public void deleteTitle(Title title) {
		dao.deleteTitle(title.gettNo());
	}
	
	public void modifyTitle(Title title) {
		dao.updateTitle(title);
	}
}
