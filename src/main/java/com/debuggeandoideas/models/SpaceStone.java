package com.debuggeandoideas.models;

public class SpaceStone extends Stone{

    private static final String COLOR = "Blue";
    private static final String NAME = "Space Stone";
    private static final String LOCATION = "Tesserac";
    private static final int ENERGY_LEVEL = 7;

    public SpaceStone(String color, String name, String location, Integer energyLevel, Integer numberOfSides) {
        super(COLOR, NAME, LOCATION, ENERGY_LEVEL);
    }

    @Override
    public void usePower() {
        System.out.println("Manipulate all space " + super.toString());
    }
}
