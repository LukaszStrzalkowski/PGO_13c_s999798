package com.company;

public class Liquid extends Ingredient {

    private int dissolubility;

    public Liquid(String name, int baseReagent, int dissolubility) {
        super.setBaseReagent(baseReagent);
        super.setName(name);

        if (dissolubility > 100) {
            dissolubility = 100;
        }

        if (dissolubility < 0) {
            dissolubility = 0;
        }

        this.setDissolubility(dissolubility);
    }

    @Override
    public int getReagent() {
        return super.getReagent() * (this.getDissolubility()/100);
    }



    public int getDissolubility() {
        return dissolubility;
    }
    public void setDissolubility(int dissolubility) {
        this.dissolubility = dissolubility;
    }
}
