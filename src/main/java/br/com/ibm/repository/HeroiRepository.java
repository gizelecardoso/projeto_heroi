package br.com.ibm.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.ibm.model.Heroi;

public interface HeroiRepository extends CrudRepository<Heroi, Integer>{
	
}
