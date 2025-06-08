package com.debuggeandoideas.singleton;

import com.debuggeandoideas.models.RealityStone;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.extern.java.Log;

@Log
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class RealityStoneSingleton {
    private static RealityStone realityStoneInstance;

    public static RealityStone getInstance() {
        if(realityStoneInstance == null) {
            log.info("Creating first instance: " + RealityStoneSingleton.class);
            synchronized (RealityStoneSingleton.class) {
               if(realityStoneInstance == null) {
                   realityStoneInstance = new RealityStone();
               }
            }
        }
        return realityStoneInstance;
    }

}
