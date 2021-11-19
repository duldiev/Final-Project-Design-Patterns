package com.company.command;

public class BuildingWith {
    Command goldCollector;
    Command goldStorage;
    Command elixirCollector;
    Command elixirStorage;
    Command darkElixirCollector;
    Command darkElixirStorage;

    public BuildingWith(Command goldCollector,
                        Command goldStorage,
                        Command elixirCollector,
                        Command elixirStorage,
                        Command darkElixirCollector,
                        Command darkElixirStorage){
        this.goldCollector = goldCollector;
        this.goldStorage = goldStorage;
        this.elixirCollector = elixirCollector;
        this.elixirStorage = elixirStorage;
        this.darkElixirCollector = darkElixirCollector;
        this.darkElixirStorage = darkElixirStorage;
    }

    public void buildingWithGC(){
        goldCollector.build();
    }
    public void buildingWithGS(){
        goldStorage.build();
    }
    public void buildingWithEC(){
        elixirCollector.build();
    }
    public void buildingWithES(){
        elixirStorage.build();
    }
    public void buildingWithDEC(){
        darkElixirCollector.build();
    }
    public void buildingWithDES(){
        darkElixirStorage.build();
    }
}
