package spring.microservice.pessoa.pessoaservice.Detail;

import java.math.BigDecimal;
import java.util.Date;

public class DividaDetail {
	
	private BigDecimal valorDivida;
	private String instituicao;
	private Date utimoPagamento;
	private String nome;
	private String endereco;
	private String cpf;
	private Date dataNascimento;
	
	
	public DividaDetail(BigDecimal valorDivida, String instituicao, Date utimoPagamento) {
		super();
		this.setValorDivida(valorDivida);
		this.instituicao = instituicao;
		this.utimoPagamento = utimoPagamento;
	}
	public DividaDetail() {
		
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
	public BigDecimal getValorDivida() {
		return valorDivida;
	}
	public void setValorDivida(BigDecimal valorDivida) {
		this.valorDivida = valorDivida;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
