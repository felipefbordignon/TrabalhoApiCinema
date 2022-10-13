package com.api.cinema.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.cinema.entity.Filme;

public interface FilmeRepository extends JpaRepository<Filme , Integer> {

}
