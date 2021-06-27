package com.postagem.Postagem.service;

import java.util.List;

import com.postagem.Postagem.model.UpVote;

public interface UpVoteService {
	
	Boolean contarVoto(Long postId);
	UpVote findById(Long id);
	List<UpVote> findAll();
	UpVote save(UpVote upvote);
}