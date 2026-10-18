# Dota 2 Hero Upgrade System

## 1. Project Overview

This project demonstrates the **Facade Design Pattern** using a Dota 2-inspired hero upgrade system.

The application allows players to select a hero, upgrade their attributes, manage gold, and view updated hero statistics.

The main purpose is to simplify communication between multiple subsystem classes through a single Facade interface.

**Design Pattern:** Facade (Structural)

**Programming Language:** Java

**Course:** Software Design Patterns

**Assignment:** 4

## 2. Available Heroes

The system includes three playable heroes:

| Hero | Damage | Armor | Speed |
|---|---:|---:|---:|
| Phantom Lancer | 57 | 4 | 285 |
| Techies | 48 | 5 | 310 |
| Tinker | 55 | 5 | 305 |

These are simplified starting statistics inspired by Dota 2.

## 3. Hero Upgrades

Players can purchase three types of upgrades:

| Upgrade | Effect | Cost |
|---|---|---|
| DAMAGE | +20 Damage | 100 Gold |
| ARMOR | +5 Armor | 100 Gold |
| SPEED | +25 Speed | 100 Gold |

Each player starts with **250 Gold**.

If the player does not have enough gold, the upgrade is rejected.

## 4. Project Structure

```text
src/main/java/kz/assignment/
│
├── Component/
│   ├── Hero.java
│   ├── PhantomLance.java
│   ├── Techies.java
│   └── Tinker.java
│
├── Subsystem/
│   ├── HeroManager.java
│   ├── UpgradeManager.java
│   ├── ResourceManager.java
│   └── HeroStatsManager.java
│
├── Facade/
│   └── HeroUpgradeFacade.java
│
└── Main.java
```

## 5. Facade Pattern Implementation

The application contains four subsystem classes.

**HeroManager**

Creates the selected hero based on the provided name.

**UpgradeManager**

Validates and applies hero upgrades.

**ResourceManager**

Manages player gold, checks available resources, and processes payments.

**HeroStatsManager**

Retrieves and displays hero statistics.

**HeroUpgradeFacade**

Provides a simplified interface to the subsystems. It coordinates hero selection, upgrade validation, resource checking, attribute modification, and statistics display.

The client communicates only with the Facade.

### Example Usage

```java
HeroUpgradeFacade facade = new HeroUpgradeFacade();

facade.selectHero("Tinker");
facade.showHeroStats();
facade.upgradeHero("DAMAGE");
facade.showGold();
```

Instead of interacting with four different managers, the client uses one Facade object.

## 6. How to Run

1. Open the project in IntelliJ IDEA.
2. Configure Java JDK 17 or later.
3. Open `Main.java`.
4. Click **Run 'Main.main()'**.
5. View the output in the Run console.

## 7. Example Console Output

The following is the expected output when running the provided `Main.java` example with Tinker.

```text
=== DOTA 2 HERO UPGRADE SYSTEM ===
Selected hero: Tinker

=== INITIAL STATS ===
Hero: Tinker
Damage: 55
Armor: 5
Speed: 305
Current gold: 250

=== DAMAGE UPGRADE ===
DAMAGE upgrade successful!
Hero: Tinker
Damage: 75
Armor: 5
Speed: 305
Remaining gold: 150

=== ARMOR UPGRADE ===
ARMOR upgrade successful!
Hero: Tinker
Damage: 75
Armor: 10
Speed: 305
Remaining gold: 50

=== SPEED UPGRADE ===
Not enough gold!

=== EARN GOLD ===
Earned 100 gold!

=== SPEED UPGRADE RETRY ===
SPEED upgrade successful!
Hero: Tinker
Damage: 75
Armor: 10
Speed: 330
Remaining gold: 50

=== FINAL STATS ===
Hero: Tinker
Damage: 75
Armor: 10
Speed: 330
Current gold: 50
```

## 8. Clean Code Principles

**1. Single Responsibility Principle**

Each subsystem class has one main responsibility.

**2. Meaningful Names**

Methods such as `createHero()`, `upgradeHero()`, and `hasEnoughGold()` clearly describe their behavior.

**3. Encapsulation**

Hero attributes and resource values are declared private.

**4. Small and Focused Methods**

Methods perform specific tasks, making the code easier to read and maintain.

**5. Error Handling**

The program handles invalid hero names, unsupported upgrades, insufficient gold, and missing hero selection.

## 9. Conclusion

The project demonstrates how the Facade Pattern simplifies interaction with a complex subsystem.

The `HeroUpgradeFacade` class provides a single entry point for the client, while the subsystem classes remain independent and responsible for their own functionality.

This approach improves readability, maintainability, and separation of responsibilities.
