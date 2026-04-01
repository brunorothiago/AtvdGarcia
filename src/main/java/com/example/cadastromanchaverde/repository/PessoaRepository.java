package com.example.cadastromanchaverde.repository;

import com.example.cadastromanchaverde.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
}
