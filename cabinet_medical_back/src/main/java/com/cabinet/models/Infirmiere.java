package com.cabinet.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name= "infirmiere")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Infirmiere {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="nom")
	private String nom; 
	
	@Column(name="numero_professionnel")
	private Integer numeroProfessionnel;
	
	@Column(name="prenom")
	private String prenom;

	@Column(name="tel_pro")
	private String telPro;
	
	@Column(name="tel_perso")
	private String telPerso;

	@ManyToOne
	private Adresse adresse;

//	@OneToMany(cascade = CascadeType.ALL)
//	private Set<Patient> patient;
	
}
