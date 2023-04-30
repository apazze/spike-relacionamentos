package com.example.demo;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Produto extends BaseEntity{

    @ManyToOne(fetch = FetchType.LAZY)
    private Categoria categoria;

    @ManyToMany
    @JoinTable(
            name = "pedidos_produtos",
            joinColumns = @JoinColumn(name = "pedido_id"),
            inverseJoinColumns = @JoinColumn(name = "produto_id"))
    private List<Pedido> pedidos;
}
