package com.sistemacontroleestoque.sao.repository;

import com.sistemacontroleestoque.sao.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
