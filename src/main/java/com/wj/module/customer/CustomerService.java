package com.wj.module.customer;

import com.github.pagehelper.PageInfo;
import com.wj.common.domain.Response;
import com.wj.module.customer.domain.dto.CustomerDTO;

public interface CustomerService {
	
	//查询所有客户（已有）
	Response<PageInfo<CustomerDTO>> selectAllCustomer(int pageNum,int pageSize);
	
	//查看客户信息详情
	CustomerDTO selectCustomerById(Long cid);
}
