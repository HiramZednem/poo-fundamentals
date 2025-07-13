package com.debuggeandoideas.services;

import com.debuggeandoideas.models.RealityStone;
import com.debuggeandoideas.models.Stone;
import com.debuggeandoideas.singleton.RealityStoneSingleton;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.java.Log;

//@ServiceAdd commentMore actions
@Log
@AllArgsConstructor
public class GauntletServiceImpl implements GauntletService {

//    private final RealityStone realityStone = RealityStoneSingleton.getInstance();
    private final Stone mindStone;
    private final Stone powerStone;
    private final Stone realityStone;
    private final Stone soulStone;
    private final Stone spaceStone;
    private final Stone timeStone;

    @Override
    public void useGauntlet(String stoneName) {
        switch (stoneName) {
            case "mind" -> log.info("Use stone: " + this.mindStone);
            case "power" -> log.info("use stone: " + this.powerStone);
            case "reality" -> log.info("Use stone: " + this.realityStone);
            case "soul" -> log.info("Use stone: " + this.soulStone);
            case "space" -> log.info("Use stone: " + this.spaceStone);
            case "time" -> log.info("Use stone: " + this.timeStone);
            default -> throw new IllegalArgumentException("Invalid Name");
        }

    }

    @Override
    public void useFullPower() {
        if (
                this.mindStone != null &&
                this.powerStone != null &&
                this.realityStone != null &&
                this.soulStone != null &&
                this.spaceStone != null &&
                this.timeStone != null
        ) {
            log.info("using all power");
        } else {
            throw new IllegalStateException("You need to have all the stones to use full power");
        }

    }
}