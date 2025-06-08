package com.debuggeandoideas.services;

import lombok.extern.java.Log;

//@ServiceAdd commentMore actions
@Log
public class GauntletServiceImpl implements GauntletService {


    @Override
    public void useGauntlet(String stoneName) {
        log.info("Use stone: " + stoneName);
    }
}