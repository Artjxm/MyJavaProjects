package pr11.zadanie4.operation.checked;
import pr11.zadanie4.exceptions.ArithmeticParserException;
import pr11.zadanie4.expression.TripleExpression;
import pr11.zadanie4.operation.BinaryOperation;
public class CheckedMultiply extends BinaryOperation {
    public CheckedMultiply(TripleExpression left, TripleExpression right) {
        super(left, right);
    }

    protected int evaluate(int left, int right) {
        if (right > 0 ? left > Integer.MAX_VALUE / right
                || left < Integer.MIN_VALUE / right
                : (right < -1 ? left > Integer.MIN_VALUE / right
                || left < Integer.MAX_VALUE / right
                : right == -1
                && left == Integer.MIN_VALUE)) {
            throw new ArithmeticParserException("Overflow exception : " + left + "*" + right);
        }
        return left * right;
    }
}