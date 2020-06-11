package com.btg.test.model.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Builder
@Table(name = "account", schema = "transfer")
@NoArgsConstructor
@AllArgsConstructor
public class Account {
	
	@Id	
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "number_account")
	private String destinyAccount;
	
	@Column(name = "customer")
	private String owner;
	
	@Column(name = "balance")
	private BigDecimal balance;
}
