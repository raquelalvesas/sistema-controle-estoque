package com.sistemacontroleestoque.sao.repository;

import com.sistemacontroleestoque.sao.entity.Administrador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdministradorRepository extends JpaRepository<Administrador, Integer> {

    List<Administrador> findByLogin(String login);
}
