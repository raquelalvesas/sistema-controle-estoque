package com.sistemacontroleestoque.sao.repository;

import com.sistemacontroleestoque.sao.entity.Cargo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CargpRepository extends JpaRepository<Cargo, Integer> {
}
