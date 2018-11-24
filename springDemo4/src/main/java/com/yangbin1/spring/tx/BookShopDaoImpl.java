package com.yangbin1.spring.tx;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository("bookShopDao")
public class BookShopDaoImpl implements BookShopDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public BigDecimal findBookPriceByIsbn(String isbn) {
		String sql = "select price from book where isbn = ?";
		return jdbcTemplate.queryForObject(sql, BigDecimal.class, isbn);
	}

	@Override
	public void updateBookStock(String isbn) {
		//检查库存是否足够
		String sql2 = "select stock from book_stock where isbn = ?";
		int stock = jdbcTemplate.queryForObject(sql2,Integer.class,isbn);
		if(stock == 0){
			throw new BookStockException("库存不足");
		}
		String sql = "update book_stock set stock = stock - 1 where isbn = ?";
		jdbcTemplate.update(sql, isbn);
	}

	@Override
	public void updateUserAccount(String username, BigDecimal price) {
		//检查库存是否足够
				String sql2 = "select balance from account where username = ?";
				BigDecimal balance = jdbcTemplate.queryForObject(sql2,BigDecimal.class,username);
				if(balance.compareTo(price) < 0){
					throw new UserAccountException("余额不足");
				}
		String sql = "update account set balance = balance - ? where username = ?";
		jdbcTemplate.update(sql, price, username);
	}

}
