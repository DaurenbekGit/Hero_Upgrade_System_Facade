package kz.assignment.Component;

public class Techies implements Hero {
    private int damage = 48;
    private int armor = 5;
    private int speed = 310;

    @Override
    public String getName(){
        return "Techies";
    }

    @Override
    public int getDamage(){
        return damage;
    }

    @Override
    public int getArmor(){
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