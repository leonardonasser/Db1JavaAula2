package com.db1.do1start;

import org.junit.Assert;
import org.junit.Test;

public class Apptest {



    //  Exercícios de Inteiro (Integer)

//7 - Método que a partir de um valor inicial, mostre a quantidade de n ímpares até ele. -MODO DESAFIO
    @Test
    public void  InteiroEx7Desafio() {
        Application application = new Application();
        Integer expected = 25;
        Integer response = application.InteiroEx7Desafio(30);
        Assert.assertEquals(expected, response);
        System.out.println("\n No total tem: "+expected+" impares");


    }

    //Exercícios de Texto (String)


    //6 - Método que receba o seu nome completo e exiba a partir da terceira letra do seu nome
    @Test
    public void  Ex6destring() {
        Application application = new Application();
        String response = application.Ex6destring("leonardo");
        String expected = "Leon";
        Assert.assertEquals(expected, response);

    }

    //7 - Método que receba o seu nome completo e exiba a partir da terceira letra do seu nome
    @Test
    public void  Ex7destring() {
        Application application = new Application();
        String response = application.Ex7destring("leonardo");
        String expected = "onardo Mercado Nasser";
        Assert.assertEquals(expected, response);

    }
    //8 - Método que receba o seu nome completo e exiba somente as 4 ultimas letras do seu nome

    @Test
    public void  Ex8destring() {
        Application application = new Application();
        String response = application.Ex8destring("leonardo");
        String expected = "asser";
        Assert.assertEquals(expected, response);

    }

    //9 - Método que receba o seu nome completo e substitua o seu primeiro nome por ALUNO/ALUNA

    @Test
    public void  Ex9destring() {
        Application application = new Application();
        String response = application.Ex9destring("leonardo");
        String expected = "Aluno Mercado Nasser";
        Assert.assertEquals(expected, response);
    }

    //10 - Método que receba o seguinte texto "banana, maçã, melancia" e exiba o texto separadamente.
  /*  @Test
    public void  Ex10destring() {
        Application application = new Application();
        String expected[]={"banana", "maçã", "melancia"};
        String response = application.Ex10destring("");
        Assert.assertEquals(expected, response);
    }*/

   // 11 - Método que receba um texto e exiba quantas vogais tem no texto
   @Test
   public void  Ex11destring() {
       Application application = new Application();
       Integer expected = 1;
       Integer response = application.Ex11destring(1);
       Assert.assertEquals(expected, response);
   }
    //12 - Método que receba um texto e devolva ele invertido

    @Test
    public void  Ex12destring() {
        Application application = new Application();
        String expected = "oditevni otxet";
        String response = application.Ex12destring("texto invertido");
        Assert.assertEquals(expected, response);

        System.out.println("Texto invertido: "+expected);
    }

//===================================Exercícios de Matemática (Double)========================================

//1 - Método que exiba qual é o menor valor entre dois doubles
    @Test
public void  Ex1deMatematica() {
    Application application = new Application();
    Boolean expected = true;
    Boolean response = application.Ex1deMatematica(10.0,5.0);
    Assert.assertEquals(expected, response);

    if(expected==true){
        System.out.println("1 menor");
    }else{
        System.out.println("2 menor");
    }
   }


//2 - Método que exiba qual é o menor valor entre três doubles
       @Test
    public void  Ex2deMatematica() {
        Application application = new Application();
        Integer expected = 1;
        Integer response = application.Ex2deMatematica(10.0,5.0,8.0);
        Assert.assertEquals(expected, response);

        if(expected==1){
            System.out.println("1 menor");
        }if(expected==2){
            System.out.println("2 menor");
        }
        if(expected==3){
            System.out.println("3 menor");

        }
    }

//3 - Método que exiba a média de três números
@Test
public void  Ex3deMatematica() {
    Application application = new Application();
    Integer expected = 1;
    Integer response = application.Ex3deMatematica(10.0,5.0,8.0);
    Assert.assertEquals(expected, response);
   }
}

