package com.company.abstractfactory;

import com.company.Troop;
import com.company.troops.*;

public class SuperBarracks extends AbstractBarracks {
    @Override
    public Troop getTroop(String troopType) {
        if (troopType.equalsIgnoreCase("Super Barbarian"))
            return new SuperBarbarian();
        else if (troopType.equalsIgnoreCase("Super Archer"))
            return new SuperArcher();
        else if (troopType.equalsIgnoreCase("Rocket Balloon"))
            return new RocketBalloon();
        else if (troopType.equalsIgnoreCase("Super Minion"))
            return new SuperMinion();
        return null;
    }
}
