package com.btg.test.service.impl;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;

import com.btg.test.model.entity.Account;
import com.btg.test.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService {

	@Override
	public boolean transfer(Account destinyAccount, BigDecimal value) {
		// TODO Auto-generated method stub
		return false;
	}
}
