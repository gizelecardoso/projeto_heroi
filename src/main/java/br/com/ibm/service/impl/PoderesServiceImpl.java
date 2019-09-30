package br.com.ibm.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.ibm.model.Poderes;
import br.com.ibm.repository.PoderesRepository;
import br.com.ibm.service.PoderesService;

public class PoderesServiceImpl implements PoderesService {

	@Autowired
	PoderesRepository repository;
	
	@Override
	public void salvePoderes(Poderes poder) {
		repository.save(poder);
		
	}

	@Override
	public void deletaPoderes(Integer id) {
		repository.deleteById(id);
	}

	@Override
	public Optional<Poderes> consultaPoderes(Integer id) {
		
		return repository.findById(id);
	}

	@Override
	public Iterable<Poderes> consultaTodosPoderes(Poderes poder) {
		
		return repository.findAll();
	}

	@Override
	public void atualizarPoderes(Integer id, Poderes poder) {
		
		repository.findById(id);
		
		if(id == null) {
			throw new NullPointerException("Poder não encontrado");
		} else {
			repository.save(poder);
		}
		
	}

}
