package com.example.demo.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table (name="usuarios")
public class Usuarios {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//busca último valor e incrementa desde la id final del db
	private int id;
	@Column(name = "nombre")
	private String nombre;
	@Column(name= "password")
	private int password;
	@Column(name= "pais")
	private String pais;
	
	@OneToMany
	@JoinColumn(name = "id")
	private List <Mensajes> mensajes;
	
	@OneToMany
	@JoinColumn(name = "id")
	private List <Grupos> grupos;
	
	//Constructores
	public Usuarios() {
		
	}	
	
	public Usuarios(int id, String nombre, int password, String pais) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.password = password;
		this.pais = pais;
	}
	
	//Getters y setters

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPassword() {
		return password;
	}

	public void setPassword(int password) {
		this.password = password;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	//return
	@JsonIgnore
	@OneToMany(fetch=FetchType.LAZY, mappedBy = "Mensajes")
	public List<Mensajes> getMensajes(){
		return mensajes;
	}

	public void setMensajes(List<Mensajes> mensajes) {
		this.mensajes = mensajes;
	}
	
	@JsonIgnore	
	@OneToMany(fetch=FetchType.LAZY, mappedBy = "Grupos")
	public List<Grupos> getGrupos() {
		return grupos;
	}

	public void setGrupos(List<Grupos> grupos) {
		this.grupos = grupos;
	}

	@Override
	public String toString() {
		return "Usuarios [id=" + id + ", nombre=" + nombre + ", password=" + password + ", pais=" + pais + "]";
	}
	
}
