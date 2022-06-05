package com.company;

import java.util.ArrayList;
import java.util.List;

public class Elixir {

    private String name;
    private boolean isCreated = false;
    private int power = 0;
    public List<Ingredient> ingredients = new ArrayList<Ingredient>();
    private Liquid catalyst;

    public Elixir(String name) {
        this.name = name;
    }

    public void addIngredient(Ingredient ingredient) {
        this.ingredients.add(ingredient);
    }


    public void removeIngredient(Ingredient ingredient) {
        this.ingredients.remove(ingredient);
    }

    public void Create() {

        if (catalyst == null) {
            System.out.println("Prosze dodaj katalizator.");
            return;
        }

        int temp_power = 0;

        for (int i = 0; i < this.ingredients.size(); i++) {


           temp_power += ingredients.get(i).getReagent();

        }

        int totalPower = temp_power/this.catalyst.getReagent();
        this.setPower(totalPower);
    }

    public String getName() {
        return name;
    }


    public boolean isCreated() {
        return isCreated;
    }


    public int getPower() {
        return power;
    }
    public void setPower(int power) {
        this.power = power;
    }

    public Liquid getCatalyst() {
        return catalyst;
    }

    public void setCatalyst(Liquid catalyst) {
        if (this.isCreated == true) {
            return;
        }

        this.catalyst = catalyst;
    }
}

