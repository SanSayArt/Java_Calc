package core;

public class Logger implements Calculable{
    private Calculable calculate;

    public Logger(Calculable calculate) {
        this.calculate = calculate;
    }

    @Override
    public void sum(ComplexNumb a, ComplexNumb b) {
        System.out.printf("Произведено сложение: (%s) + (%s) = ", a,b);
        calculate.sum(a,b);

    }
    @Override
    public void diff(ComplexNumb a, ComplexNumb b){
        System.out.printf("Произведено вычитание: (%s) - (%s) = ", a, b);
        calculate.diff(a,b);
    }

    @Override
    public void multiply(ComplexNumb a, ComplexNumb b) {
        System.out.printf("Произведено умножение: (%s) * (%s) = ",a,b);
        calculate.multiply(a,b);

    }

    @Override
    public void divide(ComplexNumb a, ComplexNumb b) {
        System.out.printf("Произведено деление: (%s) / (%s) = ", a,b);
        calculate.divide(a,b);

    }

    @Override
    public ComplexNumb calculationResult() {
        return calculate.calculationResult();
    }

    @Override
    public ComplexNumb clear() {
        return calculate.clear();
    }
}
