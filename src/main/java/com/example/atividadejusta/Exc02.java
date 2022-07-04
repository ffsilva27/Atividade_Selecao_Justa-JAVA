package com.example.atividadejusta;

public class Exc02 {

    //O método deixei como privado, tendo em vista que funciona de suporte para um método interno e tem como
    // objetivo apenas eliminar os números e pontuação.
    private String tratamento(String param){
        return param.replaceAll("[0-9]|[.!?\\\\-]", "");
    }

    public void verificaMaior(String entrada){
        //Após chamar o método acima para realizar o tratamento dos dados quebro a frase em palavras.
        String[] entradaTratada = tratamento(entrada).split(" ");
        //Declaro a variável que irá receber a maior palavra.
        String maiorPalavra = "";

        //Percorro cada palavra e verifico se ela é maior do que a que esta armazenada,
        //caso sim, armazeno a nova.
        for(String ent : entradaTratada){
            if(ent.length() > maiorPalavra.length()){
                maiorPalavra = ent;
            }
        }
        //Mostro a maior palavra.
        System.out.println(maiorPalavra);
    }
}
