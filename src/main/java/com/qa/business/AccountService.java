package com.qa.business;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qa.persistence.domain.Account;
import com.qa.persistence.repository.IAccountRepo;

@Service
public class AccountService implements IAccountService {

	@Autowired
	private IAccountRepo accountRepo;

	@Override
	public List<Account> getAllAccounts() {
		return accountRepo.findAll().stream().collect(Collectors.toList());
	}
	
	@Override
	public Account getAnAccount(Integer id) {
		return accountRepo.getOne(id);
	}
	
	public Account addAccount(Account account) {
		// TODO Auto-generated method stub
		return accountRepo.save(account);
	}

	

}
