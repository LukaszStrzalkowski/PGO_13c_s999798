package com.company;

public class LinearFunction extends Function implements Fun {

    public LinearFunction(double a, double b) {
        this.setA(a);
        this.setB(b);
    }

    @Override
    public double f(double x) {
        return this.getA() * x + this.getB();
    }

}
