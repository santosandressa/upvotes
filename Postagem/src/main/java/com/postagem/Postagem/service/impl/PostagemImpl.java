package com.postagem.Postagem.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.postagem.Postagem.Repository.PostagemRepository;
import com.postagem.Postagem.model.Postagem;
import com.postagem.Postagem.service.PostagemService;

@Service
public class PostagemImpl implements PostagemService {
	
	@Autowired 
	private PostagemRepository postagemRepository;
	
	@Override
	public List<Postagem> listar() {
		return postagemRepository.findAll();
	}

	@Override
	public Optional<Postagem> listarPorId(Long id) {
		return postagemRepository.findById(id);
	}

	@Override
	public Postagem salvar(Postagem postagem) {
	 return postagemRepository.save(postagem);
	}

	@Override
	public Postagem deletar(Long id) {
		Optional<Postagem> postExistente = postagemRepository.findById(id);
		if(postExistente.isPresent()) {
			postagemRepository.deleteById(id);
		}
		return null;
	}

	@Override
	public Postagem postar(Postagem postagem) {
		return postagemRepository.save(postagem);
	}
}
