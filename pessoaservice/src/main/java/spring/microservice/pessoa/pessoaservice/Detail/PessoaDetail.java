package spring.microservice.pessoa.pessoaservice.Detail;

import java.util.Date;

public class PessoaDetail {
	private String nome;
	private String endereco;
	private String cpf;
	private Date dataNascimento;
	
	public PessoaDetail(String nome, String endereco, String cpf, Date dataNascimento) {
		this.nome = nome;
		this.endereco = endereco;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
	}

	public PessoaDetail() {
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	
}
