package com.api.cinema.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.cinema.entity.Genero;

public interface GeneroRepository extends JpaRepository<Genero , Integer> {

}
