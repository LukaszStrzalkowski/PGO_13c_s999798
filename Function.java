package com.company;

public abstract class Function implements Fun {

    private double a;
    private double b;

    void increaseCoefficientsBy(double delta) {
        this.setA(this.getA()+delta);
        this.setB(this.getB()+delta);
    }

    void decreaseCoefficientsBy(double delta) {
        this.setA(this.getA()-delta);
        this.setB(this.getB()-delta);
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }


    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }
}
