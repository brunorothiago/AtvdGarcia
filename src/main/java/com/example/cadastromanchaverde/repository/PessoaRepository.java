package com.example.cadastromanchaverde.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.cadastromanchaverde.model.Pessoa;

public interface PessoaRepository extends CrudRepository<Pessoa, Long> {
}