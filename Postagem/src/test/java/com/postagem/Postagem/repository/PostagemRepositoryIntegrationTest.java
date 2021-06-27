package com.postagem.Postagem.repository;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.postagem.Postagem.Repository.PostagemRepository;
import com.postagem.Postagem.model.Postagem;

@RunWith(SpringRunner.class)
@DataJpaTest
public class PostagemRepositoryIntegrationTest {
	
	private Postagem postagem;
	
	@Autowired
	private PostagemRepository postagemRepository;
	
	@Before
	public void start() {
		postagem = new Postagem("Teste com Junit", "Nulla a placerat nulla. Curabitur finibus velit quis ultrices ornare. Nunc non bibendum mauris");
	}
	
	@Test(expected = RuntimeException.class)
	public void salvarTituloNulo() throws Exception {
		postagem.setTitulo(null);
		postagemRepository.save(postagem);
	}
	
	@Test(expected = RuntimeException.class)
	public void salvarComTextoNulo() throws Exception {
		postagem.setTexto(null);
		postagemRepository.save(postagem);
	}
}
