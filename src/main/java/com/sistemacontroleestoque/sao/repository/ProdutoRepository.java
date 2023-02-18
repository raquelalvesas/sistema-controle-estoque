package com.sistemacontroleestoque.sao.repository;

import com.sistemacontroleestoque.sao.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
