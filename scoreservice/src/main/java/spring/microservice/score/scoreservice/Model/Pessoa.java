package spring.microservice.score.scoreservice.Model;

import java.util.ArrayList;
import java.util.Date;
 
public class Pessoa {
	private int id;
	private String cpf;
	private String nome;
	private String endereco;
 
	private Date dataNascimento;
	private ArrayList<Patrimonio> bens;
	private ArrayList<FonteRenda> fontesRenda;
	
	public Pessoa(int id, String cpf, String nome, String endereco, Date dataNascimento, ArrayList<Patrimonio> bens,
			ArrayList<FonteRenda> fontesRenda) 
	{
		this.id = id;
		this.cpf = cpf;
		this.nome = nome;
		this.endereco = endereco;
		this.dataNascimento = dataNascimento;
		this.bens = bens;
		this.fontesRenda = fontesRenda;
	}

	public Pessoa(String cpf, String nome, String endereco, Date dataNascimento) 
	{
		this.cpf = cpf;
		this.nome = nome;
		this.endereco = endereco;
		this.dataNascimento = dataNascimento;
	}

	public Pessoa() {
		 
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
