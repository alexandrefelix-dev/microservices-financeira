package spring.microservice.pessoa.pessoaservice.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import spring.microservice.pessoa.pessoaservice.Detail.PessoaDetail;
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

}
