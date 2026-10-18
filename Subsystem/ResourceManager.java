package kz.assignment.Subsystem;

public class ResourceManager {

    private int gold = 250;

    public int getGold() {
        return gold;
    }

    public boolean hasEnoughGold(int amount) {
        return amount >= 0 && gold >= amount;
    }

    public void spendGold(int amount) {

        if (amount < 0) {
            throw new IllegalArgumentException(
                    "Amount cannot be negative"
            );
        }

        if (!hasEnoughGold(amount)) {
            throw new IllegalStateException(
                    "Not enough gold!"
            );
        }

        gold -= amount;
    }

    public void addGold(int amount) {

        if (amount <= 0) {
            throw new IllegalArgumentException(
                    "Amount must be positive"
            );
        }

        gold = Math.addExact(gold, amount);
    }
}
