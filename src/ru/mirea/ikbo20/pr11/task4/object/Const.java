package pr11.zadanie4.object;
import pr11.zadanie4.expression.TripleExpression;
public class Const implements TripleExpression {
    private final int iVal;
    private final double dVal;

    public Const(int value) {
        iVal = value;
        dVal = value;
    }

    public Const(double value) {
        iVal = 0;
        dVal = value;
    }

    public int evaluate(int x) {
        return iVal;
    }

    public double evaluate(double x) {
        return dVal;
    }

    public int evaluate(int x, int y, int z) {
        return iVal;
    }

}