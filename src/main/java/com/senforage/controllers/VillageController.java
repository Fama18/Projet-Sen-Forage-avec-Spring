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

import com.senforage.entities.User;
import com.senforage.entities.Village;
import com.senforage.service.UserService;
import com.senforage.service.VillageService;

@Controller
public class VillageController {
	
	@Autowired
	VillageService villageService;
	@Autowired
	UserService userService;
	
	@RequestMapping("/Village/showCreateVillage")
	public String ShowCreateVillage(ModelMap modelMap) {
		List<User> uses = userService.getAllUsers();
		modelMap.addAttribute("users", uses);
		return "village/addVillage";
	}
	
	@RequestMapping("/Village/saveVillage")
	public String saveVillage(@ModelAttribute("village") Village village,
			ModelMap modelMap,HttpServletRequest req) throws ParseException {
		village.setUser(userService.getUser(4));
		Village saveVillage = villageService.saveVillage(village);
		String msg = "Village enregistré avec Id "+saveVillage.getId();
		modelMap.addAttribute("msg", msg);
		return "village/addVillage";
	}
	
	@RequestMapping("/Village/ListeVillages")
	public String listeVillages(ModelMap modelMap) {
			List<Village> vgs = villageService.getAllVillages();
			modelMap.addAttribute("villages", vgs);
			return "village/listeVillage";
	}
	
	@RequestMapping("/Village/supprimerVillage")
	public String supprimerVillage( @RequestParam("id") int id,
									ModelMap modelMap) {
			villageService.deleteVillageById(id);
			List<Village> vls = villageService.getAllVillages();
			modelMap.addAttribute("villages", vls);
			return "village/listeVillage";
	}
	
	@RequestMapping("/Village/modifierVillage")
	public String editerVillage( @RequestParam("id") int id,
									ModelMap modelMap) {
		Village v = villageService.getVillage(id);
		modelMap.addAttribute("Village", v);
		return "village/editerVillage";
			
	}
	
	@RequestMapping("/Village/updateVillage")
	public String updateVillage(@ModelAttribute("village") Village village,
            					ModelMap modelMap) throws ParseException {
		
		villageService.updateVillage(village);
		List<Village> vls = villageService.getAllVillages();
		modelMap.addAttribute("villages", vls);
		 return "village/editerVillage";
	}

}
