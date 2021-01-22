package Droid;

import java.util.Random;


public class Warrior extends Droid {
    private int blockChance;

    public Warrior(String name, int health, int damage, int blockChance){
        this.name = name;
        this.health = health;
        this.damage = damage;
        this.blockChance = blockChance;
        isHealer = false;
    }

    private boolean block(){
        return new Random().nextInt(101) < blockChance;
    }

    @Override
    public void hit(Droid defencedDroid) {
        if (block())
            System.out.println("Hit was blocked by " +defencedDroid.name);
        else {
            defencedDroid.health -= this.damage;
            System.out.println(this.name + " was damaged by " + defencedDroid.name);
        }
    }
}
