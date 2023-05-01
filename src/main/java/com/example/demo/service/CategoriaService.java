package com.example.demo.service;

import com.example.demo.relacionamentos.Categoria;
import com.example.demo.relacionamentos.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    public void add() {
        categoriaRepository.save(new Categoria());
    }
}
