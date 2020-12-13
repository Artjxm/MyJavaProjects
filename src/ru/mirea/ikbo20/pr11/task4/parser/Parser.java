package ru.mirea.ikbo20.pr11.task4.parser;
import ru.mirea.ikbo20.pr11.task4.exceptions.FormatParserException;
import ru.mirea.ikbo20.pr11.task4.expression.TripleExpression;

public interface Parser {
    TripleExpression parse(String expression) throws FormatParserException;
}
