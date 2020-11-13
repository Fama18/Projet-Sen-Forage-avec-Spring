package com.senforage.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Roles {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String libelle;
	@ManyToMany(mappedBy = "roles")
	private List<User> users = new ArrayList<User>();
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public Roles(int id, String libelle) {
		super();
		this.id = id;
		this.libelle = libelle;
	}
	public Roles() {
		super();
	}
	@Override
	public String toString() {
		return "Roles [id=" + id + ", libelle=" + libelle + "]";
	}
	public List<User> getUsers() {
		return users;
	}
	public void setUsers(List<User> users) {
		this.users = users;
	}

}
