package hu.nive.ujratervezes.kepesitovizsga.army;

public class Swordsman extends MilitaryUnit{
    private int health = 100;
    private int dmg = 10;
    private boolean armour;
    private int shield = 1;

    public Swordsman(boolean armour) {
        this.armour = armour;
    }

    @Override
    public int doDamage() {
        return dmg;
    }

    @Override
    public void sufferDamage(int i) {
       if(armour == true && shield < 1) {
           health -= i/2;
       } else if(armour == false && shield < 1) {
           health -= i;
       }
      shield--;
    }

    @Override
    public int getHitPoints() {
        return health;
    }
}
