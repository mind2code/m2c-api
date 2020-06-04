package com.mind2codes.flutterdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mind2codes.flutterdemo.domain.Clients;
import com.mind2codes.flutterdemo.services.ClientService;

import java.util.*;

@RestController
public class ClientController {

	@Autowired
	ClientService clientService;
	
	@GetMapping("/clients")
	public ResponseEntity<List<Clients>> getClients() {
		return ResponseEntity.ok(clientService.getClients());
	}
	
	@PostMapping("/clients")
	public ResponseEntity<Clients> createClients(@RequestBody Clients client) {
		return ResponseEntity.ok(clientService.createClient(client));
	}
}
