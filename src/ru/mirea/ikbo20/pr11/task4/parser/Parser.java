package pr11.zadanie4.parser;
import pr11.zadanie4.exceptions.FormatParserException;
import pr11.zadanie4.expression.TripleExpression;
public interface Parser {
    TripleExpression parse(String expression) throws FormatParserException;
}