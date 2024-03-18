package com.javarush.vinogradow.island_creatures;

public class Creature {
    private final String creatureName;
    private final double creatureWeight;
    private final int maxCellPopulation;

    public Creature(String name, double creatureWeight, int maxCellPopulation){
        this.creatureName = name;
        this.creatureWeight = creatureWeight;
        this.maxCellPopulation = maxCellPopulation;
    }
}
