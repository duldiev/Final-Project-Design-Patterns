package com.company.state;
import com.company.Troop;
import com.company.decorator.SecondLevelDecorator;
import com.company.decorator.ThirdLevelDecorator;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HomeVillage {
    private State state;

    Set<Troop> armySet = new HashSet<>();
    List<Troop> army = new ArrayList<>();

    private int goldStorageLimit = 0;
    private int goldStorageCurrent = 0;

    public HomeVillage() {
        state = null;
    }

    public int getArmySize() {
        return army.size();
    }

    public void addTroop(Troop troop) {
        this.army.add(troop);
        this.armySet.add(troop);
    }

    public void upgradeTroop(int x) {
        int i = 1;
        for (Troop troop : armySet) {
            if (x == i)
                levelUpTroop(troop.getName());
            i++;
        }
    }

    private void levelUpTroop(String troop) {
        int length = getArmySize();
        for (int i = 0; i < length; i++) {
            if (army.get(i).getName().equals(troop)) {
                Troop upgradedTroop = null;
                if (army.get(i).currentLevel() == 1)
                    upgradedTroop = new SecondLevelDecorator(army.get(i));
                else if (army.get(i).currentLevel() == 2)
                    upgradedTroop = new ThirdLevelDecorator(army.get(i));

                if (army.get(i).currentLevel() < 3) {
                    army.remove(i);
                    army.add(i, upgradedTroop);
                }
            }
        }
    }

    public void showAllTroops() throws IOException {
        if (this.getArmySize() == 0) {
            System.out.println("You don't have any troops trained!");
            return;
        }
        this.showTroop("Archer");
        this.showTroop("Barbarian");
        this.showTroop("Minion");
        this.showTroop("Balloon");
        this.showTroop("RocketBalloon");
        this.showTroop("SuperArcher");
        this.showTroop("SuperBarbarian");
        this.showTroop("SuperMinion");
    }

    public void listTroops() {
        int i = 1;
        for (Troop troop : armySet) {
            System.out.println(i + ". " + troop.getName());
            i++;
        }
    }

    public void showTroop(String troop) throws IOException {
        int length = this.getArmySize();
        for (int i = 0; i < length; i++) {
            if (army.get(i).getName().equals(troop)) {
                army.get(i).showProperties();
                break;
            }
        }
    }

    public int getGoldStorageLimit() {
        return goldStorageLimit;
    }

    public void setGoldStorageLimit(int goldStorageLimit) {
        this.goldStorageLimit = goldStorageLimit;
    }

    public int getGoldStorageCurrent() {
        return goldStorageCurrent;
    }

    public void setGoldStorageCurrent(int goldStorageCurrent) {
        this.goldStorageCurrent = goldStorageCurrent;
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }
}
