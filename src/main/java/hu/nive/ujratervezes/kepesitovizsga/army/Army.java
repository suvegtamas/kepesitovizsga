package hu.nive.ujratervezes.kepesitovizsga.army;

import java.util.ArrayList;
import java.util.List;

public class Army {
    private List<MilitaryUnit> army = new ArrayList<>();


    public int getArmySize() {
        return army.size();
    }

    public void addUnit(MilitaryUnit militaryUnit) {
        army.add(militaryUnit);
    }

    public int getArmyDamage() {
        int sum = 0;
        for(MilitaryUnit mu : army) {
            sum += mu.doDamage();
        }
        return sum;
    }

    public void damageAll(int i) {
        List<MilitaryUnit> weak = new ArrayList<>();
        for(MilitaryUnit mu : army) {
            mu.sufferDamage(i);
            if(mu.getHitPoints() < 25) {
                weak.add(mu);
            }
        }
        army.removeAll(weak);
    }
}
