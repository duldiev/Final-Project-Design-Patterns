package com.company.command.builderPattern;

public class TypesOfBuilding implements ConstructionBuilder {
    private final Building building;

    public TypesOfBuilding() {
        this.building = new Building();
    }
    @Override
    public void buildElixirCollector() {
        building.setCanCollectElixir("Building with Elixir Collector");
    }

    @Override
    public void buildDarkElixirCollector() {
        building.setCanCollectDarkElixir("Building with Dark Elixir Collector");
    }

    @Override
    public void buildGoldCollector() {
        building.setCanCollectGold("Building with Gold Collector");
    }

    @Override
    public void buildElixirStorage() {
        building.setCanStoreElixir("Building has Elixir Storage");
    }

    @Override
    public void buildDarkElixirStorage() {
        building.setCanStoreDarkElixir("Building has Dark Elixir Storage");
    }

    @Override
    public void buildGoldStorage() {
        building.setCanStoreGold("Building has Gold Storage");
    }

    @Override
    public Building getBuilding() {
        return this.building;
    }
}
