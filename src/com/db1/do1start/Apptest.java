package com.db1.do1start;

        import org.junit.Assert;
        import org.junit.Test;

public class Apptest {

    @Test
    public void deveser5() {
        Application application = new Application();
        Integer expected = 5;
        Integer response = application.soma(2, 3);
        Assert.assertEquals(expected, response);
    }

        @Test
        public void Naodeveser10() {
            Application application = new Application();
            Integer expected = 10;
            Integer response = application.soma(2, 3);
            Assert.assertNotEquals(expected, response);


    }


}
