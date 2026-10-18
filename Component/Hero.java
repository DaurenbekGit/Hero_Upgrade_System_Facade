package kz.assignment.Component;

public interface Hero {
    String getName();

    int getDamage();
    int getArmor();
    int getSpeed();

    void addDamage(int amount);
    void addArmor(int amount);
    void addSpeed(int amount);
}