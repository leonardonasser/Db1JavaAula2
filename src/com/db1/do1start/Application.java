package com.db1.do1start;

//==============================Exercícios de Inteiro (Integer)===================================================
//7 - Método que a partir de um valor inicial, mostre a quantidade de n ímpares até ele.
public class Application {
        public Integer InteiroEx7Desafio(Integer numero){

            numero=50;
            numero=numero/2;

            return numero;


        }

//=================================Exercícios de Texto (String)====================================================


 //6 - Método que receba o seu nome completo e exiba somente as 4 primeiras letras do seu nome
    public String Ex6destring(String meunome){
             Integer x;
             String Primeirasletras= "";
             meunome= "Leonardo Mercado Nasser";
        Integer Quantidadedeletras=(meunome.length());

        for(x=0;x<4;x++){
            Primeirasletras += meunome.charAt(x);
        }
            return Primeirasletras;

        }

 //7 - Método que receba o seu nome completo e exiba a partir da terceira letra do seu nome
 public String Ex7destring(String meunome){
     Integer x;
     String letras= "";
     meunome= "Leonardo Mercado Nasser";
     Integer Quantidadedeletras=(meunome.length());

     for(x=2;x<Quantidadedeletras;x++){
        letras += meunome.charAt(x);
     }
     return letras;

 }

 //8 - Método que receba o seu nome completo e exiba somente as 4 ultimas letras do seu nome
    public String Ex8destring(String meunome){
        Integer x;
        String letras= "";
        meunome= "Leonardo Mercado Nasser";
        Integer Quantidadedeletras=(meunome.length());

        for(x=18;x<Quantidadedeletras;x++){
            letras += meunome.charAt(x);
        }
        return letras;
        }

//9 - Método que receba o seu nome completo e substitua o seu primeiro nome por ALUNO/ALUNA
    public String Ex9destring(String meunome){
        Integer x;
        String letras= "Aluno";
        meunome= "Leonardo Mercado Nasser";
        Integer Quantidadedeletras=(meunome.length());

        for(x=8;x<Quantidadedeletras;x++){
            letras += meunome.charAt(x);
        }
        return letras;
    }

  /*  //10 - Método que receba o seguinte texto "banana, maçã, melancia" e exiba o texto separadamente.
    public String[] Ex10destring(String texto){
        texto = "banana, maçã, melancia";
        String separado[] = texto.split(',');

        return separado;
    }*/

  //11 - Método que receba um texto e exiba quantas vogais tem no texto
    public Integer Ex11destring(Integer cont){
            String vogaisMaiusculo="AEIOU";
            String vogaisMinusculo="aeiou";
            Integer x,y;
            String texto="Db1start";
            Integer Quantidadedeletras=(texto.length());

        for(x=8;x<Quantidadedeletras;x++){
           for(y=0;y<5;y++) {
               if (vogaisMaiusculo.charAt(y) == texto.charAt(x) || vogaisMinusculo.charAt(y) == texto.charAt(x)) {
                   cont = cont + 1;
               }
           }
        }
        return cont;
    }

    //12 - Método que receba um texto e devolva ele invertido
    public String Ex12destring(String texto){
        texto = "texto invertido";
        String inverter ="";
        Integer Quantidadedeletras=texto.length(),x;

        for(x=Quantidadedeletras;x<0;x++){
            inverter += texto.charAt(x);
        }
        return inverter;
    }




//===================================Exercícios de Matemática (Double)========================================

//1 - Método que exiba qual é o menor valor entre dois doubles
    public Boolean Ex1deMatematica(Double valor1,Double valor2){
       valor1=5;
       valor2=10;

        if (valor1 < valor2) {
           return true;
        } else {
           return false;
        }

    }




}