package core;

public class Logger implements Calculable{
    private Calculable calculate;

    public Logger(Calculable calculate) {
        this.calculate = calculate;
    }

    @Override
    public void sum(ComplexNumb a, ComplexNumb b) {
        System.out.printf("Cуммирую: (%s) + (%s) = ", a,b);
        calculate.sum(a,b);

    }

    @Override
    public void multiply(ComplexNumb a, ComplexNumb b) {
        System.out.printf("Умножаю: (%s) * (%s) = ",a,b);
        calculate.multiply(a,b);

    }

    @Override
    public void divide(ComplexNumb a, ComplexNumb b) {
        System.out.printf("Делю: (%s) / (%s) = ", a,b);
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
