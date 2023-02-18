package com.sistemacontroleestoque.sao.repository;

import com.sistemacontroleestoque.sao.entity.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {
}
