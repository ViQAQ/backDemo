package com.test.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.test.demo.entity.CustomerInfo;
import com.test.demo.service.CustomerService;

@Controller
public class IndexController {

	@Autowired
	CustomerService customerService;
	
	@RequestMapping("/select")	
	public String index(Model model){
		
		List<CustomerInfo> cInfoList = customerService.selectAllCustomer();
		model.addAttribute("cInfoList", cInfoList);
		
		return "user_info";
	}
	

}
