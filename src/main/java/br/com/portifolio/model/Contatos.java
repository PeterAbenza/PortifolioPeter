package br.com.portifolio.model;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity // diz que essa classe é um obj;
public class Contatos {

	@Id // primary key;
	@GeneratedValue(strategy = GenerationType.AUTO) // auto incremento;
	private Integer id;
	
	@Column(name = "email") // qual nome vai ser lá no banco
	private String email;
	
	@Column(name = "assunto")
	private String assunto;
	
	@CreationTimestamp // marca a data e hora de criação automaticamente
    @Column(name = "created_at", updatable = false) // 'updatable = false' impede atualização do campo
    private LocalDateTime createdAt;

	
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAssunto() {
		return assunto;
	}

	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}
}
