package com.qa.rest;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.business.AccountService;
import com.qa.persistence.domain.Account;

@RestController
public class AccountController {

	@Autowired
	public AccountService service;

	@RequestMapping("/getAccount")
	public List<Account> getAllAccounts() {

		return service.getAllAccounts();
	}

	@RequestMapping("/getAccount/{id}")
	public Account getAnAccount(@PathVariable Integer id) {

		return service.getAnAccount(5);

	}
	
	@PostMapping("/addAccount/{firstName}")
	public Account addAccount(@PathVariable String firstName) {
		return service.addAccount(new Account(firstName));
	}
}
