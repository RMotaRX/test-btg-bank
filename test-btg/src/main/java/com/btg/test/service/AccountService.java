package com.btg.test.service;

import java.math.BigDecimal;

import com.btg.test.model.entity.Account;

public interface AccountService {

	boolean transfer(Account destinyAccount, BigDecimal value);
}
