package com.postagem.Postagem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.postagem.Postagem.model.UpVote;

@Repository
public interface UpVoteRepository extends JpaRepository<UpVote, Long>{

}
