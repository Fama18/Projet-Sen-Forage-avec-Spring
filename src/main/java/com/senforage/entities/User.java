package com.senforage.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;


@Entity
public class User{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nom;
	private String prenom;
	private String email;
	private String password;
	private int etat;
	@OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    private List<Client> clients = new ArrayList<Client>();
	@OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    private List<Village> villages = new ArrayList<Village>();
	@ManyToMany
	private List<Roles> roles = new ArrayList<Roles>();
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public int getEtat() {
		return etat;
	}
	public void setEtat(int etat) {
		this.etat = etat;
	}
	public List<Client> getClients() {
		return clients;
	}
	public void setClients(List<Client> clients) {
		this.clients = clients;
	}
	public List<Village> getVillages() {
		return villages;
	}
	public void setVillages(List<Village> villages) {
		this.villages = villages;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", email=" + email + ", password=" + password
				+ ", clients=" + clients + ", villages=" + villages + "]";
	}
	public User(int id, String nom, String prenom, String email, String password, List<Client> clients,
			List<Village> villages) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.password = password;
		this.clients = clients;
		this.villages = villages;
	}
	public User() {
		super();
	}
	public List<Roles> getRoles() {
		return roles;
	}
	public void setRoles(List<Roles> roles) {
		this.roles = roles;
	}

}
