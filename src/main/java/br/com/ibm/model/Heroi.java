package br.com.ibm.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "heroi")
public class Heroi {
	
	@Id
	private int id;
	private String nome;
	private String universo;
	
	@OneToOne(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
	@JoinColumn(name = "parceiro_id", referencedColumnName = "id")
	private Heroi parceiro;

	@ManyToMany(mappedBy = "heroi", cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
	private List<Poderes> poder;
	
	
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

	public Heroi getParceiro() {
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
	}
	
	
	
	
	
}
