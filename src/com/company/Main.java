package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Boss boss = new Boss();
        boss.setDamage(50);
        boss.setHealth(200);
        boss.setTypeOfProtection("электронная защита");
        System.out.println(boss.getDamage() + " " + boss.getHealth() + " "+ boss.getTypeOfProtection());
    }
}
