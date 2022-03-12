package com.guusto.tx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.guusto.tx.dto.balanceResponse;
import com.guusto.tx.service.balanceService;

@RestController
public class customerBalanceController {	
	
	@Autowired
	private balanceService service;
	@RequestMapping("/guusto-service/custBalance/{clientId}")
	public balanceResponse getCustBalance(@PathVariable("clientId") Integer clientId){
		return service.getCustBalance(clientId);
		
	}

}
