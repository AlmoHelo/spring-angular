package com.cabinet.services;

import java.util.List;

import com.cabinet.models.Deplacement;

public interface DeplacementService {

	List<Deplacement> findAll();

	Deplacement findOne(Integer id);

	Deplacement save(Deplacement deplacement);

	void delete(Integer id);

}
