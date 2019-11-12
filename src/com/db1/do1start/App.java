package com.db1.do1start;


import java.util.Scanner;

public class App {

    //Usando função
    public static Double menornumero(Double valor1, Double valor2, Double valor3){
    Double resultado;

        if (valor1<valor2 && valor1<valor3) {
            resultado=valor1;
        }
//=============
        if (valor2<valor1 && valor2<valor3){
            resultado=valor2;
        }
//==============
        if (valor3<valor1 && valor3<valor2){
            resultado=valor3;
        }
        return resultado;
    }

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Double numero1,numero2,numero3;
        Double result;

        System.out.println("Digite o numero1: ");
        numero1 = ler.nextDouble();

        System.out.println("Digite o numero2: ");
        numero2 = ler.nextDouble();

        System.out.println("Digite o numero3: ");
        numero3 = ler.nextDouble();

        //retornando a função
        result = menornumero(numero1,numero2,numero3);
        System.out.println("O valor menor é o: "+result);


     }
    }




