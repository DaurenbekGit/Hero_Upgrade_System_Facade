package kz.assignment.Facade;

import kz.assignment.Component.Hero;
import kz.assignment.Subsystem.HeroManager;
import kz.assignment.Subsystem.UpgradeManager;
import kz.assignment.Subsystem.ResourceManager;
import kz.assignment.Subsystem.HeroStatsManager;

public class HeroUpgradeFacade {

    private final HeroManager heroManager;
    private final UpgradeManager upgradeManager;
    private final ResourceManager resourceManager;
    private final HeroStatsManager statsManager;

    private Hero selectedHero;

    public HeroUpgradeFacade() {
        heroManager = new HeroManager();
        upgradeManager = new UpgradeManager();
        resourceManager = new ResourceManager();
        statsManager = new HeroStatsManager();
    }

    public void selectHero(String name) {
        selectedHero = heroManager.createHero(name);

        System.out.println(
                "Selected hero: " + selectedHero.getName()
        );
    }

    public void upgradeHero(String type) {
        checkHeroSelected();

        int cost = upgradeManager.getUpgradeCost(type);

        if (!resourceManager.hasEnoughGold(cost)) {
            System.out.println("Not enough gold!");
            return;
        }

        upgradeManager.applyUpgrade(selectedHero, type);
        resourceManager.spendGold(cost);

        System.out.println(type.toUpperCase() + " upgrade successful!");

        statsManager.showStats(selectedHero);
        System.out.println("Remaining gold: " + resourceManager.getGold());
    }

    public void showHeroStats() {
        checkHeroSelected();
        statsManager.showStats(selectedHero);
    }

    public void showGold() {
        System.out.println("Current gold: " + resourceManager.getGold());
    }

    public void earnGold(int amount) {
        resourceManager.addGold(amount);
        System.out.println("Earned " + amount + " gold!");
    }

    private void checkHeroSelected() {
        if (selectedHero == null) {
            throw new IllegalStateException(
                    "Please select a hero first!"
            );
        }
    }
}
