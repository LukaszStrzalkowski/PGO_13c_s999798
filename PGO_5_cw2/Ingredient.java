package com.company;

public abstract class Ingredient {

    private String name;
    private int baseReagent;

    public int getReagent() {
        return baseReagent;
    }



    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setBaseReagent(int baseReagent) {
        this.baseReagent = baseReagent;
    }
}
