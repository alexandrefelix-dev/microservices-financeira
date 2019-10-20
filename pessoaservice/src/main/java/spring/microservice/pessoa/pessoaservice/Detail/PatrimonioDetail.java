package spring.microservice.pessoa.pessoaservice.Detail;

public class PatrimonioDetail {
	private String decricao;
	private String endereco;
	private String cpf;
	
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public PatrimonioDetail(String decricao, String endereco) {
		this.decricao = decricao;
		this.endereco = endereco;
	}

	public PatrimonioDetail() {
		 
	}

	public String getDecricao() {
		return decricao;
	}

	public void setDecricao(String decricao) {
		this.decricao = decricao;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	
	
}
