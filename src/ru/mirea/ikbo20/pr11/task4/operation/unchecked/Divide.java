package ru.mirea.ikbo20.pr11.task4.operation.unchecked;
import ru.mirea.ikbo20.pr11.task4.expression.TripleExpression;
import ru.mirea.ikbo20.pr11.task4.operation.Operation;

public class Divide extends Operation {
    public Divide(TripleExpression left, TripleExpression right) {
        super(left, right);
    }

    protected int evaluate(int left, int right) {
        return left / right;
    }

    protected double evaluate(double left, double right) {
        return left / right;
    }
}
