package com.company;

public class Medic extends Hero {

    public Medic(int health, int demage, String typeAbility) {
        super(health, demage, typeAbility);
    }

    @Override
    public void havingSuperAbility(String superAbilityType) {
        System.out.println("Medic ability: " + superAbilityType);
    }
}
