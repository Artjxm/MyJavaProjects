package pr11.zadanie4.operation.unchecked;
import pr11.zadanie4.expression.TripleExpression;
import pr11.zadanie4.operation.Operation;
public class Add extends Operation {
    public Add(TripleExpression left, TripleExpression right) {
        super(left, right);
    }

    protected int evaluate(int left, int right) {
        return left + right;
    }

    protected double evaluate(double left, double right) {
        return left + right;
    }


}
