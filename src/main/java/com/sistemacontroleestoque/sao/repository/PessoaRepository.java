package com.sistemacontroleestoque.sao.repository;

import com.sistemacontroleestoque.sao.entity.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
}
