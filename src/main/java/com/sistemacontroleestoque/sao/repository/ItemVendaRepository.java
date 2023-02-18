package com.sistemacontroleestoque.sao.repository;

import com.sistemacontroleestoque.sao.entity.ItemVenda;
import lombok.extern.java.Log;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ItemVendaRepository extends JpaRepository<ItemVenda, Long> {
    List<ItemVenda> findItemVendaByVendaId(Log id);
}
