package com.sistemacontroleestoque.sao.repository;

import com.sistemacontroleestoque.sao.entity.Caixa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CaixaRepository extends JpaRepository<Caixa, Integer> {
}
