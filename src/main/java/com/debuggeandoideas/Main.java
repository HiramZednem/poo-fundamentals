package com.debuggeandoideas;

import com.debuggeandoideas.factories.MindStoneFactory;
import com.debuggeandoideas.factories.PowerStoneFactory;
import com.debuggeandoideas.factories.RealityStoneFactory;
import com.debuggeandoideas.factories.SoulStoneFactory;
import com.debuggeandoideas.factories.SpaceStoneFactory;
import com.debuggeandoideas.factories.TimeStoneFactory;
import com.debuggeandoideas.models.RealityStone;
import com.debuggeandoideas.models.Stone;
import com.debuggeandoideas.services.GauntletServiceImpl;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.setProperty("scope", "singleton");

        var mindFactory = new MindStoneFactory();
        var powerFactory = new PowerStoneFactory();
        var realityFactory = new RealityStoneFactory();
        var soulFactory = new SoulStoneFactory();
        var spaceFactory = new SpaceStoneFactory();
        var timeFactory = new TimeStoneFactory();

        GauntletServiceImpl gauntletService = new GauntletServiceImpl(
                mindFactory.createStone(),
                powerFactory.createStone(),
                realityFactory.createStone(),
                soulFactory.createStone(),
                spaceFactory.createStone(),
                timeFactory.createStone()
        );

//        gauntletService.useGauntlet("reality");
        gauntletService.useFullPower();
    }
}