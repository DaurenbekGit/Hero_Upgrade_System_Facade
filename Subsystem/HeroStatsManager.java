package kz.assignment.Subsystem;

import kz.assignment.Component.Hero;

public class HeroStatsManager {

    public String getStats(Hero hero) {

        if (hero == null) {
            throw new IllegalArgumentException(
                    "Hero cannot be null"
            );
        }

        return "Hero: " + hero.getName()
                + "\nDamage: " + hero.getDamage()
                + "\nArmor: " + hero.getArmor()
                + "\nSpeed: " + hero.getSpeed();
    }

    public void showStats(Hero hero) {
        System.out.println(getStats(hero));
    }
}
