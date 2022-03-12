package com.guusto.tx.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.guusto.tx.dto.balanceResponse;
import com.guusto.tx.entity.client_dtls;
import com.guusto.tx.repository.clientRepository;

@Service
public class balanceService {
	@Autowired
	private clientRepository clientRepo;
	balanceResponse resp = new balanceResponse();
	@Transactional
	public balanceResponse getCustBalance(Integer reqclientId) {
		client_dtls cl;
		//Integer clientId = reqclientId//Integer.parseInt(String.valueOf(reqclientId));
		cl = clientRepo.getByClientId(reqclientId);
		resp.setBalance(cl.getBalance());
		return resp;
	}
}
