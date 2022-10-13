package com.api.cinema.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.cinema.entity.Diretor;
import com.api.cinema.service.DiretorService;

@RestController
@RequestMapping("/diretor")
public class DiretorController {
	@Autowired
	DiretorService diretorService;

	@GetMapping
	public ResponseEntity<List<Diretor>> getAllDiretor() {
		return new ResponseEntity<>(diretorService.getAllDiretor(), HttpStatus.OK);
	}
	@GetMapping("/{id}")
	public ResponseEntity<Diretor> getDiretorById(@PathVariable Integer id){
		Diretor diretor = diretorService.getDiretorById(id);
		if(null != diretor)
			return new ResponseEntity<>(diretor,
					HttpStatus.OK);
		else
			return new ResponseEntity<>(diretor,
					HttpStatus.NOT_FOUND);
	}
	@PostMapping
	public ResponseEntity<Diretor> saveDiretor(@RequestBody Diretor diretor) {
		return new ResponseEntity<>(diretorService.saveDiretor(diretor),
				HttpStatus.CREATED);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Diretor> updateDiretor(@RequestBody Diretor diretor, 
			@PathVariable Integer id){
		return new ResponseEntity<>(diretorService.updateDiretor(diretor, id),
				HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Diretor> deleteDiretor(@PathVariable Integer id) {
		return new ResponseEntity<>(diretorService.deleteDiretor(id),
				HttpStatus.OK);
	}
}
