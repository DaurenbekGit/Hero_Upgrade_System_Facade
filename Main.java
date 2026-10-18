
package kz.assignment;

import kz.assignment.Facade.HeroUpgradeFacade;

public class Main {

    public static void main(String[] args) {

        HeroUpgradeFacade facade = new HeroUpgradeFacade();

        System.out.println("=== DOTA 2 HERO UPGRADE SYSTEM ===");

        facade.selectHero("Tinker");

        System.out.println("\n=== INITIAL STATS ===");
        facade.showHeroStats();
        facade.showGold();

        System.out.println("\n=== DAMAGE UPGRADE ===");
        facade.upgradeHero("DAMAGE");

        System.out.println("\n=== ARMOR UPGRADE ===");
        facade.upgradeHero("ARMOR");

        System.out.println("\n=== SPEED UPGRADE ===");
        facade.upgradeHero("SPEED");

        System.out.println("\n=== EARN GOLD ===");
        facade.earnGold(100);

        System.out.println("\n=== SPEED UPGRADE RETRY ===");
        facade.upgradeHero("SPEED");

        System.out.println("\n=== FINAL STATS ===");
        facade.showHeroStats();
        facade.showGold();
    }
}
