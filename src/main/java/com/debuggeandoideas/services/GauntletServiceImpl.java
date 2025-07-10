package com.debuggeandoideas.services;

import com.debuggeandoideas.models.RealityStone;
import com.debuggeandoideas.singleton.RealityStoneSingleton;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.java.Log;

//@ServiceAdd commentMore actions
@Log
@Setter
@NoArgsConstructor
public class GauntletServiceImpl implements GauntletService {

//    private final RealityStone realityStone = RealityStoneSingleton.getInstance();
    private RealityStone realityStone;

    @Override
    public void useGauntlet(String stoneName) {
        switch (stoneName) {
            case "reality" -> log.info("Use stone: " + realityStone);
            default -> throw new IllegalArgumentException("Invalid Name");
        }

    }

    @Override
    public void useFullPower() {

    }
}