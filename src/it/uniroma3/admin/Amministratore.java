package it.uniroma3.admin;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Amministratore {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(nullable = false)
	private String nickname;
	@Column(nullable = false)
	private String password;
	
	public Amministratore(String nickname, String password){
		this.nickname = nickname;
		this.password = password;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
	
	public boolean checkPwd(String password){
		return this.password.equals(password);
	}
	
	@Override
	public boolean equals(Object obj){
		Amministratore admin = (Amministratore)obj;
		return this.nickname.equals(admin.getNickname()) &&
				this.password.equals(admin.getPassword());
	}
	
	@Override
	public int hashCode(){
		return (this.nickname+this.password).hashCode();
	}
}
