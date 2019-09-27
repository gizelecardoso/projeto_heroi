package br.com.ibm.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Poderes {

	@Id
	private int id;
	private String poder;
	private Integer forca;
	
	
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
	
	
	
}
