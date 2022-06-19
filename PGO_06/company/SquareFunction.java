package com.company;

public class SquareFunction extends Function implements Fun {

    private double c;

    public SquareFunction(double a, double b, double c) {
        this.setA(a);
        this.setB(b);
        this.setC(c);
    }


    @Override
    public double f(double x) {
        return this.getA() * Math.pow(x, 2) + this.getB() * x + this.getC();
    }

    @Override
    void increaseCoefficientsBy(double delta) {
        this.setA(this.getA()+delta);
        this.setB(this.getB()+delta);
        this.setC(this.getC()+delta);
    }

    @Override
    void decreaseCoefficientsBy(double delta) {
        this.setA(this.getA()-delta);
        this.setB(this.getB()-delta);
        this.setC(this.getC()-delta);
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
}
