package com.senforage.service;

import java.util.List;

import com.senforage.entities.Client;

public interface ClientService {
	
	Client saveClient(Client c);
	Client updateClient(Client c);
	void deleteClient(Client c);
	void deleteClientById(Long id);
	Client getClient(Long id);
	List<Client> getAllClients();

}
