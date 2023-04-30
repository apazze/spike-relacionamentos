package com.example.demo.embeddable;

import com.example.demo.BaseEntity;
import jakarta.persistence.*;

@Entity
public class Empresa extends BaseEntity {

    private String address;
    @Embedded
    @AttributeOverrides({
            @AttributeOverride( name = "id", column = @Column(name = "contato_id"))
    })
    private PessoaContato pessoaContato;
}
