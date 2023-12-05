package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.dto.Videojuegos;

public interface IVideojuegosDAO extends JpaRepository<Videojuegos,Integer> {

}
