package com.example.demo.relacionamentos;

import com.example.demo.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.util.HashSet;
import java.util.Set;

@Entity
public class Categoria extends BaseEntity {

    @OneToMany(mappedBy = "categoria")
    private Set<Produto> produtos = new HashSet<>();
}
