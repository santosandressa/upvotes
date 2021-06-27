package com.postagem.Postagem.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.postagem.Postagem.Repository.UpVoteRepository;
import com.postagem.Postagem.model.UpVote;
import com.postagem.Postagem.service.UpVoteService;

@Service
public class UpVoteImpl implements UpVoteService {

	@Autowired
	private UpVoteRepository upvoteRepository;

	public UpVoteImpl(UpVoteRepository upvoteRepository) {
		this.upvoteRepository = upvoteRepository;
	}

	@Override
	public Boolean contarVoto(Long id) {
		UpVote upvote = findById(id);
		if (upvote != null) {
			calcularVotos(upvote);
			upvoteRepository.save(upvote);
			return true;
		}
		return false;
	}

	private void calcularVotos(UpVote postagem) {
		postagem.setUpvote(postagem.getUpvote() + 1);
	}

	@Override
	public UpVote findById(Long id) {
		Optional<UpVote> post = upvoteRepository.findById(id);
		return (post.isPresent() ? post.get() : null);
	}

	@Override
	public List<UpVote> findAll() {
		return upvoteRepository.findAll();
	}

	@Override
	public UpVote save(UpVote upvote) {
		return upvoteRepository.save(upvote);
	}
}