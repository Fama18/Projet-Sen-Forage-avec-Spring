package com.senforage.controllers;

import java.text.ParseException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.senforage.entities.Client;
import com.senforage.entities.User;
import com.senforage.entities.Village;
import com.senforage.service.ClientService;
import com.senforage.service.UserService;
import com.senforage.service.VillageService;

@Controller
public class ClientController {
	
	@Autowired
	ClientService clientService;
	@Autowired
	VillageService villageService;
	@Autowired
	UserService userService;
	
	@RequestMapping("/Client/showCreate")
	public String ShowCreate(ModelMap modelMap) {
		List<Village> vls = villageService.getAllVillages();
		modelMap.addAttribute("villages", vls);
		List<User> uses = userService.getAllUsers();
		modelMap.addAttribute("users", uses);
		return "client/addClient";
	}
	
	@RequestMapping("/Client/saveClient")
	public String saveClient(@ModelAttribute("client") Client client,
			ModelMap modelMap,HttpServletRequest req) throws ParseException {
		client.setVillage(villageService.getVillage(Integer.parseInt(req.getParameter("village_id"))));
		client.setUser(userService.getUser(4));
		Client saveClient = clientService.saveClient(client);
		String msg = "client enregistré avec Id "+saveClient.getId();
		modelMap.addAttribute("msg", msg);
		return "client/addClient";
	}
	
	@RequestMapping("/Client/ListeClients")
	public String listeClients(ModelMap modelMap) {
			List<Client> cls = clientService.getAllClients();
			modelMap.addAttribute("clients", cls);
			return "client/listeClient";
	}
	
	@RequestMapping("/Client/supprimerClient")
	public String supprimerClient( @RequestParam("id") int id,
									ModelMap modelMap) {
			clientService.deleteClientById(id);
			List<Client> cls = clientService.getAllClients();
			modelMap.addAttribute("clients", cls);
			return "client/listeClient";
	}
	
	@RequestMapping("/Client/modifierClient")
	public String editerClient( @RequestParam("id") int id,
									ModelMap modelMap) {
		Client c = clientService.getClient(id);
		modelMap.addAttribute("client", c);
		return "client/editerClient";
			
	}
	
	@RequestMapping("/Client/updateClient")
	public String updateClient(@ModelAttribute("client") Client client,
            					ModelMap modelMap) throws ParseException {
		
		 clientService.updateClient(client);
		 List<Client> cls = clientService.getAllClients();
		 modelMap.addAttribute("clients", cls);
		 return "client/editerClient";
	}
}


