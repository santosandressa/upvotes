package com.postagem.Postagem.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.postagem.Postagem.model.UpVote;
import com.postagem.Postagem.service.UpVoteService;

@RestController
@RequestMapping("/upvotes")
@CrossOrigin("*")
public class UpVoteController {

	@Autowired
	private UpVoteService upvoteService;

	@GetMapping
	private List<UpVote> findAll() {
		return upvoteService.findAll();
	}

	@GetMapping("/{id}")
	private UpVote findAll(@PathVariable Long id) {
		return upvoteService.findById(id);
	}

	@PutMapping
	private Boolean computarVoto(Long id) {
		return upvoteService.contarVoto(id);
	}

	@PostMapping
	private UpVote save(@RequestBody UpVote upvote) {
		return upvoteService.save(upvote);
	}
}