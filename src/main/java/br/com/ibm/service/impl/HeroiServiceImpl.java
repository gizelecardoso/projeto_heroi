package br.com.ibm.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ibm.model.Heroi;
import br.com.ibm.repository.HeroiRepository;
import br.com.ibm.service.HeroiService;

@Service
public class HeroiServiceImpl implements HeroiService {

	@Autowired
	HeroiRepository repository;
	
	@Override
	public void salveHeroi(Heroi heroi) {
		repository.save(heroi);
		
	}

	@Override
	public void deletaHeroi(Integer id) {
		repository.deleteById(id);
	}

	@Override
	public Iterable<Heroi> consultaTodosHerois(Heroi heroi) {
		return repository.findAll();
		
	}


	@Override
	public Optional<Heroi> consultaHeroi(Integer id){
		
		return repository.findById(id);
	}

	@Override
	public void atualizarHeroi(Integer id, Heroi heroi) {
		
		//Optional<Heroi> opt = Optional.ofNullable(heroi);
		//assertFalse(opt.isPresent());
		
		
		if(consultaHeroi(id) == null) {
			
			//throw new NullPointerException("Heroi não cadastrado");
		}else {
			repository.save(heroi);
		}
		
	}

}
