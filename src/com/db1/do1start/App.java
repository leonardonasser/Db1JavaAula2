package com.db1.do1start;


import java.util.Scanner;

public class App {

    //Usando função
    public static String minusculo(String textoMinus){
    String resultado;


    resultado= textoMinus.toLowerCase();

    return resultado;
    }

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String texto,result;

        System.out.println("Digite o texto em maiusculo: ");
        texto = ler.next();


        //retornando a função
        result = minusculo(texto);
        System.out.println("Texto em minusculo: "+result);


     }
    }




