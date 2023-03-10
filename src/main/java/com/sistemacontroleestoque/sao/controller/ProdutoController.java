package com.sistemacontroleestoque.sao.controller;

import com.sistemacontroleestoque.sao.entity.Produto;
import com.sistemacontroleestoque.sao.exception.InfoException;
import com.sistemacontroleestoque.sao.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/produto")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @GetMapping("")
    @CrossOrigin("http://localhost:3000")
    public List<Produto> buscarTodos() {
        return produtoService.buscarTodos();
    }

    @PostMapping("/cadastrar")
    @CrossOrigin("http://localhost:3000")
    public Produto inserir(@RequestBody Produto produto) throws InfoException {
        return produtoService.inserir(produto);
    }

    @PutMapping("/atualizar/{id}")
    @CrossOrigin("http://localhost:3000")
    public Produto alterar(@PathVariable("id") Long id, @RequestBody Produto produto) throws InfoException {
        return produtoService.alterar(id, produto);
    }

    @DeleteMapping("/deletar/{id}")
    @CrossOrigin("http://localhost:3000")
    public ResponseEntity<Void> excluir(@PathVariable("id") Long id) throws InfoException {
        produtoService.excluir(id);
        return ResponseEntity.ok().build();
    }
}
