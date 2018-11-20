package com.yangbin1.spring.jdbc;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

public class JDBCTest {
    
    private ApplicationContext ctx = null;
    private JdbcTemplate jdbcTemplate;
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
    
    {
        ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        jdbcTemplate = (JdbcTemplate) ctx.getBean("jdbcTemplate");
        namedParameterJdbcTemplate = (NamedParameterJdbcTemplate) ctx.getBean("namedParameterJdbcTemplate");
    }
    
    /**
     * 获取单个列的值或做统计查询
     */
    @Test
    public void testNamedUpdate2() {
        String sql = "update cbs_inv_request set inv_request_num = :invRequestNum where inv_request_uuid = 3";
        InvoiceRequest req = new InvoiceRequest();
        req.setInvRequestNum("REQ201811200003");
        SqlParameterSource paramMap = new BeanPropertySqlParameterSource(req);
        namedParameterJdbcTemplate.update(sql, paramMap);
    }
    
    /**
     * 获取单个列的值或做统计查询
     */
    @Test
    public void testNamedUpdate() {
        String sql = "update cbs_inv_request set inv_request_num = :invRequestNum where inv_request_uuid = 3";
        Map<String,Object> paramMap = new HashMap<>();
        paramMap.put("invRequestNum", "REQ201811200001");
        namedParameterJdbcTemplate.update(sql, paramMap);
    }
    
    /**
     * 获取单个列的值或做统计查询
     */
    @Test
    public void testQueryForObject2() {
        String sql = "select count(inv_request_uuid) from cbs_inv_request";
        long count = jdbcTemplate.queryForObject(sql, long.class);
        System.out.println(count);
    }
    
    /**
     * 查到实体类的集合
     */
    @Test
    public void testQueryForList() {
        String sql = "select inv_request_uuid invRequestUuid, inv_request_num invRequestNum, request_company_cde requestCompanyCde from cbs_inv_request where inv_request_uuid > ?";
        RowMapper<InvoiceRequest> rowMapper = new BeanPropertyRowMapper<>(InvoiceRequest.class);
        List<InvoiceRequest> request = jdbcTemplate.query(sql, rowMapper, 1);
        System.out.println(request);
    }
    
    /**
     * 从数据库中获取一条记录，实际得到对应的对象
     * 注意不是调用queryForObject(String sql, Class<InvoiceRequest> requiredType, Object... args) 这个方法
     * 1.RowMapper 指定如何去映射结果集的行，常用的实现类BeanPropertyRowMapper
     * 2.使用sql中使用列别名完成列名和类的属性名的映射
     */
    @Test
    public void testQueryForObject() {
        String sql = "select inv_request_uuid invRequestUuid, inv_request_num invRequestNum, request_company_cde requestCompanyCde from cbs_inv_request where inv_request_uuid = ?";
        RowMapper<InvoiceRequest> rowMapper = new BeanPropertyRowMapper<>(InvoiceRequest.class);
        InvoiceRequest request = jdbcTemplate.queryForObject(sql, rowMapper, 1);
        System.out.println(request);
    }
    
    /**
     * 执行批量更新
     * 最后一个参数是Object[]的list类型
     */
    @Test
    public void testBatchUpdate() {
        String sql = "insert into cbs_inv_request(inv_request_uuid,inv_request_num,request_company_cde,invoice_no) values(?,?,?,?)";
        List<Object[]> batchArgs = new ArrayList<Object[]>();
        batchArgs.add(new Object[]{5,"REQ201811180004","2407","33333"});
        batchArgs.add(new Object[]{6,"REQ201811180005","3251","66666"});
        jdbcTemplate.batchUpdate(sql, batchArgs);
    }
    
    /**
     * 执行Insert ,update,delete
     */
    @Test
    public void testUpdate(){
        String sql = "update cbs_inv_request set inv_request_num = ? where inv_request_uuid = ?";
        jdbcTemplate.update(sql, "REQ201811180002",1);
    }

    @Test
    public void testDataSource() throws SQLException {
       DataSource datasource = ctx.getBean(DataSource.class);
       System.out.println(datasource.getConnection());
    }

}
