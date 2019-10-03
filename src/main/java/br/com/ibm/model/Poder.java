package br.com.ibm.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "poder")
//@SequenceGenerator(initialValue = 1, name = "poder_sequence")
public class Poder {

	@Id
	//@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "poder_sequence")
	private int id;
	private String poder;
	private Integer forca;
	
	@ManyToMany(mappedBy = "poder")
	private List<Heroi> heroi;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPoder() {
		return poder;
	}
	public void setPoder(String poder) {
		this.poder = poder;
	}
	public Integer getForca() {
		return forca;
	}
	public void setForca(Integer forca) {
		this.forca = forca;
	}
	
	public List<Heroi> getHeroi() {
		return heroi;
	}
	
	public void setHeroi(List<Heroi> heroi) {
		this.heroi = heroi;
	}
	
	
	
}
