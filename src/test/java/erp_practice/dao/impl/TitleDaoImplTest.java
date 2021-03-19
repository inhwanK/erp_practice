package erp_practice.dao.impl;

import static org.junit.Assert.fail;

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
		fail("Not yet implemented");
	}

	@Test
	public void test02SelectTitleAll() {
		fail("Not yet implemented");
	}

	@Test
	public void test01InsertTitle() {
		System.out.println("test01InsertTitle()");
//		Title insertTitle = new Title(100,"노예");
//		int res = dao.insertTitle(insertTitle);
		int res = dao.insertTitle(new Title(100, "노예"));
		Assert.assertEquals(1, res);		
	}

	@Test
	public void test05DeleteTitle() {
		System.out.println("test05DeleteTitle()");
		int res = dao.deleteTitle(100);
		Assert.assertEquals(1, res);
	}

	@Test
	public void test04UpdateTitle() {
		fail("Not yet implemented");
	}

}
