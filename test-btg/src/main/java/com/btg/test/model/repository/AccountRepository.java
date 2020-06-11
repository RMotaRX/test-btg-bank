package com.btg.test.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.btg.test.model.entity.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {
	
}
