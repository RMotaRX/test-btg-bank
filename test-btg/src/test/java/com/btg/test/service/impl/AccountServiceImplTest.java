package com.btg.test.service.impl;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.btg.test.exception.InvalidActionException;
import com.btg.test.model.entity.Account;

@ExtendWith(SpringExtension.class)
@ActiveProfiles("qa")
@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@TestMethodOrder(OrderAnnotation.class)
public class AccountServiceImplTest {

	Account postTransfer = Account.builder()
								  .id(1L)
								  .destinyAccount("012345-6")
								  .owner("BTG Bank")
								  .balance(BigDecimal.valueOf(1000))
								  .build();
	
	Account getTransfer = Account.builder()
								 .id(37L)
								 .destinyAccount("654321-0")
								 .owner("Rafael Mota")
								 .balance(BigDecimal.ZERO)
							     .build();
	
	@Test
	@Order(1)
	public void transfer() {		
		if (getTransfer.getDestinyAccount().equals("654321-0")) {
			BigDecimal newBalanceGetTransfer = postTransfer.getBalance().subtract(BigDecimal.TEN);
			assertEquals(getTransfer.getDestinyAccount(), "654321-0");
			assertThat(newBalanceGetTransfer).isEqualTo(BigDecimal.valueOf(990));
		} else {
			throw new InvalidActionException("O Número da conta de destino não pertence ao " + getTransfer.getOwner());
		}		
	}		
}
