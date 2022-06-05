package com.company;

public class Crystal extends Mineral {

    private int magicPower;

    public Crystal(String name, int baseReagent, int power, int magicPower) {

        super(name, baseReagent, power);
        this.magicPower = magicPower;
    }

    @Override
    public int getReagent() {
        return super.getReagent() + this.getMagicPower();
    }

    public int getMagicPower() {
        return magicPower;
    }
}
