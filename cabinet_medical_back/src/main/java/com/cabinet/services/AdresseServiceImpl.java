package com.cabinet.services;

import java.util.List;

import com.cabinet.models.Adresse;
import com.cabinet.repositories.AdresseRepository;

public class AdresseServiceImpl implements AdresseService{
	
	private AdresseRepository adresseRepository;
	
	public AdresseServiceImpl (AdresseRepository adresseRepository) {
		this.adresseRepository = adresseRepository;
	}

	@Override
	public List<Adresse> findAll() {
		return this.adresseRepository.findAll();
	}

	@Override
	public Adresse findOne(Integer id) {
		return this.adresseRepository.findById(id).get();
	}

	@Override
	public Adresse save(Adresse adresse) {
		return this.adresseRepository.save(adresse);
	}

	@Override
	public void delete(Integer id) {
		this.adresseRepository.deleteById(id);
	}

}
