package Fight;

import Droid.Droid;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Battle {
    private List<Droid> Radiant = new ArrayList();
    private List<Droid> Dire = new ArrayList();

    private List<Droid> attackTeam;
    private List<Droid> defenceTeam;

    public Battle(List<Droid> listOfDroids, List<Droid> droidList){
        Radiant = listOfDroids;
        Dire = droidList;
    }

    public void teamBattle() {
        int round = 1;
        selectAttackTeam();
        do{
            System.out.println("\nRound " + round++);
            for (Droid attacker: attackTeam){
                if (!checkAliveTeam(defenceTeam))
                    break;
                if (attacker.isCanHeal()){
                    if (new Random().nextInt(101)>50)
                        attacker.heal(chooseTargetInTeam(attackTeam));
                    else
                        attacker.hit(chooseTargetInTeam(defenceTeam));
                }
                else
                    attacker.hit(chooseTargetInTeam(defenceTeam));
            }
            removeDeadFighter();
            changeAttackTeam();

            System.out.println(attackTeam.toString());
            System.out.println(defenceTeam.toString());

        }while (checkAliveTeam(defenceTeam));
        System.out.println("\n\n"+attackTeam.toString() + " won");
    }

    private Droid chooseTargetInTeam(List<Droid> team){
        return team.get(new Random().nextInt(team.size()));
    }


    private void removeDeadFighter() {
        defenceTeam.removeIf(dr -> !dr.isAlive());
    }

    private boolean checkAliveTeam(List<Droid> team) {
        for (Droid dr: team){
            if(dr.isAlive())
                return true;
        }
        return false;
    }

    private void selectAttackTeam() {
        if (new Random().nextBoolean()){
            attackTeam = Radiant;
            defenceTeam = Dire;
        } else {
            defenceTeam = Radiant;
            attackTeam = Dire;
        }
    }

    private void changeAttackTeam() {
        if(attackTeam == Radiant){
            defenceTeam = Radiant;
            attackTeam = Dire;
        }
        else{
            attackTeam = Radiant;
            defenceTeam = Dire;
        }
    }
}

