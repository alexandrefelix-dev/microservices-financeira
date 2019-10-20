package spring.microservice.pessoa.pessoaservice.Detail;

import java.math.BigDecimal;

public class FonteRendaDetail {
	private String tipoRenda;
	private BigDecimal valor;
	private String descricao;
	private String cpf;
	
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public FonteRendaDetail(String tipoRenda, BigDecimal valor, String descricao) {
		super();
		this.tipoRenda = tipoRenda;
		this.valor = valor;
		this.descricao = descricao;
	}

	public FonteRendaDetail() {
		 
	}

	public String getTipoRenda() {
		return tipoRenda;
	}

	public void setTipoRenda(String tipoRenda) {
		this.tipoRenda = tipoRenda;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
}
