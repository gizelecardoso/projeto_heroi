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

import br.com.ibm.model.Heroi;
import br.com.ibm.model.Poderes;
import br.com.ibm.service.HeroiService;
import br.com.ibm.service.PoderesService;

@RestController
@RequestMapping("/herois")
public class SuperController {
	
	@Autowired
	private HeroiService heroiService;
	
	@Autowired
	private PoderesService poderesService;
	
	@GetMapping
	public Iterable<Heroi> mostraTodosHeroi(Heroi heroi) {
		return heroiService.consultaTodosHerois(heroi);
	}
	
	@GetMapping("/{id}")
	public Optional<Heroi> mostraHeroi(@PathVariable("id") Integer id, Heroi heroi) {
		
		return heroiService.consultaHeroi(id);
	}
	
	@DeleteMapping("/{id}")
	public void deletaHeroi(@PathVariable("id") Integer id, Heroi heroi) {
		heroiService.deletaHeroi(id);
	} 
	

	@PostMapping
	public String incluir(@RequestBody Heroi heroi) {
		heroiService.salveHeroi(heroi);
		
		return "Cadastrado com sucesso";
	}
	
	@PutMapping("/{id}")
	public String atualizar(@PathVariable("id") Integer id, @RequestBody Heroi heroi) {
		heroiService.atualizarHeroi(id, heroi);

		return "Atualizado com sucesso";
		
		//por enquanto só funciona com produto já cadastrado, verificação se o id existe, não funciona ainda.
	}
	
	
	@GetMapping
	public Iterable<Poderes> mostraTodosPodere(Poderes poder) {
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
