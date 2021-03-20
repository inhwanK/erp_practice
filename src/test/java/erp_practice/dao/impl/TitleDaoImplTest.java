package erp_practice.dao.impl;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import erp_practice.dao.TitleDao;
import erp_practice.dto.Title;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TitleDaoImplTest {
	private TitleDao dao = TitleDaoImpl.getInstance();


	@Test
	public void test03SelectTitleByNo() {
		System.out.println("test03SelectTitleByNo");
		Object res = dao.selectTitleByNo(10);
		Assert.assertNotNull(res);
	}

	@Test
	public void test02SelectTitleAll() {
		System.out.println("test02SelectTitleAll()");
		Object res = dao.selectTitleAll();
		Assert.assertNotNull(res);
	}

	@Test
	public void test01InsertTitle() {
		System.out.println("test01InsertTitle()");
//		Title insertTitle = new Title(100,"노예");
//		int res = dao.insertTitle(inserTitle);
//		System.out.println(insertTitle);
		int res = dao.insertTitle(new Title(10, "노예"));
		Assert.assertEquals(1, res);		
	}

	@Test
	public void test05DeleteTitle() {
		System.out.println("test05DeleteTitle()");
		int res = dao.deleteTitle(10);
		Assert.assertEquals(1, res);
	}

	@Test
	public void test04UpdateTitle() {
		System.out.println("test04UpdateTitle()");
		Object res = dao.updateTitle(new Title(10,"상노예"));
		Assert.assertNotNull(res);
	}

}
