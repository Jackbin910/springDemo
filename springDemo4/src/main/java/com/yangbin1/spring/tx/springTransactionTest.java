package com.yangbin1.spring.tx;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class springTransactionTest {

	private ApplicationContext ctx = null;
	private BookShopDao bookShopDao = null;

	{
		ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		bookShopDao = ctx.getBean(BookShopDao.class);
	}

	@Test
	public void testBookShopDaoFindPriceByIsbn() {
		System.out.println(bookShopDao.findBookPriceByIsbn("1001"));
	}
	
	@Test
	public void testBookShopDaoUpdateBookStock() {
		bookShopDao.updateBookStock("1001");
	}

	@Test
	public void testBookShopDaoUpdateUserAccount() {
		bookShopDao.updateUserAccount("AA", 100);
	}
}
