package kz.assignment.Subsystem;

import kz.assignment.Component.Hero;

public class UpgradeManager {

    private static final int UPGRADE_COST = 100;

    public int getUpgradeCost(String type) {
        validateUpgrade(type);
        return UPGRADE_COST;
    }

    public void applyUpgrade(Hero hero, String type) {

        validateUpgrade(type);

        if (hero == null) {
            throw new IllegalArgumentException("Hero cannot be null");
        }

        switch (type.toLowerCase()) {

            case "damage":
                hero.addDamage(20);
                break;

            case "armor":
                hero.addArmor(5);
                break;

            case "speed":
                hero.addSpeed(25);
                break;
        }
    }

    private void validateUpgrade(String type) {

        if (type == null) {
            throw new IllegalArgumentException("Upgrade type cannot be null");
        }

        switch (type.toLowerCase()) {

            case "damage":
            case "armor":
            case "speed":
                return;

            default:
                throw new IllegalArgumentException("Unknown upgrade: " + type);
        }
    }
}