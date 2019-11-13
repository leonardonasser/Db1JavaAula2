package com.db1.do1start;

import org.junit.Assert;
import org.junit.Test;

public class Apptest {

    @Test
    public void ParaParLer1() {
        Application application = new Application();
        Integer expected = 50;
        Integer response = application.soma(30);
        Assert.assertEquals(expected, response);

        Integer cont=0;

        cont=expected/2;

        System.out.println("\n No total tem: "+cont+" impares");


    }

/*
    @Test
    public void Paraimparler() {
        Application application = new Application();
        boolean expected = false;
        boolean response = application.soma(1);
        Assert.assertNotEquals(expected, response);
        if (expected == false) {
            System.out.println("NUMERO IMPAR");
        }
    }
*/
}