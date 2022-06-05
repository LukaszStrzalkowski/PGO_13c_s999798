package com.company;

public class Ore extends Mineral {

    private boolean metallic;

    public Ore(String name, int baseReagent, int power, boolean metallic) {

        super(name, baseReagent, power);
    }

    @Override
    public int getReagent() {

        if (metallic == true) {
            return super.getReagent();
        } else {
            return super.getReagent() / 2;
        }

    }
}
