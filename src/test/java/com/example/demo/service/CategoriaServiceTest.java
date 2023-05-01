package com.example.demo.service;

import com.example.demo.relacionamentos.Categoria;
import com.example.demo.relacionamentos.CategoriaRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.Import;

@DataJpaTest
@Import(CategoriaService.class)
class CategoriaServiceTest {

    @Autowired
    CategoriaService categoriaService;
    @Autowired
    CategoriaRepository categoriaRepository;

    @Test
    public void t() {
        categoriaRepository.save(new Categoria());

        categoriaService.add();

        System.out.println();
    }
}