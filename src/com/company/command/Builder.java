package com.company.command;

import java.util.ArrayList;
import java.util.List;

public class Builder {
    private List<Command> queue = new ArrayList<>();

    public void workOffRequests () {
        for (Object command : queue) {
            ((Command) command).build();
        }
        queue.clear();
    }

    Buildings buildings = new Buildings();
    BuildingWith buildingWith = new BuildingWith(
            new GoldCollector(buildings),
            new GoldStorage(buildings),
            new ElixirCollector(buildings),
            new ElixirStorage(buildings),
            new DarkElixirCollector(buildings),
            new DarkElixirStorage(buildings));

    public void addRequests(String building) {
        if (building.equals("Gold Storage")) {
            buildingWith.buildingWithGS();
        } else if (building.equals("Elixir Storage")) {
            buildingWith.buildingWithES();
        } else if (building.equals("Dark Elixir Storage")) {
            buildingWith.buildingWithDES();
        } else if (building.equals("Gold Collector")) {
            buildingWith.buildingWithGC();
        } else if (building.equals("Elixir Collector")) {
            buildingWith.buildingWithEC();
        } else if (building.equals("Dark Elixir Collector")) {
            buildingWith.buildingWithDEC();
        }
    }
}
