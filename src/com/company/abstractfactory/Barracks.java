package com.company.abstractfactory;

import com.company.Troop;
import com.company.troops.Archer;
import com.company.troops.Balloon;
import com.company.troops.Barbarian;
import com.company.troops.Minion;

public class Barracks extends AbstractBarracks {
    @Override
    public Troop getTroop(String troopType) {
        if (troopType.equalsIgnoreCase("Barbarian"))
            return new Barbarian();
        else if (troopType.equalsIgnoreCase("Archer"))
            return new Archer();
        else if (troopType.equalsIgnoreCase("Balloon"))
            return new Balloon();
        else if (troopType.equalsIgnoreCase("Minion"))
            return new Minion();
        return null;
    }
}
