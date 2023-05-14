package com.example.demo.service;

import com.example.demo.relacionamentos.Categoria;
import com.example.demo.relacionamentos.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    public Page<Categoria> Pesquisar(Pageable pageable) {
        for (int i = 0; i < 100; i++) {
            Categoria categoria = new Categoria();
            categoria.setNome("Categoria_" + i+1);
            categoriaRepository.save(categoria);
        }

        Page<Categoria> all = categoriaRepository.findAll(pageable);
        return all;
    }
}
