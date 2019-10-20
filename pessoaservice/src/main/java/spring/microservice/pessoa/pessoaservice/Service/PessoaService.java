package spring.microservice.pessoa.pessoaservice.Service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import spring.microservice.pessoa.pessoaservice.Detail.PessoaDetail;
import spring.microservice.pessoa.pessoaservice.Model.Divida;
import spring.microservice.pessoa.pessoaservice.Model.FonteRenda;
import spring.microservice.pessoa.pessoaservice.Model.Patrimonio;
import spring.microservice.pessoa.pessoaservice.Model.Pessoa;
import spring.microservice.pessoa.pessoaservice.Repository.PessoaRepository;

@Component
@Service
public class PessoaService {
	
	@Autowired
	private PessoaRepository pessoaRepositorio;

	@Autowired
	public PessoaService(PessoaRepository pessoaRepository) {
		this.pessoaRepositorio = pessoaRepository;
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
	private int getNextIdPatrimonio(Pessoa pessoa) {
		int maior = 0;
		for (Patrimonio d : pessoa.getBens()) {
			if (d.getId() > maior) {
				maior = d.getId();
			}
		}
		return ++maior;
	}
	
	private int Insert(PessoaDetail pessoaDetail) 
	{
		Pessoa pessoa = new Pessoa(pessoaDetail.getCpf(),
				pessoaDetail.getNome(),
				pessoaDetail.getEndereco(),
				null);
		int id = pessoaRepositorio.Add(pessoa);
		return id;
	}
	
	private int Update(PessoaDetail pessoaDetail, int id) 
	{
		Pessoa pessoa = pessoaRepositorio.FindById(id);
		
		pessoa.setCpf(pessoaDetail.getCpf());
		pessoa.setDataNascimento(pessoaDetail.getDataNascimento());
		pessoa.setEndereco(pessoaDetail.getEndereco());
		pessoa.setNome(pessoaDetail.getNome());
		
		pessoaRepositorio.Add(pessoa);
		
		return pessoa.getId();
	}
	
	public int InsertOrUpdate(PessoaDetail pessoaDetail) 
	{
		int idPessoa = pessoaRepositorio.FindIndexPessoaByCpf(pessoaDetail.getCpf());
		if (idPessoa  >= 0) 
			this.Update(pessoaDetail, idPessoa);
		else 
			idPessoa = this.Insert(pessoaDetail);
		
		return idPessoa;
	}
	
	public Pessoa FindPessoaByCpf(String cpf) {

		for (int i = 0; i < this.pessoaRepositorio.getListaPessoas().size(); i++) {
			if (this.pessoaRepositorio.getListaPessoas().get(i).getCpf().equals(cpf))
			return this.pessoaRepositorio.getListaPessoas().get(i);
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
	
	public void AddPatrimonio(Pessoa pessoa, Patrimonio patrimonio) {
		ArrayList<Patrimonio> patrimonios = pessoa.getBens();
		
		if (patrimonio.getId() == 0) {
			patrimonio.setId(getNextIdPatrimonio(pessoa));
			patrimonios.add(patrimonio);
		}
		else {
			patrimonios.set(patrimonio.getId(), patrimonio);
		}
		//REALIZA INTEGRAÇÂO COM SERVICO CONECTADO AO MONGO
		//implementar
		
		pessoa.setBens(patrimonios);
	}
	
	public void AddFonteRenda(Pessoa pessoa, FonteRenda fonteRenda) {
		ArrayList<FonteRenda> rendas = pessoa.getFontesRenda();
		
		if (fonteRenda.getId() == 0) {
			fonteRenda.setId(getNextIdPatrimonio(pessoa));
			rendas.add(fonteRenda);
		}
		else {
			rendas.set(fonteRenda.getId(), fonteRenda);
		}
		//REALIZA INTEGRAÇÂO COM SERVICO CONECTADO AO MONGO
		//implementar
		
		pessoa.setFontesRenda(rendas);
	}
	


}
