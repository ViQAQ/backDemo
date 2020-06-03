package com.wj.module.customer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wj.common.domain.Response;
import com.wj.module.customer.domain.dto.CustomerDTO;

@Service
public class CustomerServiceImp implements CustomerService {

	@Autowired
	private CustomerDao customerDao;

	// 查询所有客户（已有）
	public Response<PageInfo<CustomerDTO>> selectAllCustomer(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		List<CustomerDTO> list = customerDao.selectAllCustomer();

		PageInfo<CustomerDTO> pageInfo = new PageInfo<>();
		pageInfo.setPageNum(pageNum);
		pageInfo.setPageSize(pageSize);
		pageInfo.setList(list);
		return Response.createBySuccess(pageInfo);

	}

	// 查看客户信息详情
	public CustomerDTO selectCustomerById(Long cid) {

		return customerDao.selectCustomerById(cid);
	}

}
