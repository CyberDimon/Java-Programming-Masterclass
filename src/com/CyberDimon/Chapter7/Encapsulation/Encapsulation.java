package com.CyberDimon.Chapter7.Encapsulation;

public class Encapsulation {
    public static void main(String[] args) {
//        Player player = new Player();
//        player.name = "Dima";
//        player.health = 20;
//        player.weapon = "Sword";
//
//        int damage = 20;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
//
//        damage = 11;
//        player.health = 200;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());

        EnchancedPlayer player = new EnchancedPlayer("Dima", 200, "Sword");
        System.out.println("Initial health is: " + player.getHealth());

    }
}
