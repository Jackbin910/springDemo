package com.yangbin1.spring.tx.xml;

import java.math.BigDecimal;

public interface BookShopDao {
	//根据书号获取单价
	public BigDecimal findBookPriceByIsbn(String isbn);
	
	//对应id库存-1
	public void updateBookStock(String isbn);
	
	//更新用户账户余额
	public void updateUserAccount(String username,BigDecimal price);
}
