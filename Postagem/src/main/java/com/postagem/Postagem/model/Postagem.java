package com.postagem.Postagem.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Postagem {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long postId;

	@NotNull
	@Size(min = 5, max = 100)
	private String titulo;

	@NotNull
	private String texto;

	@OneToMany(mappedBy = "upvote", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("upvote")
	private List<UpVote> upvote;

	public Postagem() {
	}

	public Postagem(@NotNull @Size(min = 5, max = 100) String titulo, @NotNull String texto) {
		this.titulo = titulo;
		this.texto = texto;
	}

	public Long getPostId() {
		return postId;
	}

	public void setPostId(Long postId) {
		this.postId = postId;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public List<UpVote> getUpvote() {
		return upvote;
	}

	public void setUpvote(List<UpVote> upvote) {
		this.upvote = upvote;
	}

}