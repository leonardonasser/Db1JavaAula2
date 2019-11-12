package com.db1.do1start;

        import org.junit.Assert;
        import org.junit.Test;

public class Apptest {

    @Test
    public void teste() {
        Application application = new Application();
        Integer expected = 19;
        Integer response = application.soma(2, 3);
        Assert.assertEquals(expected, response);



    }


}
