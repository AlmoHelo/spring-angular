package com.cabinet.services;

import java.util.List;

import com.cabinet.models.Infirmiere;
import com.cabinet.repositories.InfirmiereRepository;

public class InfirmiereServiceImpl implements InfirmiereService {
	
	private InfirmiereRepository infirmiereRepository;
	
	public InfirmiereServiceImpl (InfirmiereRepository infirmiereRepository) {
		this.infirmiereRepository = infirmiereRepository;
	}
	
	@Override
	public List<Infirmiere> findAll() {
		return this.infirmiereRepository.findAll();
	}

	@Override
	public Infirmiere findOne(Integer id) {
		return this.infirmiereRepository.findById(id).get();
	}

	@Override
	public Infirmiere save(Infirmiere infirmiere) {
		return this.infirmiereRepository.save(infirmiere);
	}

	@Override
	public void delete(Integer id) {
		this.infirmiereRepository.deleteById(id);
	}

}
