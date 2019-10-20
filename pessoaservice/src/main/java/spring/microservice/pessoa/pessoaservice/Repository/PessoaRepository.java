package spring.microservice.pessoa.pessoaservice.Repository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import org.springframework.stereotype.Component;

import spring.microservice.pessoa.pessoaservice.Model.Divida;
import spring.microservice.pessoa.pessoaservice.Model.Pessoa;

@Component
public class PessoaRepository {
	private ArrayList<Pessoa> listaPessoas;

	public PessoaRepository() {
		listaPessoas = new ArrayList<Pessoa>();
		popularArray();
		
	}
	private void popularArray() {
		Pessoa pessoa = new Pessoa();
		pessoa.setCpf("807.277.080-23");
		Calendar calendar = Calendar.getInstance();
		calendar.set(1992, 05, 11);
		pessoa.setDataNascimento(calendar.getTime());
		pessoa.setEndereco("Rua a, numero 1");
		pessoa.setNome("Andre");
		calendar.set(2019, 01, 11);
		AddDivida(pessoa, new Divida(new BigDecimal(100.87), "Banco Z", calendar.getTime()));
		
		this.Add(pessoa);
	
		Pessoa pessoa2 = new Pessoa();
		pessoa2.setCpf("067.972.690-08");
		calendar = Calendar.getInstance();
		calendar.set(1990, 10, 30);
		pessoa2.setDataNascimento(calendar.getTime());
		pessoa2.setEndereco("Rua a, numero 1");
		pessoa2.setNome("Bianca");
		calendar.set(2016, 10, 30);
		AddDivida(pessoa2, new Divida(new BigDecimal(2000.87), "Banco A", calendar.getTime()));
		
		this.Add(pessoa2);
		
	}

	public ArrayList<Pessoa> getListaPessoas() {
		return listaPessoas;
	}

	public Pessoa FindById(int id) {
		return listaPessoas.get(id);
	}

	public int Add(Pessoa pessoa) {
		int i = -1;
		i = FindIndexPessoaByCpf(pessoa.getCpf());
		if (i >= 0)
			listaPessoas.set(i, pessoa);
	
		else {
			pessoa.setId(getNextId());
			listaPessoas.add(pessoa);
		}

		return pessoa.getId();
	}

	private int getNextId() {
		int maior = 0;
		for (Pessoa p : listaPessoas) {
			if (p.getId() > maior) {
				maior = p.getId();
			}
		}
		return ++maior;
		
	}

	private int getNextIdDivida(Pessoa pessoa) {
		int maior = 0;
		for (Divida d : pessoa.getDividas()) {
			if (d.getId() > maior) {
				maior = d.getId();
			}
		}
		return ++maior;
	}

	public void Remove(int i) throws Exception {
		if ((i >= 0) && (i < listaPessoas.size())) {
			listaPessoas.remove(i);
		} else {
			throw new Exception("Pessoa não encontrada.");
		}
	}

	public int FindIndexPessoaByCpf(String cpf) {

		for (int i = 0; i < this.listaPessoas.size(); i++) {
			if (listaPessoas.get(i).getCpf().equals(cpf))
			 return i;
		}
		return -1;
	}
	public Pessoa FindPessoaByCpf(String cpf) {

		for (int i = 0; i < this.listaPessoas.size(); i++) {
			if (listaPessoas.get(i).getCpf().equals(cpf))
			return listaPessoas.get(i);
		}
		return null;
	}

	public void AddDivida(Pessoa pessoa, Divida divida) {
		ArrayList<Divida> dividas = pessoa.getDividas();
		
		if (divida.getId() == 0) {
			divida.setId(getNextIdDivida(pessoa));
			dividas.add(divida);
		}
		else {
			dividas.set(divida.getId(), divida);
		}
		pessoa.setDividas(dividas);

	}

}
