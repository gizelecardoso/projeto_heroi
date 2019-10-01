package br.com.ibm.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ibm.model.Poderes;
import br.com.ibm.service.PoderesService;

@RestController
@RequestMapping("/poderes")
public class PoderesController {
	
	@Autowired
	private PoderesService poderesService;
	
		
	
	@GetMapping
	public Iterable<Poderes> mostraTodosPoderes(Poderes poder) {
		return poderesService.consultaTodosPoderes(poder);
	}
	
	@GetMapping("/{id}")
	public Optional<Poderes> mostraPoderes(@PathVariable("id") Integer id, Poderes poder) {
		
		return poderesService.consultaPoderes(id);
	}
	
	@DeleteMapping("/{id}")
	public void deletaPoderes(@PathVariable("id") Integer id, Poderes poder) {
		poderesService.deletaPoderes(id);
	} 
	

	@PostMapping
	public String incluir(@RequestBody Poderes poder) {
		poderesService.salvePoderes(poder);
		
		return "Cadastrado com sucesso";
	}
	
	@PutMapping("/{id}")
	public String atualizar(@PathVariable("id") Integer id, @RequestBody Poderes poder) {
		poderesService.atualizarPoderes(id, poder);

		return "Atualizado com sucesso";
		
		//por enquanto só funciona com produto já cadastrado, verificação se o id existe, não funciona ainda.
	}



}
