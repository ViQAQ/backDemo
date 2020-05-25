package com.test.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.test.demo.entity.CustomerInfo;

@Mapper
public interface CustomerDao {
	List<CustomerInfo> selectAllCustomer();
	

}
