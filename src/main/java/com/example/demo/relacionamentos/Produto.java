package com.example.demo.relacionamentos;

import com.example.demo.BaseEntity;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Produto extends BaseEntity {

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Categoria categoria;


//    @ManyToMany
//    @JoinTable(
//            name = "pedidos_produtos",
//            joinColumns = @JoinColumn(name = "pedido_id"),
//            inverseJoinColumns = @JoinColumn(name = "produto_id"))
//    private List<Pedido> pedidos;
}
