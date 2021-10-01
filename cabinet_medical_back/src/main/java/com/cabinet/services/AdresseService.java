package com.cabinet.services;

import java.util.List;

import com.cabinet.models.Adresse;

public interface AdresseService {

	List<Adresse> findAll();

	Adresse findOne(Integer id);

	Adresse save(Adresse adresse);

	void delete(Integer id);

}
