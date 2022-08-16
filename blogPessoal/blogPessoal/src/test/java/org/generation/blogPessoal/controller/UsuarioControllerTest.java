package org.generation.blogPessoal.controller;

import org.generation.blogPessoal.Model.UsuarioModel;
import org.generation.blogPessoal.Service.UsuarioService;
import org.generation.blogPessoal.repository.UsuarioRepository;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@TestInstance (TestInstance.Lifecycle.PER_CLASS)
public class UsuarioControllerTest {
	
	@Autowired
	private TestRestTemplate testRestTemplate;
	
	@Autowired
	private UsuarioService usuarioService;
	
	@Autowired 
	private UsuarioRepository usuarioRepository;
	
	@BeforeAll 
	void start () {
		usuarioRepository.deleteAll();
		usuarioService.cadastrarUsuarioModel(new UsuarioModel(0L, "Root", "root@root.com","rootroot"," "));
		
		
	}
}
