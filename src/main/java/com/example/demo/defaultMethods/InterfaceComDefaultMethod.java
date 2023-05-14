package com.example.demo.defaultMethods;

public interface InterfaceComDefaultMethod {

    default void metodo(String a){
        System.out.println("Primeira implementação " + a);
    }

    default String metodo2(){
        return "bla";
    }
}

