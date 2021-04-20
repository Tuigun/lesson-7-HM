package com.company;

public abstract class Hero implements  HavingSuperAbility {
    private int health;
    private int demage;
    private String typeAbility;

    public Hero(int health, int demage, String typeAbility) {
        this.health = health;
        this.demage = demage;
        this.typeAbility = typeAbility;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDemage() {
        return demage;
    }

    public void setDemage(int demage) {
        this.demage = demage;
    }

    public String getTypeAbility() {
        return typeAbility;
    }

    public void setTypeAbility(String typeAbility) {
        this.typeAbility = typeAbility;
    }

}
