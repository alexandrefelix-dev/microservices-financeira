package spring.microservice.score.scoreservice.Repository;

import java.util.ArrayList;

import spring.microservice.score.scoreservice.Model.Pessoa;

 
public class PessoaRepository {
	private ArrayList<Pessoa> listaPessoas;
	
	public PessoaRepository() {
		listaPessoas = new ArrayList<Pessoa>();
	
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

	public int FindIndexPessoaByCpf(String cpf) {

		for (int i = 0; i < this.listaPessoas.size(); i++) {
			if (listaPessoas.get(i).getCpf().equals(cpf))
			 return i;
		}
		return -1;
	}

}
