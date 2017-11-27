package io.zipcoder;
import org.junit.Test;
import org.junit.Assert;
import org.junit.Before;

public class Problem4Test {

    private Problem4 direWolf = new Problem4();

    @Test
    public void dothrakiDefenseTest() {

        Boolean expected = Boolean.TRUE;
        Boolean actual = direWolf.dothrakiDefense("aaabbbb");
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void dothrakiDefenseFalse() {

        Boolean expected = Boolean.FALSE;
        Boolean actual = direWolf.dothrakiDefense("cdefghmnopqrstuvw");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void dothrakiDefenseTestTrue() {

        Boolean expected = Boolean.TRUE;
        Boolean actual = direWolf.dothrakiDefense("cdcdcdcdeeeef");
        Assert.assertEquals(expected, actual);
    }

}
