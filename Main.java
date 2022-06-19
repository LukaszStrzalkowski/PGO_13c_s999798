package com.company;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Main {

    private static final DecimalFormat df = new DecimalFormat("0.0");

    public static void main(String[] args) {

        List<Function> functions = new ArrayList<>();

        functions.add(new LinearFunction(2,4));
        functions.add(new SquareFunction(2,0,-2.5));
        functions.add(new AbsoluteLinearFunction(2,4));

        List<Fun> funList = new ArrayList<>(functions);

        System.out.println("Original functions");

        funList.forEach(f ->
                System.out.println(df.format(Fun.minimum(f,-4,0,0.1))));
        functions.forEach(f -> f.increaseCoefficientsBy(1.2));



        System.out.println("Functions increased by 1.2");

        funList.forEach(f ->
                System.out.println(df.format(Fun.minimum(f,-4,0,0.1))));
        functions.forEach(f -> f.decreaseCoefficientsBy(1.2));



        System.out.println("Functions decreased by 1.2");

        funList.forEach(f ->
                System.out.println(df.format(Fun.minimum(f,-4,0,0.1))));

        /*
        Dodatkowy sposób wykorzystania interfejsu Fun:

        Zadeklarowanie metody draw() w interfejsie, która wymusiłaby aby każda klasa implementująca interfejs Fun
        zapewniła implementację metody draw(), która służy do rysowania wykresów funkcji.

        ==============================================================

        Alternatywnie statyczna metoda add() przyjmująca dwie funkcje, oraz wartość dla której chcemy poznać wynik
        dodania dwóch funkcji do siebie.
        Przykładowa sygnatura metody:

        static double add(Fun func1, Fun func2, double x);

        Metoda ta dodawałaby do siebie func1 i func2 (func1+func2) i zwracałaby rezultat dla wywołania
        nowopowstałej funkcji dla parametru x -> (func1+func2)(x).
         */
    }
}
