package com.yangbin1.spring.tx;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Repository("bookShopService")
public class BookShopServiceImpl implements BookShopService {

	@Autowired
	BookShopDao bookShopDao = null;

	// 添加事务注解
	// 使用propagation指定事物的传播行为
	// 默认REQUIRED使用调用方法的事务
	// REQUIRES_NEW:使用自己的事务，调用的事务方法的事务被挂起
	// isolation事务隔离级别
	// 默认情况下spring的声明式事务对所有运行时异常进行回滚
	// 默认情况下不用进行设置
	// readOnly制定事务是否是只读，这样可以帮助数据库引擎优化事务
	// timeout指定强制回滚之前事务可以占用的时间
	/*
	 * @Transactional(propagation = Propagation.REQUIRED, isolation =
	 * Isolation.READ_COMMITTED, noRollbackFor = { UserAccountException.class })
	 */
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false,
			timeout=3)
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
