package ru.mirea.ikbo20.pr11.task4.operation.checked;
import ru.mirea.ikbo20.pr11.task4.exceptions.ArithmeticParserException;
import ru.mirea.ikbo20.pr11.task4.expression.TripleExpression;
import ru.mirea.ikbo20.pr11.task4.operation.UnaryOperation;

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
