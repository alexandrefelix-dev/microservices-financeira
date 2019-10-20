package spring.microservice.pessoa.pessoaservice.Model;

import java.util.Date;

import spring.microservice.pessoa.pessoaservice.enums.Tipo;

public class Movimentacao {
	private int id;
	private Tipo tipo;
	private Date data;
	private String descricao;
	
	public Movimentacao(Tipo tipo, Date data, String descricao) {
		super();
		this.setTipo(tipo);
		this.data = data;
		this.descricao = descricao;
	}

	public Movimentacao() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}
	
	

	
}
