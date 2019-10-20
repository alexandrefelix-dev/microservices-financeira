package spring.microservice.pessoa.pessoaservice.Controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import spring.microservice.pessoa.pessoaservice.Detail.PatrimonioDetail;
import spring.microservice.pessoa.pessoaservice.Model.Patrimonio;
import spring.microservice.pessoa.pessoaservice.Model.Pessoa;
import spring.microservice.pessoa.pessoaservice.Service.PessoaService;

public class PatrimonioController {
	
	private PessoaService pessoaService;

	@Autowired
	PatrimonioController(PessoaService pessoaServico) {
		this.pessoaService = pessoaServico;
	}
	
	@RequestMapping(method = RequestMethod.POST) 
	public PatrimonioDetail create(@RequestBody PatrimonioDetail detail) throws Exception {
		
		Pessoa pessoa = pessoaService.FindPessoaByCpf(detail.getCpf());
	    
		if (pessoa == null) {
			throw new Exception("Pessoa não encontrada.");
		}
		
		Patrimonio patrimonio = new Patrimonio(detail.getDecricao(), detail.getEndereco());
	    
		pessoaService.AddPatrimonio(pessoa, patrimonio);
	    
	    return detail;		
	}
}
