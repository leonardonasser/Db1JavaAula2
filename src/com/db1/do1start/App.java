package com.db1.do1start;


import java.util.Scanner;

public class App {

    //Usando função
    public static Integer soma(Integer num1,Integer num2){
    Integer resultado;

    resultado= num1+num2;

    return resultado;
    }

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int result, num1, num2;

        System.out.println("Digite o num1: ");
        num1 = ler.nextInt();

        System.out.println("Digite o num2: ");
        num2 = ler.nextInt();

        //retornando a função
        result = soma(num1, num2);
        System.out.println(result);


     }
    }




