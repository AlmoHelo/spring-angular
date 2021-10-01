package com.cabinet.services;

import java.util.List;

import com.cabinet.models.Deplacement;
import com.cabinet.repositories.DeplacementRepository;

public class DeplacementServiceImpl implements DeplacementService{

	private DeplacementRepository deplacementRepository;
	
	public DeplacementServiceImpl (DeplacementRepository deplacementRepository) {
		this.deplacementRepository = deplacementRepository;
	}
	@Override
	public List<Deplacement> findAll() {
		return this.deplacementRepository.findAll();
	}

	@Override
	public Deplacement findOne(Integer id) {
		return this.deplacementRepository.findById(id).get();
	}

	@Override
	public Deplacement save(Deplacement deplacement) {
		return this.deplacementRepository.save(deplacement);
	}

	@Override
	public void delete(Integer id) {
		this.deplacementRepository.deleteById(id);
	}

}
