package com.senforage.service;

import java.util.List;

import com.senforage.entities.Village;

public interface VillageService {
	
	Village saveVillage(Village v);
	Village updateVillage(Village v);
	void deleteVillage(Village v);
	void deleteVillageById(int id);
	Village getVillage(int id);
	List<Village> getAllVillages();

}
