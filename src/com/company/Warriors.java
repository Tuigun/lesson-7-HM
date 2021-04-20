package com.company;

public class Warriors extends Hero {

    public Warriors(int health, int demage, String typeAbility) {
        super(health, demage, typeAbility);
    }

    @Override
    public void havingSuperAbility(String superAbilityType) {
        System.out.println("Warrior ability: " + superAbilityType);
    }
}
