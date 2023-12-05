package com.example.demo.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table (name = "grupos")
public class Grupos {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "nombre")
	private String nombre;
	
	@ManyToOne
	@JoinColumn(name = "id_usuario")
	private Usuarios usuarios;
	
	@ManyToOne
	@JoinColumn(name = "id_videojuego")
	private Videojuegos videojuegos;
	
	public Grupos() {
		
	}
		
	public Grupos(int id, String nombre, Usuarios usuarios, Videojuegos videojuegos) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.usuarios = usuarios;
		this.videojuegos = videojuegos;
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
	public Usuarios getUsuarios() {
		return usuarios;
	}
	public void setUsuarios(Usuarios usuarios) {
		this.usuarios = usuarios;
	}
	public Videojuegos getVideojuegos() {
		return videojuegos;
	}
	public void setVideojuegos(Videojuegos videojuegos) {
		this.videojuegos = videojuegos;
	}
	
	@Override
	public String toString() {
		return "Grupos [id=" + id + ", nombre=" + nombre + ", usuarios=" + usuarios + "]";
	}
	
	
}	
