package fr.junittest.utils;

import fr.junittest.operation.Operation;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class StringUtilsTest extends Operation {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testlevenshteinDistance() throws Exception {
        CharSequence carS = "chat";
        CharSequence car = "chatsh";
        int test;
        test =StringUtils.levenshteinDistance(carS,car);
        assertEquals(test,2);
    }
    @Test
    public void testlevenshteinDistanceNull() throws Exception {
        CharSequence carS = null;
        CharSequence car = null;
        try {
            int test;

            test =StringUtils.levenshteinDistance(carS,car);

            fail("except non gerer");
        }catch (Exception e){
            assertThat(e.getMessage(),is("test 2param null"));
        }
    }
}