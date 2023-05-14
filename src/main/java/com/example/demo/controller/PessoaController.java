package com.example.demo.controller;

import com.example.demo.relacionamentos.Categoria;
import com.example.demo.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PessoaController {

    @Autowired
    CategoriaService categoriaService;

    @PostMapping("/bla")
    @ResponseStatus(HttpStatus.OK)
    public Page<Categoria> cadastro(Pageable pageable) {
        return categoriaService.Pesquisar(pageable);
    }
}
