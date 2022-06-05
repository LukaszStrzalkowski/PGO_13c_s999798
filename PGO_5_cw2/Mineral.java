package com.company;

public class Mineral extends Ingredient {

    private int power;

    public Mineral(String name, int baseReagent, int power) {
        super.setBaseReagent(baseReagent);
        super.setName(name);
        this.power = power;
    }

    @Override
    public int getReagent() {
        return super.getReagent() + this.getPower();
    }

    public int getPower() {
        return power;
    }
}
