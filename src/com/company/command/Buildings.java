package com.company.command;

import com.company.command.builderPattern.Building;
import com.company.command.builderPattern.BuildingEngineer;
import com.company.command.builderPattern.ConstructionBuilder;
import com.company.command.builderPattern.TypesOfBuilding;

public class Buildings{

    public void buildingWithGC() {
        ConstructionBuilder building = new TypesOfBuilding();
        BuildingEngineer buildingEngineer = new BuildingEngineer(building);
        buildingEngineer.makeBuilding();
        Building firstBuilding = buildingEngineer.getBuilding();
        System.out.println("Building created: " + firstBuilding.getCanCollectGold());
    }

    public void buildingWithGS(){
        ConstructionBuilder building = new TypesOfBuilding();
        BuildingEngineer buildingEngineer = new BuildingEngineer(building);
        buildingEngineer.makeBuilding();
        Building firstBuilding = buildingEngineer.getBuilding();
        System.out.println("Building created: " + firstBuilding.getCanStoreGold());
    }

    public void buildingWithEC(){
        ConstructionBuilder building = new TypesOfBuilding();
        BuildingEngineer buildingEngineer = new BuildingEngineer(building);
        buildingEngineer.makeBuilding();
        Building firstBuilding = buildingEngineer.getBuilding();
        System.out.println("Building created: " + firstBuilding.getCanCollectElixir());
    }

    public void buildingWithES(){
        ConstructionBuilder building = new TypesOfBuilding();
        BuildingEngineer buildingEngineer = new BuildingEngineer(building);
        buildingEngineer.makeBuilding();
        Building firstBuilding = buildingEngineer.getBuilding();
        System.out.println("Building created: " + firstBuilding.getCanStoreElixir());
    }

    public void buildingWithDEC(){
        ConstructionBuilder building = new TypesOfBuilding();
        BuildingEngineer buildingEngineer = new BuildingEngineer(building);
        buildingEngineer.makeBuilding();
        Building firstBuilding = buildingEngineer.getBuilding();
        System.out.println("Building created: " + firstBuilding.getCanCollectDarkElixir());
    }

    public void buildingWithDES(){
        ConstructionBuilder building = new TypesOfBuilding();
        BuildingEngineer buildingEngineer = new BuildingEngineer(building);
        buildingEngineer.makeBuilding();
        Building firstBuilding = buildingEngineer.getBuilding();
        System.out.println("Building created: " + firstBuilding.getCanStoreDarkElixir());
    }
}
