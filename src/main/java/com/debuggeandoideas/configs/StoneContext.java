package com.debuggeandoideas.configs;

import com.debuggeandoideas.factories.MindStoneFactory;
import com.debuggeandoideas.factories.PowerStoneFactory;
import com.debuggeandoideas.factories.RealityStoneFactory;
import com.debuggeandoideas.factories.SoulStoneFactory;
import com.debuggeandoideas.factories.SpaceStoneFactory;
import com.debuggeandoideas.factories.TimeStoneFactory;
import com.debuggeandoideas.models.MindStone;
import com.debuggeandoideas.models.PowerStone;
import com.debuggeandoideas.models.RealityStone;
import com.debuggeandoideas.models.SoulStone;
import com.debuggeandoideas.models.SpaceStone;
import com.debuggeandoideas.models.Stone;
import com.debuggeandoideas.models.TimeStone;
import com.debuggeandoideas.services.GauntletService;
import com.debuggeandoideas.services.GauntletServiceImpl;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.extern.java.Log;

import java.util.Map;
import java.util.function.Consumer;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Log
public class StoneContext {
    public static GauntletService setContext(
            Consumer<Void> preConstruct,
            Consumer<Void> postConstruct
    ) {
        log.info("IoC set Scope");
        System.setProperty("scope", "prototype");

        log.info("IoC executing PreConstruct");
        //@PreConstruct
        preConstruct.accept(null);

        log.info("IoC creating factories");
        var realityFactory = new RealityStoneFactory();
        var timeFactory = new TimeStoneFactory();
        var soulFactory = new SoulStoneFactory();
        var powerFactory = new PowerStoneFactory();
        var spaceFactory = new SpaceStoneFactory();
        var mindFactory = new MindStoneFactory();

        log.info("IoC instance objects");
        RealityStone reality = (RealityStone) realityFactory.createStone();
        TimeStone time = (TimeStone) timeFactory.createStone();
        SoulStone soul = (SoulStone) soulFactory.createStone();
        PowerStone power = (PowerStone) powerFactory.createStone();
        SpaceStone space = (SpaceStone) spaceFactory.createStone();
        MindStone mind = (MindStone) mindFactory.createStone();

        log.info("IoC loading GauntletServiceImpl in container");
        final var gauntletService = new GauntletServiceImpl();


        Map<String, Stone> instances = Map.of(
                "realityStone", reality,
                "soulStone", soul,
                "mindStone", mind,
                "powerStone", power,
                "spaceStone", space,
                "timeStone", time
        );

        log.info("IoC DI on GauntletServiceImpl");
        gauntletService.setStones(instances);

        log.info("IoC executing PostConstruct");
        //@PostConstruct
        postConstruct.accept(null);

        return gauntletService;
    }

    public static void destroyContext(GauntletService gauntletService) {

        log.info("Cleaning context");
        if(gauntletService instanceof GauntletServiceImpl) {
            ((GauntletServiceImpl) gauntletService).getMindStone().clear();
            ((GauntletServiceImpl) gauntletService).getTimeStone().clear();
            ((GauntletServiceImpl) gauntletService).getSoulStone().clear();
            ((GauntletServiceImpl) gauntletService).getPowerStone().clear();
            ((GauntletServiceImpl) gauntletService).getRealityStone().clear();
        }

        log.info("Cleaning properties");
        System.clearProperty("scope");
    }
}
