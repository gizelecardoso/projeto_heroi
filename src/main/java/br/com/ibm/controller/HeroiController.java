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
import br.com.ibm.service.HeroiService;

@RestController
@RequestMapping("/herois")
public class HeroiController {
	
	@Autowired
	private HeroiService heroiService;
	
	@GetMapping
	public Iterable<Heroi> mostraTodosHeroi(Heroi heroi) {
		return heroiService.consultaTodosHerois(heroi);
	}
	
	@GetMapping("/{id}")
	public Optional<Heroi> mostraHeroi(@PathVariable("id") Integer id, Heroi heroi) {
		
		return heroiService.consultaHeroi(id);
	}
	
	@DeleteMapping("/{id}")
	public void deletaHeroi(@PathVariable Integer id, Heroi heroi) {
		heroiService.deletaHeroi(id);
	} 
	

	@PostMapping
	public String incluir(@RequestBody Heroi heroi) {
		heroiService.salveHeroi(heroi);
		
		return "Cadastrado com sucesso";
	}
	
	@PutMapping("/{id}")
	public void atualizar(@PathVariable Integer id, @RequestBody Heroi heroi) {
		heroiService.atualizarHeroi(id, heroi);

		
		//por enquanto só funciona com produto já cadastrado, verificação se o id existe, não funciona ainda.
	}


}
