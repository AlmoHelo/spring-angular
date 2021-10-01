package com.cabinet.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.cabinet.models.enums.TypeSexe;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name= "patient")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Patient {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="nom")
	private String nom;
	
	@Column(name="prenom")
	private String prenom;

	@Column(name="date_de_naissance")
	private Date dateDeNaissance;

	@Column(name="sexe", columnDefinition="ENUM('Homme','Femme', 'Autre')")
	@Enumerated(EnumType.STRING)
	private TypeSexe sexe;
	
	@Column(name="numero_securite_sociale")
	private Long numeroSecuriteSociale;

	@ManyToOne
	private Adresse adresse;
	
	@ManyToOne
	private Infirmiere infirmiere;

}
