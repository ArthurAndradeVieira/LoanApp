package com.arthurandrade.atividade1.repository;

import com.arthurandrade.atividade1.domain.Pessoa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

}
