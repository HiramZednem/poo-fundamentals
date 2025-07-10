package com.debuggeandoideas;

import com.debuggeandoideas.factories.RealityStoneFactory;
import com.debuggeandoideas.models.RealityStone;
import com.debuggeandoideas.models.Stone;
import com.debuggeandoideas.services.GauntletService;
import com.debuggeandoideas.services.GauntletServiceImpl;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        GauntletServiceImpl gauntletService = new GauntletServiceImpl();

        System.setProperty("scope", "singleton");
        Stone realityStone = new RealityStoneFactory().createStone();
        gauntletService.setRealityStone((RealityStone) realityStone);
        gauntletService.useGauntlet("reality");

    }
}