package br.com.ibm.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "heroi")
//@SequenceGenerator(initialValue = 1, name = "heroi_sequence")
public class Heroi {
	
	@Id
	//@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "heroi_sequence")
	private int id;
	private String nome;
	private String universo;
	
	@OneToOne(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
	private Heroi parceiro;

	@ManyToMany(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
	@JoinTable(name = "heroi_poder", joinColumns = @JoinColumn(name = "heroi_id"), inverseJoinColumns = @JoinColumn(name = "poder_id"))
	private List<Poder> poder;
	
	
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

	public List<Poder> getPoder() {
		return poder;
	}

	public void setPoder(List<Poder> poder) {
		this.poder = poder;
	}
	
	
	
	
	
}
