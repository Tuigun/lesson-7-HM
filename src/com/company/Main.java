package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Magic magic = new Magic(400,50,"Magical");
        Medic medic = new Medic(250,30,"Treating");
        Warriors warriors = new Warriors(500,40,"Critical");


        Hero[] heroes = {magic,medic,warriors};
        for (int i = 0; i< heroes.length; i++){
            System.out.println("Magic: health = "+heroes[i].getHealth() + ",damage = " + heroes[i].getDemage());
            heroes[i].havingSuperAbility(heroes[i].getTypeAbility());
            System.out.println("____________________________________");
        }
    }

}
