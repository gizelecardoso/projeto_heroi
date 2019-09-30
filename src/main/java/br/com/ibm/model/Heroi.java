package br.com.ibm.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Heroi {
	
	@Id
	private int id;
	private String nome;
	private String universo;
	
	//@OneToMany
	//private Heroi parceiro;

	//@OneToMany(mappedBy = "heroi")
	//private List<Poderes> poder;
	
	
	public Heroi() {}
	
	public Heroi(int id, String nome, String universo) {
		this.id = id;
		this.nome = nome;
		this.universo = universo;
		//this.parceiro = parceiro;
		//this.poder = poder;
		
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUniverso() {
		return universo;
	}

	public void setUniverso(String universo) {
		this.universo = universo;
	}

	/*public Heroi getParceiro() {
		return parceiro;
	}

	public void setParceiro(Heroi parceiro) {
		this.parceiro = parceiro;
	}

	public List<Poderes> getPoder() {
		return poder;
	}

	public void setPoder(List<Poderes> poder) {
		this.poder = poder;
	}*/
	
	
	
	
	
}
