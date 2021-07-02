package fr.junittest.operation;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class OperationTest extends Operation {

    /**
     * test div
     *
     */
    @Test
    public void testDiv() {
        Operation operation = new Operation();
        try {
            double result = operation.div(3, 0);
            fail("except non gerer");
        }catch (Exception e){
            assertThat(e.getMessage(),is("pas de zero"));
        }
    }
    @Test(expected=Exception.class)
    public void testDiv3() throws  Exception {
        Operation op = new Operation();
        double resultat = op.div(3, 0);
    }
}