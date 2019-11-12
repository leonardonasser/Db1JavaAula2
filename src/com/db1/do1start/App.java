package com.db1.do1start;


import java.util.Scanner;

public class App {

    //Usando função
    public static String maiusculo(String textoM){
    String resultado;


    resultado= textoM.toUpperCase();

    return resultado;
    }

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String texto,result;

        System.out.println("Digite o texto: ");
        texto = ler.next();


        //retornando a função
        result = maiusculo(texto);
        System.out.println("Texto em maiusculo: "+result);


     }
    }




