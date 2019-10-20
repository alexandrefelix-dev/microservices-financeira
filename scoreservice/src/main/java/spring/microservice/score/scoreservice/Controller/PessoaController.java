package spring.microservice.score.scoreservice.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import spring.microservice.score.scoreservice.Repository.PessoaRepository;
 
@RestController
@RequestMapping("/pessoa")
public class PessoaController {
	
	private PessoaRepository pessoaRepositorio;
	
	@Autowired
	PessoaController(PessoaRepository repository) {
		this.pessoaRepositorio = repository;
	}
	
	public void index() {
		
	}
	
	
	/* Construir GET por CPF para retornar informação do Mongo
	 * 
	 */
	
	
}
