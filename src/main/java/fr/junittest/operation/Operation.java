package fr.junittest.operation;

/**
 *  operation
 *
 */
public class Operation {
    /**
     * div
     *
     * @param a a
     * @param b b
     * @return {@link double}
     */
    public double div(int a, int b) throws Exception {
        if(b==0) throw new Exception("pas de zero");
        return a/b;
    }
}
