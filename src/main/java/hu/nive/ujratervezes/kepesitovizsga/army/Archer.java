package hu.nive.ujratervezes.kepesitovizsga.army;

public class Archer extends MilitaryUnit {
    private int health = 50;
    private int dmg = 20;


    public int doDamage() {
        return dmg;
    }

    @Override
    public void sufferDamage(int i) {
        health -= i;
    }

    @Override
    public int getHitPoints() {
        return health;
    }
}
