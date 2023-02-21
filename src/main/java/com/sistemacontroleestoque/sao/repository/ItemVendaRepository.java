package com.sistemacontroleestoque.sao.repository;

import com.sistemacontroleestoque.sao.entity.ItemVenda;
import lombok.extern.java.Log;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemVendaRepository extends JpaRepository<ItemVenda, Long> {
    List<ItemVenda> findItemVendaByVendaId(Log id);
}
