package com.db1.do1start;

import org.junit.Assert;
import org.junit.Test;

public class Apptest {
// =============================Exercícios de Inteiro (Integer)=============================================
//1 - Método que some dois números
    @Test
    public void InteiroEx1Integer() {
        Application application = new Application();
        Integer expected = 20;
        Integer response = application.InteiroEx1Integer(2, 3);
        Assert.assertEquals(expected, response);
    }

//2 - Método que subtraia dois números
    @Test
    public void InteiroEx2Integer() {
      Application application = new Application();
      Integer expected = 3;
      Integer response = application.InteiroEx2Integer(2, 3);
      Assert.assertEquals(expected, response);
}
//3 - Método que multiplique dois números
@Test
public void InteiroEx3Integer() {
    Application application = new Application();
    Integer expected = 20;
    Integer response = application.InteiroEx3Integer(2, 3);
    Assert.assertEquals(expected, response);
}
//4 - Método que divida dois números
@Test
public void InteiroEx4Integer() {
    Application application = new Application();
    Integer expected = 25;
    Integer response = application.InteiroEx4Integer(2, 3);
    Assert.assertEquals(expected, response);
}

//5 - Método que diga se o número é par
@Test
public void InteiroEx5Integer() {
    Application application = new Application();
    Boolean expected = true;
    Boolean response = application.InteiroEx5Integer(2);
    Assert.assertEquals(expected, response);
}


//6 - Método que receba dois números e diga qual é o maior
@Test
public void InteiroEx6Integer() {
    Application application = new Application();
    Boolean expected = false;
    Boolean response = application.InteiroEx6Integer(2,5);
    Assert.assertEquals(expected, response);
    if(expected == true){
        System.out.println("1 é menor");
    } else {
        System.out.printf("2 é menor");
    }

}


// 7 - Método que a partir de um valor inicial, mostre a quantidade de n ímpares até ele. -MODO NORMAL
@Test
public void  InteiroEx7Integer() {
    Application application = new Application();
    Integer expected = 25;
    Integer response = application.InteiroEx7Integer(50);
    Assert.assertEquals(expected, response);
    System.out.println("No total tem: "+expected+" impares");


}

//7 - Método que a partir de um valor inicial, mostre a quantidade de n ímpares até ele.  -MODO DESAFIO
    @Test
    public void  InteiroEx7Desafio() {
        Application application = new Application();
        Integer expected = 25;
        Integer response = application.InteiroEx7Desafio(30);
        Assert.assertEquals(expected, response);
        System.out.println("\n No total tem: "+expected+" impares");
    }
 //======================================================================================================




//===============================Exercícios de Texto (String)=============================================
    //1 - Método que receba um texto e devolva ele em LETRAS MAIUSCULAS
@Test
public void Ex1destring() {
    Application application = new Application();
    String response = application.Ex1destring("vai da certo");
    String expected = response.toUpperCase();
    Assert.assertEquals(expected, response);
    System.out.printf(expected);
}

//2 - Método que receba um texto e devolva ele em LETRAS MINUSCULAS
@Test
public void Ex2destring() {
    Application application = new Application();
    String response = application.Ex2destring("vai da certo");
    String expected = response.toLowerCase();
    Assert.assertEquals(expected, response);
    System.out.printf(expected);
}

//3 - Método que receba DB1START e retorne a quantidade de letras que existe nesta palavra
@Test
public void Ex3destring() {
    Application application = new Application();
    Integer response = application.Ex3destring("vai da certo");
    Integer expected = 8;
    Assert.assertEquals(expected, response);
    System.out.printf("DB1START Tem "+expected+" letras");
}

//4 - Método que receba DB1START (tendo um espaço no inicio e no fim da palavra) e retorne a quantidade de letras que existe
@Test
public void Ex4destring() {
    Application application = new Application();
    Integer response = application.Ex4destring("vai da certo");
    Integer expected = 10;
    Assert.assertEquals(expected, response);
    Integer x=0;
    System.out.printf("DB1START Tem 8 letras, mas está com "+expected+" caracteres contando com os espaço");
}

//5 - Método que retorne o item 4 com a mesma quantidade de letras do item 3. DB1START com espaço no começo e no final deve retornar somente DB1START
@Test
public void Ex5destring() {
    Application application = new Application();
    String response = application.Ex5destring(" DB1START ","db1start");
    String expected = "DB1START";
    Assert.assertEquals(expected, response);
    System.out.printf(expected);
}

//6 - Método que receba o seu nome completo e exiba somente as 4 primeiras letras do seu nome
    @Test
    public void  Ex6destring() {
        Application application = new Application();
        String response = application.Ex6destring("vai da certo");
        String expected = "Leon";
        Assert.assertEquals(expected, response);
        System.out.printf(expected);
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
    /*@Test
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
        String expected = "oditrevni otxet";
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
    Double expected = 7.666666666666667;
    Double response = application.Ex3deMatematica(10.0,5.0,8.0);
    Assert.assertEquals(expected, response);
   }


//4 - Método que calcule a área de um triangulo
    @Test
public void Ex4deMatematica(){
    Application application = new Application();
    Double expected = 48.0;
    Double response = application.Ex4deMatematica(12.0,8.0);
    Assert.assertEquals(expected, response);
}

}

