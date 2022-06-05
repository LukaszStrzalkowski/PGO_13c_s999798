package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here


        Water kropla_beskidu = new Water("Kropla beskidu", 100, 100, true);

        Crystal topaz = new Crystal("Topaz", 150, 10, 200);

        Elixir kot = new Elixir("kot");

        kot.addIngredient(kropla_beskidu);
        kot.addIngredient(topaz);
        //kot.setCatalyst(kropla_beskidu);
        kot.Create();

        System.out.println(kot.getPower());
    }
}
