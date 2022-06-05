package com.company;

public class Plant extends Ingredient {

    private int toxity;

    public Plant(String name, int baseReagent, int toxity) {
        super.setBaseReagent(baseReagent);
        super.setName(name);
        this.toxity = toxity;
    }

    @Override
    public int getReagent() {
        return super.getReagent() * this.getToxity();
    }

    public int getToxity() {
        return toxity;
    }
}
