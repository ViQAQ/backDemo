package com.wj.module.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageInfo;
import com.wj.common.domain.Response;
import com.wj.module.customer.domain.dto.CustomerDTO;

@RequestMapping("/customer")
@RestController
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	// 查询客户列表全部信息(已有)
	@GetMapping("/select")
	public Response<PageInfo<CustomerDTO>> selectAll(final int pageNum,final int pageSize) {
	
		return customerService.selectAllCustomer(pageNum,pageSize);
	}

	// 查询客户信息详情
	@GetMapping("/selectById/{cid}")
	public Response<CustomerDTO> selectById(@PathVariable("cid")Long cid) {

		return Response.createBySuccess(customerService.selectCustomerById(cid));
	}

}
