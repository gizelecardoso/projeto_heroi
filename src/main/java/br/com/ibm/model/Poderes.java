package br.com.ibm.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Poderes {

	@Id
	private int id;
	private String poder;
	private Integer forca;
	
	@ManyToOne
	@JoinColumn(name = "heroi_id") 
	private Heroi heroi;
	
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
	
	public Heroi getHeroi() {
		return heroi;
	}
	
	public void setHeroi(Heroi heroi) {
		this.heroi = heroi;
	}
	
	
	
}
