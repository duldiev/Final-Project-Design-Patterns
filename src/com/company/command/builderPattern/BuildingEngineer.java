package com.company.command.builderPattern;

public class BuildingEngineer {
    private ConstructionBuilder constructionBuilder;
    public BuildingEngineer(ConstructionBuilder constructionBuilder) {
        this.constructionBuilder = constructionBuilder;
    }

    public Building getBuilding() {
        return this.constructionBuilder.getBuilding();
    }
    
    public void makeBuilding() {
        this.constructionBuilder.buildElixirCollector();
        this.constructionBuilder.buildDarkElixirCollector();
        this.constructionBuilder.buildGoldCollector();
        this.constructionBuilder.buildElixirStorage();
        this.constructionBuilder.buildDarkElixirStorage();
        this.constructionBuilder.buildGoldStorage();
    }
}
