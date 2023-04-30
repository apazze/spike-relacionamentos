package com.example.demo;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Pedido extends BaseEntity{

    @ManyToMany(mappedBy = "pedidos")
    private Set<Produto> produtos;
}
