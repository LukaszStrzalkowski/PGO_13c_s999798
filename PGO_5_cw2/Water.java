package com.company;

public class Water extends Liquid {

    private boolean distilated;

    public Water(String name, int baseReagent, int dissolubility, boolean distilated) {
        super(name, baseReagent, dissolubility);
        this.distilated = distilated;
    }

    @Override
    public int getReagent() {

        if (distilated == true) {
            return super.getReagent();
        } else {
            return super.getReagent()/2;
        }

    }



    public boolean isDistilated() {
        return distilated;
    }
    public void setDistilated(boolean distilated) {
        this.distilated = distilated;
    }
}
