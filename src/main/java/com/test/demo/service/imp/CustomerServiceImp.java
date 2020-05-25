package com.test.demo.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.demo.dao.CustomerDao;
import com.test.demo.entity.CustomerInfo;
import com.test.demo.service.CustomerService;

@Service
public class CustomerServiceImp implements CustomerService{
	
	@Autowired
	CustomerDao customerDao;
	
	public List<CustomerInfo> selectAllCustomer() {
		List<CustomerInfo> list= customerDao.selectAllCustomer();
		return list;
	}

}
