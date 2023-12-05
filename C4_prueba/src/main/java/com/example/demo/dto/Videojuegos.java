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
import jakarta.persistence.Table;

@Entity
@Table (name = "videojuegos")
public class Videojuegos {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//busca último valor e incrementa desde la id final del db
	private int id;
	@Column(name = "nombre")
	private String nombre;
	
	@OneToMany
	@JoinColumn (name = "id")
	private List <Grupos> grupos;
	
	//Constructores
	public Videojuegos() {
		
	}

	public Videojuegos(int id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
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
	@JsonIgnore
	@OneToMany(fetch=FetchType.LAZY, mappedBy = "Grupos")
	public List<Grupos> getGrupos() {
		return grupos;
	}

	public void setGrupos(List<Grupos> grupos) {
		this.grupos = grupos;
	}
	
	
}
