package com.company;

public interface Fun {
    double f(double x);

    static double minimum(Fun func, double a, double b, double alpha) {
        double currentMin = func.f(a);

        double iterator = a;

        while (iterator <= b) {
            double result = func.f(iterator);

            if (result < currentMin) {
                currentMin = result;
            }

            iterator += alpha;
        }
        return currentMin;
    };
}
