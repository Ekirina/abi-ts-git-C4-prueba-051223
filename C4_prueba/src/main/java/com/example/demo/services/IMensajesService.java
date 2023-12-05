package com.example.demo.services;

import java.util.List;

import com.example.demo.dto.Mensajes;


public interface IMensajesService {
	public List<Mensajes> listar(); //Listar ALL
	public Mensajes guardar(Mensajes mensajes); //Guardar-crear
	public Mensajes seleccionarXID (Integer mensajes); //Leer datos
	public Mensajes actualizar(Mensajes mensajes); //UPDATE
	public void eliminar (Integer mensaje); //DELETE
}
