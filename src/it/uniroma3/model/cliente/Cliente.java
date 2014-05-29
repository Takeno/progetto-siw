package it.uniroma3.model.cliente;

import it.uniroma3.model.indirizzo.Indirizzo;
import it.uniroma3.model.ordine.Ordine;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(nullable = false)
	private String nome;
	@Column(nullable = false)
	private String cognome;
	@Column(unique = true, nullable = false)
	private String nickname;
	@Column(nullable = false)
	private String password;
	@Temporal(TemporalType.DATE)
	private Calendar dateOfBirth;
	@Temporal(TemporalType.DATE)
	private Calendar registrationDate;
	@OneToOne
	private Indirizzo indirizzo;
	@OneToMany(mappedBy = "cliente")
	private List<Ordine> ordini;
	
	
	public Cliente(String nome, String cognome, String nickname,
			String password, Calendar dateOfBirth, Indirizzo indirizzo) {
		this.nome = nome;
		this.cognome = cognome;
		this.nickname = nickname;
		this.password = password;
		this.dateOfBirth = dateOfBirth;
		this.indirizzo = indirizzo;
		this.registrationDate = Calendar.getInstance();
		this.ordini = new ArrayList<Ordine>();
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCognome() {
		return cognome;
	}


	public void setCognome(String cognome) {
		this.cognome = cognome;
	}


	public String getNickname() {
		return nickname;
	}


	public void setNickname(String nickname) {
		this.nickname = nickname;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public Calendar getDateOfBirth() {
		return dateOfBirth;
	}


	public void setDateOfBirth(Calendar dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}


	public Calendar getRegistrationDate() {
		return registrationDate;
	}


	public void setRegistrationDate(Calendar registrationDate) {
		this.registrationDate = registrationDate;
	}


	public Indirizzo getIndirizzo() {
		return indirizzo;
	}


	public void setIndirizzo(Indirizzo indirizzo) {
		this.indirizzo = indirizzo;
	}


	public List<Ordine> getOrdini() {
		return ordini;
	}


	public void setOrdini(List<Ordine> ordini) {
		this.ordini = ordini;
	}
	
	@Override
	public boolean equals(Object obj){
		Cliente cust = (Cliente)obj;
		return this.nickname.equals(cust.getNickname());
	}
	
	@Override
	public int hashCode(){
		return this.indirizzo.hashCode()+this.nickname.hashCode();
	}
	
	
	
}
