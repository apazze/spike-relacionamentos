package com.example.demo.controller;

import com.example.demo.relacionamentos.Categoria;
import com.example.demo.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PessoaController {

    @Autowired
    CategoriaService categoriaService;

    @GetMapping("/bla")
    public Page<Categoria> cadastro(Pageable pageable) {
        return categoriaService.Pesquisar(pageable);
    }
}
