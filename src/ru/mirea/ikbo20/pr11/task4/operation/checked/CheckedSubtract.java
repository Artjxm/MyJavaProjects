package pr11.zadanie4.operation.checked;
import pr11.zadanie4.exceptions.ArithmeticParserException;
import pr11.zadanie4.expression.TripleExpression;
import pr11.zadanie4.operation.BinaryOperation;
public class CheckedSubtract extends BinaryOperation {
    public CheckedSubtract(TripleExpression left, TripleExpression right) {
        super(left, right);
    }

    protected int evaluate(int left, int right) {
        if (right > 0 ? left < Integer.MIN_VALUE + right
                : left > Integer.MAX_VALUE + right) {
            throw new ArithmeticParserException("Integer overflow");
        }
        return left - right;
    }
}