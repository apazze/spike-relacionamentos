package com.example.demo;

import jakarta.persistence.*;

@Entity
public class Produto extends BaseEntity{

    @ManyToOne(fetch = FetchType.LAZY)
    private Categoria categoria;
}
