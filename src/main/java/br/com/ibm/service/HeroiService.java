package br.com.ibm.service;

import java.util.Optional;

import br.com.ibm.model.Heroi;

public interface HeroiService {

	
	public void salveHeroi(Heroi heroi);
	
	public void deletaHeroi(Integer id);
	
	public Optional<Heroi> consultaHeroi(Integer id);
	
	public Iterable<Heroi> consultaTodosHerois(Heroi heroi);

	public void atualizarHeroi(Integer id, Heroi heroi);

	
}
