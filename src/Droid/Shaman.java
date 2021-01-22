/** During combat, shaman place damaging and controlling totems on the ground to maximize their effectiveness
 * while hindering their enemies. Shaman are versatile enough to battle foes up close or at range, but wise
 * shaman choose their avenue of attack based on their enemies’ strengths and weaknesses.
 * So the main purpose of the shaman is to help allies and weaken the enemy
 */

package Droid;

import java.util.Random;

public class Shaman extends Droid {
    private int amountOfHealedHealth;

    public Shaman(String name, int health, int damage, int amountOfHealedHealth) {
        this.name = name;
        this.health = health;
        this.damage = damage;
        isHealer = true;
        this.amountOfHealedHealth = amountOfHealedHealth;
    }


    @Override
    public void heal(Droid dr){
        dr.health += this.amountOfHealedHealth;
        System.out.println("Shaman healed " + dr.name + "!");
    }



    @Override
    public void hit(Droid defencedDroid) {
        defencedDroid.health -=this.damage;
        System.out.println(defencedDroid.name + " was damaged!");
    }

}
