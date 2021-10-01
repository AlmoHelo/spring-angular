package com.cabinet.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name= "adresse")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Adresse {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="numero")
	private String numero;
	
	@Column(name="rue")
	private String rue;

	@Column(name="cp")
	private String cp;

	@Column(name="ville")
	private String ville;

//	@OneToMany
//	@JoinColumn(name="infirmiere_id", referencedColumnName = "id")
//	private Infirmiere infirmiere;
//
//	@OneToMany
//	@JoinColumn(name="patient_id", referencedColumnName = "id")
//	private Patient patient;

}
