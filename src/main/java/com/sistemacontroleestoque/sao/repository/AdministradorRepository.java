package com.sistemacontroleestoque.sao.repository;

import com.sistemacontroleestoque.sao.entity.Administrador;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AdministradorRepository extends JpaRepository<Administrador, Integer> {

    List<Administrador> findByLogin(String login);
}
