package com.company.command.builderPattern;

public interface BuildingPlan {
    public void setCanCollectElixir(String elixir);
    public void setCanCollectDarkElixir(String darkElixir);
    public void setCanCollectGold(String gold);
    public void setCanStoreElixir(String elixir);
    public void setCanStoreDarkElixir(String darkElixir);
    public void setCanStoreGold(String gold);
}
