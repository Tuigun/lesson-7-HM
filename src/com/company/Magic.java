package com.company;

public class Magic extends Hero {


    public Magic(int health, int demage, String typeAbility) {
        super(health, demage, typeAbility);
    }

    @Override
    public void havingSuperAbility(String superAbilityType) {
        System.out.println("Magic ability: " + superAbilityType);
    }
}
