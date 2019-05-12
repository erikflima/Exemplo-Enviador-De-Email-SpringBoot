package com.erikcompany.meuprojetospringbootcomgithub;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

//Essa eh uma classe que estou utilizando para testes

@RunWith(SpringRunner.class) //Aqui eu uso a anotacao da biblioteca JUnit "@RunWith", e digo para o JUnit usar a classe "SpringRunner" da biblioteca "Spring-test"(que eh uma dependencia la no pom.xml) para rodar o teste. Se eu nao fizer isso, o teste nao vai funcionar, pois o JUnit sozinho nao sabe como injetar o objetos.
@SpringBootTest              //Anotacao que diz ao SpringBoot que essa eh uma classe que contem testes do meu projeto.
public class MeuSegundoProjetoSpringBootComGitHubApplicationTests {

	@Test
	public void contextLoads() {
		
		System.out.println("\n\nErik - Executando um teste\n\n");
		
	}

}
