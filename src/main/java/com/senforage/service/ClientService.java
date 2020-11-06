package com.senforage.service;

import java.util.List;

import com.senforage.entities.Client;

public interface ClientService {
	
	Client saveClient(Client c);
	Client updateClient(Client c);
	void deleteClient(Client c);
	void deleteClientById(int id);
	Client getClient(int id);
	List<Client> getAllClients();

}
