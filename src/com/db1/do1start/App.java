package com.db1.do1start;


import java.util.Scanner;

public class App {

    //Usando função
    public static String menornumero(Double valor1, Double valor2){
    String resultado;

        if (valor1 < valor2) {
            resultado="Menor valor é o 1";
        } else {
            resultado="Menor valor é o 2";
        }

    return resultado;
    }

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Double numero1,numero2;
        String result;

        System.out.println("Digite o numero1: ");
        numero1 = ler.nextDouble();

        System.out.println("Digite o numero2: ");
        numero2 = ler.nextDouble();

        //retornando a função
        result = menornumero(numero1,numero2);
        System.out.println(result);


     }
    }




