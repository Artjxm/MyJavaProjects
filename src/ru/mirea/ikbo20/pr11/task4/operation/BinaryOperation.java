package pr11.zadanie4.operation;
import pr11.zadanie4.expression.TripleExpression;
public abstract class BinaryOperation implements TripleExpression {
    private final TripleExpression left;
    private final TripleExpression right;

    public BinaryOperation(TripleExpression left, TripleExpression right) {
        this.left = left;
        this.right = right;
    }

    protected abstract int evaluate(int left, int right);


    public int evaluate(int x, int y, int z) {
        return evaluate(left.evaluate(x, y, z), right.evaluate(x, y, z));
    }
}