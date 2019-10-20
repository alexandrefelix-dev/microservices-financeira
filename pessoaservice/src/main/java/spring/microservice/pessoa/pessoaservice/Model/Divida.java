package spring.microservice.pessoa.pessoaservice.Model;

import java.math.BigDecimal;
import java.util.Date;

public class Divida {
	private int id;
	private BigDecimal valorDivida;
	private String instituicao;
	private Date utimoPagamento;

	
	public Divida() {
		
	}

	public Divida(BigDecimal valorDivida, String instituicao, Date utimoPagamento) {
		super();
		this.valorDivida = valorDivida;
		this.instituicao = instituicao;
		this.utimoPagamento = utimoPagamento;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public BigDecimal getValorDivida() {
		return valorDivida;
	}

	public void setValorDivida(BigDecimal valorDivida) {
		this.valorDivida = valorDivida;
	}

	public String getInstituicao() {
		return instituicao;
	}

	public void setInstituicao(String instituicao) {
		this.instituicao = instituicao;
	}

	public Date getUtimoPagamento() {
		return utimoPagamento;
	}

	public void setUtimoPagamento(Date utimoPagamento) {
		this.utimoPagamento = utimoPagamento;
	}
}
