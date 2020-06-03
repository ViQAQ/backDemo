package com.wj.module.customer;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.wj.module.customer.domain.dto.CustomerDTO;

@Mapper
public interface CustomerDao {
	//查询所有客户（已有）
	List<CustomerDTO> selectAllCustomer();
	
	//查看客户信息详情
	CustomerDTO selectCustomerById(@Param("cid") Long cid);

}
