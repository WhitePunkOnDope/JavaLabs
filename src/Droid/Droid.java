package Droid;

public class Droid {
    protected String name;
    protected int health;
    protected int damage;
    protected int accuracy;
    protected boolean isHealer;


    Droid() { }

    public boolean isAlive() {
        return health > 0;
    }

    public void hit(Droid defencedDroid){}

    public boolean isCanHeal(){
        return isHealer;
    }

    public void heal(Droid droider){}

    @Override
    public String toString() {
        return "Droid '"
                + name + '\'' +
                ", health=" + health +
                ", damage=" + damage;
    }
}
