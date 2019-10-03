package br.com.ibm.service;

import java.util.Optional;

import br.com.ibm.model.Poder;

public interface PoderesService {
	
	public void salvePoderes(Poder poder);
	
	public void deletaPoderes(Integer id);
	
	public Optional<Poder> consultaPoderes(Integer id);
	
	public Iterable<Poder> consultaTodosPoderes(Poder poder);

	public void atualizarPoderes(Integer id, Poder poder);


}
