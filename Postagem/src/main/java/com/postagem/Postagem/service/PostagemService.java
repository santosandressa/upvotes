package com.postagem.Postagem.service;

import java.util.List;
import java.util.Optional;

import com.postagem.Postagem.model.Postagem;

public interface PostagemService {

	List<Postagem> listar();

	Optional<Postagem> listarPorId(Long id);

	Postagem salvar(Postagem postagem);

	Postagem deletar(Long id);

	Postagem postar(Postagem postagem);
}
