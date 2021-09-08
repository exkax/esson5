package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        creatHeroes();
        for (int i = 0; i < creatHeroes().length; i++) {
            System.out.println(creatHeroes()[i].getDamage() + " " + creatHeroes()[i].getHealth() + " " + creatHeroes()[i].getSuperpower());
        }
        Boss boss = new Boss();
        boss.setDamage(50);
        boss.setHealth(200);
        boss.setTypeOfProtection("электронная защита");
        System.out.println(boss.getDamage() + " " + boss.getHealth() + " "+ boss.getTypeOfProtection());

    }
    public static Hero[]creatHeroes(){
        Hero Tony = new Hero(50,300,"repair");
        Hero Thor = new Hero(40, 250);
        Hero Superman = new Hero(60, 350, "fly");
                Hero[] array = {Tony, Thor, Superman};
        return array;

    }
}
