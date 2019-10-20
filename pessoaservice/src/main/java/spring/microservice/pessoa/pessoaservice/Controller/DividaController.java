package spring.microservice.pessoa.pessoaservice.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import spring.microservice.pessoa.pessoaservice.Detail.DividaDetail;
import spring.microservice.pessoa.pessoaservice.Detail.PessoaDetail;
import spring.microservice.pessoa.pessoaservice.Model.Divida;
import spring.microservice.pessoa.pessoaservice.Model.Pessoa;
import spring.microservice.pessoa.pessoaservice.Repository.PessoaRepository;
import spring.microservice.pessoa.pessoaservice.Service.PessoaService;

@RestController
@RequestMapping("/divida")
public class DividaController {

	private PessoaRepository repositorioPessoas;
	private PessoaService pessoaService;

	@Autowired
	DividaController(PessoaRepository pessoaRepositorio,
			PessoaService pessoaServico) {
		this.pessoaService = pessoaServico;
	}
	
	@RequestMapping(method = RequestMethod.POST) 
	public DividaDetail create(@RequestBody DividaDetail detail) {
		Pessoa pessoa = pessoaService.FindPessoaByCpf(detail.getCpf());
	    
		if (pessoa == null) {
			PessoaDetail pessoaDetail = new PessoaDetail(
					detail.getNome(),
					detail.getEndereco(),
					detail.getCpf(),
					detail.getDataNascimento());

			int idPessoa = pessoaService.InsertOrUpdate(pessoaDetail);
			pessoa = repositorioPessoas.FindById(idPessoa);
		}
		
		ArrayList<Divida> dividas = pessoa.getDividas();
	    Divida divida = new Divida(detail.getValorDivida(), 
	    		detail.getInstituicao(), 
	    		detail.getUtimoPagamento());
	    
	    pessoaService.AddDivida(pessoa, divida);
	    
	    return detail;		
	}
	
	@RequestMapping(method = RequestMethod.GET) 
	public String index() {
		return "";
	}
	
	
}
