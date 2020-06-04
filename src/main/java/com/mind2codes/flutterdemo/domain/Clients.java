package com.mind2codes.flutterdemo.domain;

import javax.persistence.*;

@Entity
@Table(name="clients")
public class Clients {

	@Id
	@GeneratedValue(generator="clients_id_seq")
	private long id;
	
	@Column(name="nom")
	private String nom;
	
	@Column(name="prenoms")
	private String prenoms;
	
	@Column(name="age")
	private long age;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenoms() {
		return prenoms;
	}

	public void setPrenoms(String prenoms) {
		this.prenoms = prenoms;
	}

	public long getAge() {
		return age;
	}

	public void setAge(long age) {
		this.age = age;
	}

	public Clients() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
