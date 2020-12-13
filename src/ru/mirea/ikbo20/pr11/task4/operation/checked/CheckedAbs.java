package pr11.zadanie4.operation.checked;
import pr11.zadanie4.exceptions.ArithmeticParserException;
import pr11.zadanie4.expression.TripleExpression;
import pr11.zadanie4.operation.UnaryOperation;
public class CheckedAbs extends UnaryOperation {
    public CheckedAbs(TripleExpression object) {
        super(object);
    }

    protected int evaluate(int object) {
        if (object == Integer.MIN_VALUE) {
            throw new ArithmeticParserException("Overflow exception : abs(" + object + ")");
        }
        return object < 0 ? -object : object;
    }

}