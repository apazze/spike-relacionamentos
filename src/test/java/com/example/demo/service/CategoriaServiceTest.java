package com.example.demo.service;

import com.example.demo.defaultMethods.ClasseImpl;
import com.example.demo.defaultMethods.InterfaceComDefaultMethod;
import com.example.demo.reflection.Cake;
import com.example.demo.reflection.Food;
import com.example.demo.reflection.FoodFactory;
import com.example.demo.relacionamentos.Categoria;
import com.example.demo.relacionamentos.CategoriaRepository;
import com.example.demo.relacionamentos.Produto;
import com.example.demo.relacionamentos.ProdutoRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

@DataJpaTest
class CategoriaServiceTest {

    @Autowired
    CategoriaRepository categoriaRepository;

    @Autowired
    ProdutoRepository produtoRepository;
    

//    @Test
//    public void t() {
//        Categoria categoria = new Categoria();
//        categoria.setId(1L);
//        categoria.setNome("Cat1");
//
//        Categoria salvo1 = categoriaRepository.save(categoria);
//
//        Produto produto = new Produto();
//        produto.setId(1L);
//        produto.setNome("nome");
//        produto.setCategoria(salvo1);
//
//        produtoRepository.save(produto);
//
//
//        List<Produto> all = produtoRepository.findAll();
//
//        System.out.println();
//
//    }

    @Test
    void t1(){
        InterfaceComDefaultMethod i = new ClasseImpl();

        i.metodo("Teste");
        String s = i.metodo2();

        System.out.println();
    }

    @Test
    void t2(){
        FoodFactory foodFactory = new FoodFactory();
        Food cake = foodFactory.getFood("Cake");

        Assertions.assertEquals(Cake.class, cake.getClass());
        Assertions.assertEquals("Someone ordered a Dessert!", cake.getType());

    }
}