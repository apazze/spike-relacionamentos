package com.example.demo.embeddable;

import jakarta.persistence.Embeddable;

@Embeddable // reuso do Objeto para criar várias entidades
public class PessoaContato {

    private Long id;
    private String primeiroNome;
    private String ultimoNome;
    private String telefone;
}
