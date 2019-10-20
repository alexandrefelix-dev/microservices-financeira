package spring.microservice.pessoa.pessoaservice.enums;

public enum Tipo {
  CARTAOCREDITO(1),
  OUTROS(2);
	
	public int tipoCompra;
	Tipo(int valor){
		tipoCompra = valor;
	}
}
