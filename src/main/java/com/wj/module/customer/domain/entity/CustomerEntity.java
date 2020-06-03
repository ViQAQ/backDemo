package com.wj.module.customer.domain.entity;

import java.io.Serializable;
import java.sql.Date;

import lombok.Data;


@Data
public class CustomerEntity  implements Serializable{
	

	private static final long serialVersionUID = 6686311470181731466L;
	//编号
	Long cId;
	//客户名
	String cName;
	//地址
	String cAddress;
	//联系人名称
	String contactName;
	//联系邮箱
	String contactMail;
	//联系电话
	String contactPhone;
	//销售负责人
	String salesName;
	//交付负责人
	String deliverName;
	//纳税人识别号
	String taxpayerId;
	//开户行
	String openingBank;
	//账号
	String bankAccount;
	//是否免税
	Integer isTaxfree;
	//免税额度
	Long taxfreeAmount;
	//备注
	String remark;
	//客户类型
	Integer isCustomer;
	//创建时间
	Date createTime;
	//操作时间
	Date updateTime;
	//操作者
	String updateUser;
	//是否删除
	Integer isDeleted;
	
	
}
