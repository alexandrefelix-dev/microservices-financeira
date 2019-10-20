package spring.microservice.pessoa.pessoaservice.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.gson.GsonAutoConfiguration;
import org.springframework.boot.json.GsonJsonParser;
import org.springframework.http.HttpStatus;
import org.springframework.http.converter.json.GsonBuilderUtils;
import org.springframework.http.converter.json.GsonFactoryBean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import spring.microservice.pessoa.pessoaservice.Model.Pessoa;
import spring.microservice.pessoa.pessoaservice.Repository.PessoaRepository;

@RestController
public class PessoaController {
	
	private PessoaRepository pessoaRepositorio;
	
	@Autowired
	PessoaController(PessoaRepository repository) {
		this.pessoaRepositorio = repository;
	}
	
	@RequestMapping("/pessoa")
	public ArrayList<Pessoa> index() {
		System.out.println(pessoaRepositorio.getListaPessoas().size());
		return  pessoaRepositorio.getListaPessoas();
	}
	
	@RequestMapping(method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	public ArrayList<Pessoa> finalAll() {
		return  pessoaRepositorio.getListaPessoas();
	}
	

}
