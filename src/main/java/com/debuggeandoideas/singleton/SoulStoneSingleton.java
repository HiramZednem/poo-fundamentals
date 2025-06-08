package com.debuggeandoideas.singleton;

import com.debuggeandoideas.models.SoulStone;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.extern.java.Log;

@Log
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class SoulStoneSingleton {
    private static volatile SoulStone soulStoneInstance;

    public static SoulStone getInstance() {
        if (soulStoneInstance == null) {
            log.info("Creating first instance: " + SoulStoneSingleton.class);
            synchronized (SoulStoneSingleton.class) {
                if ( soulStoneInstance == null ) {
                    soulStoneInstance = new SoulStone();
                }
            }
        }
        return soulStoneInstance;
    }

}
