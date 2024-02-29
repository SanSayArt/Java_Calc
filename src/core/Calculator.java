package core;

public class Calculator implements Calculable {
    private ComplexNumb result;
    private double firstPart;
    private double secondPart;

    public Calculator() {
        new ComplexNumb(0, 0);
    }

    @Override
    public void sum(ComplexNumb a, ComplexNumb b) {
        firstPart = a.getA() + b.getA();
        secondPart = a.getB() + b.getB();
        result = new ComplexNumb(firstPart, secondPart);

    }
    @Override
    public void diff(ComplexNumb a, ComplexNumb b) {
        firstPart = a.getA() - b.getA();
        secondPart = a.getB() - b.getB();
        result = new ComplexNumb(firstPart, secondPart);

    }
    @Override
    public void multiply(ComplexNumb a, ComplexNumb b) {
        firstPart = (a.getA() * b.getA()) - (a.getB() * b.getB());
        secondPart = (a.getA() * b.getB()) + (a.getB() * b.getA());
        result = new ComplexNumb(firstPart, secondPart);
    }

    @Override
    public void divide(ComplexNumb a, ComplexNumb b) {
        try {
            firstPart = (a.getA() * b.getA() + a.getB() * b.getB()) / (b.getA() * b.getA() + b.getB() * b.getB());
            secondPart = (a.getB() * b.getA() - a.getA() * b.getB()) / (b.getA() * b.getA() + b.getB() * b.getB());
        } catch (ArithmeticException e) {
            throw new ArithmeticException("Divide by zero exception");
        }
        result = new ComplexNumb(firstPart, secondPart);

    }

    @Override
    public ComplexNumb calculationResult() {
        return this.result;
    }

    @Override
    public ComplexNumb clear() {
        return this.result = new ComplexNumb(0, 0);
    }
}
