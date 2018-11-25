package com.yangbin1.spring.tx.service.impl;

import java.math.BigDecimal;

import com.yangbin1.spring.tx.xml.BookShopDao;
import com.yangbin1.spring.tx.xml.service.BookShopService;

public class BookShopServiceImpl implements BookShopService {

	BookShopDao bookShopDao = null;

	public void setBookShopDao(BookShopDao bookShopDao) {
		this.bookShopDao = bookShopDao;
	}
	
	@Override
	public void purchase(String userName, String isbn) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {

		}
		// 查价格
		BigDecimal price = bookShopDao.findBookPriceByIsbn(isbn);
		// 更新库存
		bookShopDao.updateBookStock(isbn);
		// 更新账户余额
		bookShopDao.updateUserAccount(userName, price);

	}

}
