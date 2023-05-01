package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PessoaController {
    @PostMapping("/bla")
    @ResponseStatus(HttpStatus.OK)
    public void cadastro(){

    }
}
