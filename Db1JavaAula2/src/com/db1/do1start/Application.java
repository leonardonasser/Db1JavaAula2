package com.db1.do1start;
public class Application {
//==============================Exercícios de Inteiro (Integer)===================================================
//1 - Método que some dois números
        public Integer InteiroEx1Integer(Integer numero1,Integer numero2){
            Integer resultado;
            numero1=10;numero2=10;
            resultado=numero1+numero2;
            return resultado;
        }

//2 - Método que subtraia dois números
    public Integer InteiroEx2Integer(Integer numero1,Integer numero2){
        Integer resultado;
        numero1=5;numero2=2;
        resultado=numero1-numero2;
        return resultado;
    }

//3 - Método que multiplique dois números

    public Integer InteiroEx3Integer(Integer numero1,Integer numero2){
        Integer resultado;
        numero1=5;numero2=4;
        resultado=numero1*numero2;
        return resultado;
    }

//4 - Método que divida dois números
    public Integer InteiroEx4Integer(Integer numero1,Integer numero2){
        Integer resultado;
        numero1=50;numero2=2;
        resultado=numero1/numero2;
        return resultado;
    }

//5 - Método que diga se o número é par
public boolean InteiroEx5Integer(Integer numero){
          numero = 6;
          if(numero % 2 == 0){
              return true;
          }
             else {
              return false;
          }
      }

//6 - Método que receba dois números e diga qual é o maior
  public Boolean InteiroEx6Integer(Integer numero1, Integer numero2) {
          numero1=5;numero2=4;
          if(numero1<numero2){
              return true;
          }
          else{
              return false;
          }

  }



//7 - Método que a partir de um valor inicial, mostre a quantidade de n ímpares até ele.-MODO NORMAL


    public Integer InteiroEx7Integer(Integer numero) {
        numero = 50;
        Integer x = 0, cont = 0;
        for (x = 0; x <= numero; x++) {
            if (x % 2 == 1) {
                cont = cont + 1;
            }
        }
            return cont;


    }

//7 - Método que a partir de um valor inicial, mostre a quantidade de n ímpares até ele. -MODO DESAFIO
    public Integer InteiroEx7Desafio(Integer numero) {
        numero = 50;
        numero = numero / 2;
        return numero;
    }
//=================================================================================================================


//=================================Exercícios de Texto (String)====================================================
//1 - Método que receba um texto e devolva ele em LETRAS MAIUSCULAS
    public String Ex1destring(String escrita){
        escrita="texto em maiusculo";
        escrita=escrita.toUpperCase();
        return escrita;
    }

//2 - Método que receba um texto e devolva ele em LETRAS MINUSCULAS
public String Ex2destring(String escrita){
    escrita="TEXTO EM MINUSCULO";
    escrita=escrita.toLowerCase();
    return escrita;
}
//3 - Método que receba DB1START e retorne a quantidade de letras que existe nesta palavra
public Integer Ex3destring(String escrita){
    escrita="DB1START";
    Integer Quantidadedeletras=(escrita.length());
    return Quantidadedeletras;
}

//4 - Método que receba DB1START (tendo um espaço no inicio e no fim da palavra) e retorne a quantidade de letras que existe
public Integer Ex4destring(String escrita){
    escrita=" DB1START ";
    Integer Quantidadedeletras=(escrita.length());
    return Quantidadedeletras;
}
//5 - Método que retorne o item 4 com a mesma quantidade de letras do item 3. DB1START com espaço no começo e no final deve retornar somente DB1START
public String  Ex5destring(String item1,String item2){
    item1=" DB1START ";item2="";
    Integer x, Quantidadedeletras=(item1.length());
    for(x=1;x<Quantidadedeletras-1;x++){
        item2 += item1.charAt(x);
    }
    return item2;
}


//6 - Método que receba o seu nome completo e exiba somente as 4 primeiras letras do seu nome
    public String Ex6destring(String meunome) {
        Integer x;
        String Primeirasletras = "";
        meunome = "Leonardo Mercado Nasser";
        Integer Quantidadedeletras = (meunome.length());
        for (x = 0; x < 4; x++) {
            Primeirasletras += meunome.charAt(x);
        }
        return Primeirasletras;

    }

    //7 - Método que receba o seu nome completo e exiba a partir da terceira letra do seu nome
    public String Ex7destring(String meunome) {
        Integer x;
        String letras = "";
        meunome = "Leonardo Mercado Nasser";
        Integer Quantidadedeletras = (meunome.length());

        for (x = 2; x < Quantidadedeletras; x++) {
            letras += meunome.charAt(x);
        }
        return letras;

    }

    //8 - Método que receba o seu nome completo e exiba somente as 4 ultimas letras do seu nome
    public String Ex8destring(String meunome) {
        Integer x;
        String letras = "";
        meunome = "Leonardo Mercado Nasser";
        Integer Quantidadedeletras = (meunome.length());

        for (x = 18; x < Quantidadedeletras; x++) {
            letras += meunome.charAt(x);
        }
        return letras;
    }

    //9 - Método que receba o seu nome completo e substitua o seu primeiro nome por ALUNO/ALUNA
    public String Ex9destring(String meunome) {
        Integer x;
        String letras = "Aluno";
        meunome = "Leonardo Mercado Nasser";
        Integer Quantidadedeletras = (meunome.length());

        for (x = 8; x < Quantidadedeletras; x++) {
            letras += meunome.charAt(x);
        }
        return letras;
    }

  //10 - Método que receba o seguinte texto "banana, maçã, melancia" e exiba o texto separadamente.
    public String[] Ex10destring(String texto){
        texto = "banana, maçã, melancia";
        String[] textoseparado = texto.split(",");
        return textoseparado;
    }

    //11 - Método que receba um texto e exiba quantas vogais tem no texto
    public Integer Ex11destring(Integer cont) {
        String vogaisMaiusculo = "AEIOU";
        String vogaisMinusculo = "aeiou";
        Integer x, y;
        String texto = "Db1start";
        Integer Quantidadedeletras = (texto.length());
        for (x = 8; x < Quantidadedeletras; x++) {
            for (y = 0; y < 5; y++) {
                if (vogaisMaiusculo.charAt(y) == texto.charAt(x) || vogaisMinusculo.charAt(y) == texto.charAt(x)) {
                    cont = cont + 1;
                }
            }
        }
        return cont;
    }

    //12 - Método que receba um texto e devolva ele invertido
    public String Ex12destring(String texto) {
        texto = "texto invertido";
        String invertida = new StringBuilder(texto).reverse().toString();
        return invertida;
    }


//===================================Exercícios de Matemática (Double)========================================

//1 - Método que exiba qual é o menor valor entre dois doubles
    public Boolean Ex1deMatematica(Double valor1, Double valor2) {
        valor1 = 5.0;
        valor2 = 10.0;

        if (valor1 < valor2) {
            return true;
        } else {
            return false;
        }
    }


 //2 - Método que exiba qual é o menor valor entre três doubles
    public Integer Ex2deMatematica(Double valor1, Double valor2, Double valor3) {
        valor1 = 5.0;
        valor2 = 10.0;
        valor3 = 8.0;
        Integer cont = 0;
        if (valor1 < valor2 && valor1 < valor3) {
            cont = 1;

        }
        if (valor2 < valor1 && valor2 < valor3) {
            cont = 2;


        }
        if (valor3 < valor1 && valor3 < valor2) {
            cont = 3;
        }
        return cont;
    }

//3 - Método que exiba a média de três números
    public Double Ex3deMatematica(Double valor1, Double valor2, Double valor3) {
        valor1 = 5.0;valor2 = 10.0;valor3 = 8.0;
        Double media = 0.0, soma = 0.0;
        soma = valor1 + valor2 + valor3;
        media = soma / 3;
        return media;
    }

//4 - Método que calcule a área de um triangulo
    public Double Ex4deMatematica(Double base, Double altura) {
         base=12.0;altura= 8.0;
           Double area = 0.0, soma = 0.0;
             soma = base*altura;
               area =  soma/2;
                 return area;
    }
}