package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.dto.Mensajes;

public interface IMensajesDAO extends JpaRepository<Mensajes,Integer> {
	
}
