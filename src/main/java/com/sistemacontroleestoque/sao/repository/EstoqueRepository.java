package com.sistemacontroleestoque.sao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstoqueRepository extends JpaRepository<EstoqueRepository, Integer> {
}
