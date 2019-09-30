package br.com.ibm.service;

import java.util.Optional;

import br.com.ibm.model.Poderes;

public interface PoderesService {
	
	public void salvePoderes(Poderes poder);
	
	public void deletaPoderes(Integer id);
	
	public Optional<Poderes> consultaPoderes(Integer id);
	
	public Iterable<Poderes> consultaTodosPoderes(Poderes poder);

	public void atualizarPoderes(Integer id, Poderes poder);


}
