package spring.microservice.pessoa.pessoaservice.Model;

import java.util.Date;

public class Consulta {
	private int id;
	private String origemConsulta;
	private Date dataConsulta;
	
	public Consulta() {
	}
	
	public Consulta(String origemConsulta, Date dataConsulta) {
		super();
		this.setOrigemConsulta(origemConsulta);
		this.dataConsulta = dataConsulta;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getDataConsulta() {
		return dataConsulta;
	}
	public void setDataConsulta(Date dataConsulta) {
		this.dataConsulta = dataConsulta;
	}
	public String getOrigemConsulta() {
		return origemConsulta;
	}
	public void setOrigemConsulta(String origemConsulta) {
		this.origemConsulta = origemConsulta;
	}
	
	
}
