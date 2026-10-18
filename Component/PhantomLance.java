package kz.assignment.Component;

public class PhantomLance implements Hero {
    private int damage = 57;
    private int armor = 4;
    private int speed = 285;

    @Override
    public String getName(){
        return "PhantomLance";
    }

    @Override
    public int getDamage(){
        return damage;
    }

    @Override
    public int getArmor() {
        return armor;
    }

    @Override
    public int getSpeed(){
        return speed;
    }

    @Override
    public void addDamage(int amount){
        damage += amount;
    }

    @Override
    public void addArmor(int amount){
        armor += amount;
    }

    @Override
    public void addSpeed(int amount){
        speed += amount;
    }
}
