package com.hcl.bankingapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.bankingapp.entity.Account;
import com.hcl.bankingapp.entity.UserDetails;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {
	



	
	public List<Account> findByAccountNo(Long accountno);
	
//	public Account findByAccountNo(Long accountno);


	public List<Account> findByUserDetails(UserDetails userDetails);

}
