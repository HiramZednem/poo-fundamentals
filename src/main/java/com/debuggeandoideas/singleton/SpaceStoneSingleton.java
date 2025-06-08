package com.debuggeandoideas.singleton;

import com.debuggeandoideas.models.SpaceStone;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.extern.java.Log;

@Log
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class SpaceStoneSingleton {
    private static volatile SpaceStone spaceStoneInstance;

    public static SpaceStone getInstance() {
        if ( spaceStoneInstance == null ) {
            log.info("Creating first instance: " + SpaceStoneSingleton.class);
            synchronized (SpaceStoneSingleton.class) {
                if (spaceStoneInstance == null) {
                    spaceStoneInstance = new SpaceStone();
                }
            }
        }
        return  spaceStoneInstance;
    }
}
