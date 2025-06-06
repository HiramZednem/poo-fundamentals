package com.debuggeandoideas.models;

public class MindStone extends Stone{
    private static final String COLOR = "Yellow";
    private static final String NAME = "Mind Stone";
    private static final String LOCATION = "Loki's Scepter";
    private static final int ENERGY_LEVEL = 9;

    public MindStone() {
        super(COLOR, NAME, LOCATION, ENERGY_LEVEL);
    }

    @Override
    public void usePower() {


    }
}