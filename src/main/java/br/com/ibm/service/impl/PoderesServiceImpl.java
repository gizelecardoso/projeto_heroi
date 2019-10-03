package br.com.ibm.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ibm.model.Poder;
import br.com.ibm.repository.PoderesRepository;
import br.com.ibm.service.PoderesService;

@Service
public class PoderesServiceImpl implements PoderesService {

	@Autowired
	PoderesRepository repository;
	
	@Override
	public void salvePoderes(Poder poder) {
		repository.save(poder);
		
	}

	@Override
	public void deletaPoderes(Integer id) {
		repository.deleteById(id);
	}

	@Override
	public Optional<Poder> consultaPoderes(Integer id) {
		
		return repository.findById(id);
	}

	@Override
	public Iterable<Poder> consultaTodosPoderes(Poder poder) {
		
		return repository.findAll();
	}

	@Override
	public void atualizarPoderes(Integer id, Poder poder) {
		
		repository.findById(id);
		
		if(id == null) {
			throw new NullPointerException("Poder não encontrado");
		} else {
			repository.save(poder);
		}
		
	}

}
