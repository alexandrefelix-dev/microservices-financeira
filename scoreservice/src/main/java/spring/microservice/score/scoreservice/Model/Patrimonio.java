package spring.microservice.score.scoreservice.Model;

public class Patrimonio {
	private int id;
	private String decricao;
	private String endereco;
			
	public Patrimonio(String decricao, String endereco) {
		super();
		this.decricao = decricao;
		this.endereco = endereco;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
