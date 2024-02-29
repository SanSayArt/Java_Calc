package core;

public class ComplexNumb {

    private double a;
    private double b;

    public ComplexNumb(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    @Override
    public String toString() {
        if(b<0){
            return a + "" + b + "i";
        }
        else {
            return a + "+" + b + "i";
        }
    }
}
