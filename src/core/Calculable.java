package core;

public interface Calculable {
    void sum(ComplexNumb a, ComplexNumb b);
    void diff(ComplexNumb a, ComplexNumb b);
    void multiply(ComplexNumb a, ComplexNumb b);
    void divide(ComplexNumb a, ComplexNumb b);
    ComplexNumb calculationResult();
    ComplexNumb clear();
}
