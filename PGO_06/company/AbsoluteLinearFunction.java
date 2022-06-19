package com.company;

public class AbsoluteLinearFunction extends LinearFunction implements Fun {

    public AbsoluteLinearFunction(double a, double b) {
        super(a, b);
    }

    @Override
    public double f(double x) {
        return Math.abs(this.getA() * x + this.getB());
    }
}
