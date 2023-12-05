package com.example.demo.services;

import java.util.List;

import com.example.demo.dto.Usuarios;

public interface IUsuariosService {
	public Usuarios guardar(Usuarios usuarios); //Guardar-Crear
	public Usuarios seleccionarXID (Integer id); //Leer datos de un ID
	public Usuarios actualizar(Usuarios usuarios); //UPDATE
}
