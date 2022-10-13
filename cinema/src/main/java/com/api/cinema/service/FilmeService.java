package com.api.cinema.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.cinema.entity.Filme;
import com.api.cinema.repository.FilmeRepository;

@Service
public class FilmeService {
	@Autowired
	FilmeRepository filmeRepository;

	public List<Filme> getAllFilme() {
		return filmeRepository.findAll();
	}

	public Filme getFilmeById(Integer id) {
		return filmeRepository.findById(id).orElse(null);
	}

	public Filme saveFilme(Filme filme) {
		return filmeRepository.save(filme);

	}

	public Filme updateFilme(Filme filme, Integer id) {

		Filme filmeExistenteNoBanco = getFilmeById(id);

		filmeExistenteNoBanco.setNomeBr(filme.getNomeBr());
		filmeExistenteNoBanco.setNomeEn(filme.getNomeEn());
		filmeExistenteNoBanco.setAnoLancamento(filme.getAnoLancamento());
		filmeExistenteNoBanco.setSinopse(filme.getSinopse());

		return filmeRepository.save(filmeExistenteNoBanco);
	}
	public Filme deleteFilme(Integer id) {
		filmeRepository.deleteById(id);
		return getFilmeById(id);
	}
	
}
