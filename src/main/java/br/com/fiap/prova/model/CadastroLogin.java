package br.com.fiap.prova.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CadastroLogin {
    
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id; 
	
	@Column(nullable = false)
	private String email; 
	private String primeiroNome; 
	private String segundoNome;
    private String senha;
	
	public CadastroLogin() {
		
	}
	
	public CadastroLogin(Long id, String email, String primeiroNome, String segundoNome, String senha) {
		super();
		this.id = id;
		this.email = email;
		this.primeiroNome = primeiroNome;
		this.segundoNome = segundoNome;
        this.senha = senha;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return this.email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String getPrimeiroNome() {
		return this.primeiroNome;
	}
	public void setPrimeiroNome(String primeiroNome) {
		this.primeiroNome = primeiroNome;
	}

	public String getSegundoNome() {
		return this.segundoNome;
	}
	public void setSegundoNome(String segundoNome) {
		this.segundoNome = segundoNome;
	}

    public String getSenha() {
		return this.senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}

}
