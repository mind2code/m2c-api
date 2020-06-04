package com.mind2codes.flutterdemo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

import com.mind2codes.flutterdemo.domain.Clients;
import com.mind2codes.flutterdemo.repository.ClientsRepository;

@Service
public class ClientService {

	@Autowired
	ClientsRepository clientRepository;
	
	public List<Clients> getClients() {
		return clientRepository.findAll();
	}
	
	public Clients createClient(Clients clients) {
		return clientRepository.save(clients);
	}
}
