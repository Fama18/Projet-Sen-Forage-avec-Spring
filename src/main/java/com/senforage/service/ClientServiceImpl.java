package com.senforage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senforage.entities.Client;
import com.senforage.repos.ClientRepository;

@Service
public class ClientServiceImpl implements ClientService{
    
	@Autowired
	ClientRepository clientRepository;
	
	@Override
	public Client saveClient(Client c) {
		return clientRepository.save(c);
	}

	@Override
	public Client updateClient(Client c) {
		return clientRepository.save(c);
	}

	@Override
	public void deleteClient(Client c) {
		clientRepository.delete(c);
		
	}

	@Override
	public void deleteClientById(int id) {
		clientRepository.deleteById(id);
		
	}

	@Override
	public Client getClient(int id) {
		return clientRepository.findById(id).get();
	}

	@Override
	public List<Client> getAllClients() {
		return clientRepository.findAll();
	}

}
