package com.company;

import com.company.abstractfactory.*;
import com.company.command.Builder;
import com.company.state.*;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

        HomeVillage village = new HomeVillage();

        while (true) {
            menu(0);
            System.out.print("Choose: ");
            int choice = in.nextInt();
            if (choice == 8) break;
            menu(choice);
            switch (choice) {
                case 1 -> {
                    System.out.println(village.getArmySize() + "\n");
                }
                case 2 -> {
                    System.out.print("Choose: ");
                    int choice2 = in.nextInt();

                    AbstractBarracks barracksFactory;
                    if (choice2 >= 1 && choice2 <= 4)
                        barracksFactory = BarracksProducer.getBarracks(false);
                    else
                        barracksFactory = BarracksProducer.getBarracks(true);

                    Troop troop = switch (choice2) {
                        case 1 -> barracksFactory.getTroop("Archer");
                        case 2 -> barracksFactory.getTroop("Barbarian");
                        case 3 -> barracksFactory.getTroop("Balloon");
                        case 4 -> barracksFactory.getTroop("Minion");
                        case 5 -> barracksFactory.getTroop("Rocket Balloon");
                        case 6 -> barracksFactory.getTroop("Super Archer");
                        case 7 -> barracksFactory.getTroop("Super Barbarian");
                        case 8 -> barracksFactory.getTroop("Super Minion");
                        default -> null;
                    };

                    System.out.println(troop.getName() + " trained!");
                    village.addTroop(troop);
                }
                case 3 -> {
                    System.out.print("Choose: ");
                    int choice3 = in.nextInt();

                    Builder builder = new Builder();
                    switch (choice3) {
                        case 1 -> builder.addRequests("Gold Storage");
                        case 2 -> builder.addRequests("Gold Collector");
                        case 3 -> builder.addRequests("Elixir Storage");
                        case 4 -> builder.addRequests("Elixir Collector");
                        case 5 -> builder.addRequests("Dark Elixir Storage");
                        case 6 -> builder.addRequests("Dark Elixir Collector");
                    }

                    builder.workOffRequests();

                    if (choice3 == 1)
                        village.setGoldStorageLimit(village.getGoldStorageLimit() + 10000);
                }
                case 4 -> {
                    if (village.getArmySize() > 0) {
                        StartState startState = new StartState();
                        startState.attack(village);

                        StopState stopState = new StopState();
                        stopState.attack(village);
                    } else {
                        System.out.println("No army trained yet!");
                    }
                }
                case 5 -> System.out.println("Current storage: " + village.getGoldStorageCurrent() + "\n" +
                        "Maximum storage: " + village.getGoldStorageLimit() + "\n");
                case 6 -> village.showAllTroops();
                case 7 -> {
                    village.listTroops();
                    System.out.print("Choose: ");
                    int choice3 = in.nextInt();
                    village.upgradeTroop(choice3);
                    System.out.println("Troop upgraded!");
                }
            }
        }
    }

    public static void menu(int option) {
        switch (option) {
            case 0 -> System.out.println(
                    """
                    Menu:
                    1. Camp
                    2. Create army
                    3. Build
                    4. Attack
                    5. Storage
                    6. My Troops
                    7. Upgrade Troops
                    8. Exit
                    """);
            case 1 -> System.out.println("Number of trained troops: ");
            case 2 -> System.out.println(
                    """
                    Troops:
                    1. Archer
                    2. Barbarian
                    3. Balloon
                    4. Minion
                    5. Rocket Balloon
                    6. Super Archer
                    7. Super Barbarian
                    8. Super Minion
                    """);
            case 3 -> System.out.println(
                    """
                    1. Gold Storage
                    2. Gold Collector
                    3. Elixir Storage
                    4. Elixir Collector
                    5. Dark Elixir Storage
                    6. Dark Elixir Collector
                    """);
        }
    }
}
