package com.example.atividadejusta;

import java.util.*;

public class Exc01 {

    //O método deixei como privado, tendo em vista que funciona de suporte para um método interno e tem como
    // objetivo apenas "quebrar" a string transformando em um vetor.
    private String[] tratamento(String params){
        return params.split(", ");
    }

    public void intersecao(String[] entrada){
        //Recebendo o vetor de String tratado.
        String[] param1 = tratamento(entrada[0]);
        String[] param2 = tratamento(entrada[1]);

        //Declaro a minha variável e faço com que ela inicie com o primeiro vetor.
        HashSet<String> retorno = new LinkedHashSet<>(Arrays.asList(param1));
        //O método retainAll retém apenas os elementos que estão contidos na coleção chamada,
        //sendo assim evita o uso do FOR encadeado acompanhado de um IF para validação.
        retorno.retainAll(Arrays.asList(param2));
        //Mostrar a interseção
        System.out.println(retorno);
    }
}
