package br.com.portifolio.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.portifolio.model.Contatos;

public interface ContatoDao extends JpaRepository<Contatos, Integer> {

}
