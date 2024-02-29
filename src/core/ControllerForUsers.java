package core;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ControllerForUsers {
    private final Calculable calc;
    private final List<String> validOperators;

    public ControllerForUsers(Calculable calculator) {
        this.calc = calculator;
        this.validOperators = Arrays.stream(Operators.values())
                .map(Operators::operator)
                .collect(Collectors.toList());;
    }

    public String ReadConsole(String message){
        Scanner in = new Scanner(System.in);
        System.out.println(message);
        return in.nextLine();
    }

    public ComplexNumb initiateNumber(String message){
        System.out.println(message);
        String firstPart = ReadConsole("Введите вещественную часть комплексного числа: ");
        String secondPart = ReadConsole("Введите мнимую часть комплексного числа: ");

        double first = Double.parseDouble(firstPart);
        double second = Double.parseDouble(secondPart);

        return new ComplexNumb(first,second);
    }


    private boolean isInvalidOperator(String operator){
        return !validOperators.contains(operator);
    }

    public String getOperator(){
        String operator = ReadConsole("Введите математическую операцию (+ , - , * , / ) : ");
        while(true){
            if(isInvalidOperator(operator)){
                System.err.println("Введен неизвестный оператор. ");
                operator = ReadConsole("Введите математическую операцию (+ , - , * , / ) :");
            } else return operator;
        }
    }

    public void prepare(){
        ComplexNumb a = initiateNumber("Первое комплексное число: ");
        String operator = getOperator();
        ComplexNumb b = initiateNumber("Второе комплескное число: ");
        if(operator.equals("*")){
            calc.multiply(a,b);
        }
        if(operator.equals("+")){
            calc.sum(a,b);
        }
        if(operator.equals("/")){
            calc.divide(a,b);
        }
        if(operator.equals("-")){
            calc.diff(a,b);
        }

        System.out.println(calc.calculationResult());
        calc.clear();
    }
}
