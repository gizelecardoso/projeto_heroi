package br.com.ibm.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.ibm.model.Heroi;
import br.com.ibm.model.Poderes;

@Controller
public class SuperController {
	
	@RequestMapping("/herois")
	public List<Heroi> mostraHeroi(Model Heroi){
		
		Heroi heroi1 = new Heroi(1, "Batman", "qualquer", new Heroi(), (List<Poderes>) new Poderes());
		Heroi heroi2 = new Heroi(1, "Batman", "qualquer", new Heroi(), (List<Poderes>) new Poderes());
		
		return Arrays.asList(heroi1, heroi2);
	}
	
}
