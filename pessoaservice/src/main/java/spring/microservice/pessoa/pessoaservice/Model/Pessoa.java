package spring.microservice.pessoa.pessoaservice.Model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pessoa {
	private int id;
	private String cpf;
	private String nome;
	private String endereco;
	
	private ArrayList<Divida> dividas;
	private Date dataNascimento;
	private ArrayList<Patrimonio> bens;
	private ArrayList<FonteRenda> fontesRenda;
	
	public Pessoa()
	{
		
	}
	
	public Pessoa(String cpf, String nome, String endereco, ArrayList<Divida> dividas) {
		super();
		this.cpf = cpf;
		this.setNome(nome);
		this.endereco = endereco;
		this.dividas = dividas;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public ArrayList<Divida> getDividas() {
		if(dividas == null)
			dividas = new ArrayList<Divida>();
		return dividas;
	}
	public void setDividas(ArrayList<Divida> dividas) {
		this.dividas = dividas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public ArrayList<Patrimonio> getBens() {
		return bens;
	}

	public void setBens(ArrayList<Patrimonio> bens) {
		this.bens = bens;
	}

	public ArrayList<FonteRenda> getFontesRenda() {
		return fontesRenda;
	}

	public void setFontesRenda(ArrayList<FonteRenda> fontesRenda) {
		this.fontesRenda = fontesRenda;
	}
	
}
