package hu.nive.ujratervezes.kepesitovizsga.army;

public class HeavyCavalry extends MilitaryUnit{
    private int health = 150;
    private int dmg = 20;
    private int attackCounter = 0;

    @Override
    public int doDamage() {
        if(attackCounter < 1) {
            attackCounter++;
            return dmg*3;
        } else {
            return dmg;
        }

    }

    @Override
    public void sufferDamage(int i) {
        health -= i/2;
    }

    @Override
    public int getHitPoints() {
        return health;
    }

}
