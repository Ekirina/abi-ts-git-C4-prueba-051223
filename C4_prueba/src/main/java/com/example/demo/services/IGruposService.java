package com.example.demo.services;

import java.util.List;

import com.example.demo.dto.Grupos;


public interface IGruposService {
	public List<Grupos> listar(); //Listar ALL
	public Grupos guardar(Grupos grupos); //Guardar-crear
	public Grupos seleccionarXID (Integer id); //Leer datos
}
