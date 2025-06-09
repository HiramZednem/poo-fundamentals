package com.debuggeandoideas.services;

import com.debuggeandoideas.models.RealityStone;
import com.debuggeandoideas.singleton.RealityStoneSingleton;
import lombok.extern.java.Log;

//@ServiceAdd commentMore actions
@Log
public class GauntletServiceImpl implements GauntletService {

    private final RealityStone realityStone = RealityStoneSingleton.getInstance();

    @Override
    public void useGauntlet(String stoneName) {
        log.info("Use stone: " + realityStone);
    }
}