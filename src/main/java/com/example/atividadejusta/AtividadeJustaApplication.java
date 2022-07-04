package com.example.atividadejusta;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class AtividadeJustaApplication {

    public static void main(String[] args) {
        SpringApplication.run(AtividadeJustaApplication.class, args);
        //Exercício 01
        //Instanciando a classe onde os métodos se encontram.
        Exc01 exc01 = new Exc01();

        //Declarando o vetor de entrada dos dados
        String[] entradaExc01 = new String[] {"1, 3, 4, 7, 13", "1, 2, 4, 13, 15"};

        System.out.println("Resultado exercício 01:");
        //Chamando o método para realização da operação.
        exc01.intersecao(entradaExc01);

        System.out.println("------------------------------------------");

        //Exercício 02
        //Instanciando a classe onde os métodos se encontram.
        Exc02 exc02 = new Exc02();

        //Declarando o vetor de entrada dos dados
        String entradaExc02 = "Justino é o mascote da Justa";

        System.out.println("Resultado exercício 02:");
        //Chamando o método para realização da operação.
        exc02.verificaMaior(entradaExc02);

    }




}
