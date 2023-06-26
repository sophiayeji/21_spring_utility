package com.spring.utility.transaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TransactionService {

	@Autowired
	private TransactionDAO transactionDAO;
	
	@Transactional
	public void addAccountTransfer() throws Exception {
		transactionDAO.updateSendMoney();
		//System.out.println(1/0); 	// 문제 발생
		transactionDAO.updateRecvMoney();
	}
	@Transactional
	public void addOrder() throws Exception {
		transactionDAO.updatePoint();
		transactionDAO.updateCartCnt();
		//System.out.println(1/0);	// 문제 발생
		transactionDAO.updateOrderCnt();
	}
	
	
	
}
