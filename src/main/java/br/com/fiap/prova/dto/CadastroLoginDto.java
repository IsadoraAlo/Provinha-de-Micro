package br.com.fiap.prova.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class CadastroLoginDto {
    private Long id;

	@NotBlank
	@NotNull
	private String email; 

    @NotBlank
	@NotNull
    private String primeiroNome; 

	@NotBlank
	@NotNull
    private String segundoNome; 

	@NotBlank
	@NotNull
    private String senha; 
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String getPrimeiroNome() {
		return primeiroNome;
	}
	public void setPrimeiroNome(String primeiroNome) {
		this.primeiroNome = primeiroNome;
	}

    public String getSegundoNome() {
		return segundoNome;
	}
	public void setSegundoNome(String segundoNome) {
		this.segundoNome = segundoNome;
	}

    public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}

}
