package com.sistemacontroleestoque.sao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstoqueProdutoRepository extends JpaRepository<EstoqueProdutoRepository, Integer> {
}
