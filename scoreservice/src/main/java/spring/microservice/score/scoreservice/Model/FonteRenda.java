package spring.microservice.score.scoreservice.Model;

import java.math.BigDecimal;

public class FonteRenda {
	private int id;
	private String tipoRenda;
	private BigDecimal valor;
	private String descricao;
	
	public FonteRenda(String tipoRenda, BigDecimal valor, String descricao) {
		super();
		this.tipoRenda = tipoRenda;
		this.setValor(valor);
		this.descricao = descricao;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTipoRenda() {
		return tipoRenda;
	}

	public void setTipoRenda(String tipoRenda) {
		this.tipoRenda = tipoRenda;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
		
}
