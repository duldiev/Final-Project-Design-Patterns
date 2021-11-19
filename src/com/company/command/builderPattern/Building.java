package com.company.command.builderPattern;

public class Building implements BuildingPlan {
    private String canCollectElixir;
    private String canCollectDarkElixir;
    private String canCollectGold;
    private String canStoreGold;
    private String canStoreElixir;
    private String canStoreDarkElixir;

    public void setCanCollectElixir(String elixir) {
        canCollectElixir = elixir;
    }

    public String getCanCollectElixir() {
        return canCollectElixir;
    }

    public void setCanCollectDarkElixir(String darkElixir) {
        canCollectDarkElixir = darkElixir;
    }

    public String getCanCollectDarkElixir() {
        return canCollectDarkElixir;
    }

    public void setCanCollectGold(String gold) {
        canCollectGold = gold;
    }

    public String getCanCollectGold() {
        return canCollectGold;
    }

    public void setCanStoreGold(String gold){
        canStoreGold = gold;
    }

    public String getCanStoreGold(){
        return canStoreGold;
    }

    public void setCanStoreElixir(String elixir){
        canStoreElixir = elixir;
    }

    public String getCanStoreElixir(){
        return canStoreElixir;
    }

    public String getCanStoreDarkElixir(){
        return canStoreDarkElixir;
    }

    public void setCanStoreDarkElixir(String darkElixir){
        canStoreDarkElixir = darkElixir;
    }
}

