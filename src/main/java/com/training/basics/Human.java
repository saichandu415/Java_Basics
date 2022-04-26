package com.training.basics;

public class Human extends Animal{

    private boolean canTalk;

    public Human() {
        super.setType("human");
        super.setWeight(2);
        super.setLifetime(100);
    }

    public boolean isCanTalk() {
        return canTalk;
    }

    public void setCanTalk(boolean canTalk) {
        this.canTalk = canTalk;
    }

    @Override
    public String toString() {
        return super.toString()+"Human{" +
                "canTalk=" + canTalk +
                '}';
    }
}
