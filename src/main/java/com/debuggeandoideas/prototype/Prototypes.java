package com.debuggeandoideas.prototype;

import com.debuggeandoideas.models.MindStone;
import com.debuggeandoideas.models.PowerStone;
import com.debuggeandoideas.models.RealityStone;
import com.debuggeandoideas.models.SoulStone;
import com.debuggeandoideas.models.SpaceStone;
import com.debuggeandoideas.models.TimeStone;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Prototypes {
    public static StonePrototype<MindStone> mindPrototype =
            MindStone::getPrototype;

    public static StonePrototype<PowerStone> powerPrototype =
            stone -> stone.getPrototype();

    public static StonePrototype<RealityStone> realityPrototype =
            stone -> stone.getPrototype();

    public static StonePrototype<SoulStone> soulPrototype =
            stone -> stone.getPrototype();

    public static StonePrototype<SpaceStone> spacePrototype =
            stone -> stone.getPrototype();

    public static StonePrototype<TimeStone> timePrototype =
            stone -> stone.getPrototype();

}
