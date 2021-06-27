package com.postagem.Postagem.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.postagem.Postagem.Repository.PostagemRepository;
import com.postagem.Postagem.Repository.UpVoteRepository;
import com.postagem.Postagem.model.Postagem;
import com.postagem.Postagem.model.UpVote;

@Component
public class Initialize {

	@Autowired
	private PostagemRepository postagemRepository;

	@Autowired
	private UpVoteRepository upvoteRepository;

	public void instantiateDatabase() {
		Postagem postagem = new Postagem();
		UpVote upvote = new UpVote();

		postagem.setTitulo("Olá mundo");
		postagem.setTexto("Minha aplicação com Spring Boot e JUnit");
		postagemRepository.save(postagem);

		upvote.setUpvote(1L);
		upvote.setPostagem(postagem);
		upvoteRepository.save(upvote);
	}
}