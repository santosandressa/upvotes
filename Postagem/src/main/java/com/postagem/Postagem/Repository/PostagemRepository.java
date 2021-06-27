package com.postagem.Postagem.Repository;

import org.springframework.stereotype.Repository;
import com.postagem.Postagem.model.Postagem;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface PostagemRepository extends JpaRepository<Postagem, Long> {

}
