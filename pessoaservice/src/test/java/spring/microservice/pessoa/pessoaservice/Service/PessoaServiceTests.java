package spring.microservice.pessoa.pessoaservice.Service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Calendar;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import spring.microservice.pessoa.pessoaservice.PessoaserviceApplication;
import spring.microservice.pessoa.pessoaservice.Detail.PessoaDetail;
import spring.microservice.pessoa.pessoaservice.Repository.PessoaRepository;
 
@SpringBootTest
public class PessoaServiceTests  {

	@Autowired 
	private PessoaService pessoaService;
	@Autowired
	private PessoaRepository pessoaRepository;
	

 
	@Test
	public void testNovaPessoa() 
	{
		int tamanhoAnterior = pessoaRepository.getListaPessoas().size();
		
		PessoaDetail p = new PessoaDetail();
		p.setCpf("369.187.400-24");
	
		Calendar calendar = Calendar.getInstance();
		calendar.set(1989, 02, 25);
		p.setDataNascimento(calendar.getTime());
		p.setEndereco("Rua V numero 1");
		p.setNome("Joao");
		
		pessoaService.InsertOrUpdate(p);
		
		int tamanhoAtual = pessoaRepository.getListaPessoas().size();
		assertEquals(++tamanhoAnterior, tamanhoAtual);
	}
		
}
