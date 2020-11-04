package com.senforage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senforage.entities.Village;
import com.senforage.repos.VillageRepository;

@Service
public class VillageServiceImpl implements VillageService{
	
	@Autowired
	VillageRepository villageRepository;

	@Override
	public Village saveVillage(Village v) {
		return villageRepository.save(v);
	}

	@Override
	public Village updateVillage(Village v) {
		return villageRepository.save(v);
	}

	@Override
	public void deleteVillage(Village v) {
		villageRepository.delete(v);
		
	}

	@Override
	public void deleteVillageById(Long id) {
		villageRepository.deleteById(id);
		
	}

	@Override
	public Village getVillage(Long id) {
		return villageRepository.findById(id).get();
	}

	@Override
	public List<Village> getAllVillages() {
		return villageRepository.findAll();
	}

}
