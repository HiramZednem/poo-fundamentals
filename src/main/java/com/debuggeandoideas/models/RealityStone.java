package com.debuggeandoideas.models;

public class RealityStone extends Stone{
    private static final String COLOR = "Red";
    private static final String NAME = "Reality Stone";
    private static final String LOCATION = "Unknown";
    private static final int ENERGY_LEVEL = 9;

    public RealityStone() {
        super(COLOR, NAME, LOCATION, ENERGY_LEVEL);
    }

    @Override
    public void usePower() {

    }
}
