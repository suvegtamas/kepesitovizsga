package hu.nive.ujratervezes.kepesitovizsga.army;

public abstract class MilitaryUnit {
    private int health;
    private int dmg;
    private boolean armour;

    public abstract int doDamage();

    public abstract void sufferDamage(int i);

    public abstract int getHitPoints();
}
