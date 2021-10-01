package com.cabinet.services;

import java.util.List;

import com.cabinet.models.Infirmiere;

public interface InfirmiereService {

	List<Infirmiere> findAll();

	Infirmiere findOne(Integer id);

	Infirmiere save(Infirmiere infirmiere);

	void delete(Integer id);

}
