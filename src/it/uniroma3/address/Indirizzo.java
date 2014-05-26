package it.uniroma3.address;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Indirizzo {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column(nullable = false)
	private String via;
	@Column(nullable = false)
	private Integer civico;
	@Column(nullable = false)
	private String citta;
	private String stato;
	@Column(nullable = false)
	private String nazione;
	@Column(nullable = false)
	private Integer zipcode;
	
	
	public Indirizzo(long id, String via, Integer civico, String citta,
			String nazione, Integer zipcode) {
		this.id = id;
		this.via = via;
		this.civico = civico;
		this.citta = citta;
		this.nazione = nazione;
		this.zipcode = zipcode;
	}


	public Indirizzo(String via, Integer civico, String citta, String stato,
			String nazione, Integer zipcode) {
		this.via = via;
		this.civico = civico;
		this.citta = citta;
		this.stato = stato;
		this.nazione = nazione;
		this.zipcode = zipcode;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getVia() {
		return via;
	}


	public void setVia(String via) {
		this.via = via;
	}


	public Integer getCivico() {
		return civico;
	}


	public void setCivico(Integer civico) {
		this.civico = civico;
	}


	public String getCitta() {
		return citta;
	}


	public void setCitta(String citta) {
		this.citta = citta;
	}


	public String getStato() {
		return stato;
	}


	public void setStato(String stato) {
		this.stato = stato;
	}


	public String getNazione() {
		return nazione;
	}


	public void setNazione(String nazione) {
		this.nazione = nazione;
	}


	public Integer getZipcode() {
		return zipcode;
	}


	public void setZipcode(Integer zipcode) {
		this.zipcode = zipcode;
	}


	@Override
	public int hashCode() {
		return (this.via+this.civico+this.citta).hashCode();
	}


	@Override
	public boolean equals(Object obj) {
		Indirizzo addr = (Indirizzo)obj;
		return this.nazione.equals(addr.getNazione()) &&
				this.citta.equals(addr.getCitta()) &&
				this.via.equals(addr.getVia()) &&
				this.civico.equals(addr.getCivico());
	}
	
	
}
