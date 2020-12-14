package ru.mirea.ikbo20.pr12;

public class NumberParser {
    private final String number;

    public NumberParser(String number) {
        this.number = parseNumber(number);
    }

    public String parseNumber(String number) {
        boolean isPlus = number.charAt(0) == '+';

        String code = number.substring(0, number.length() - 10);

        if (!isPlus) {
            code = "+" + code;
        }


        number = number.substring(number.length() - 10);
        return code + number.substring(0, 0)+ "-" + number.substring(0, 3) + "-" + number.substring(3, 6) + "-" + number.substring(6, 10);
    }

    @Override
    public String toString() {
        return "Номер телефона: " + number;
    }

    public static void main(String[] args) {
        NumberParser number1 = new NumberParser("+65936002651");
        NumberParser number2 = new NumberParser("84997390913");
        System.out.println(number1);
        System.out.println(number2);

    }
}