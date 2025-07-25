package com.debuggeandoideas.factories;

import com.debuggeandoideas.models.SpaceStone;
import com.debuggeandoideas.models.Stone;
import com.debuggeandoideas.prototype.Prototypes;
import com.debuggeandoideas.singleton.SpaceStoneSingleton;

public class SpaceStoneFactory extends ConfigurableStoneFactory{

    @Override
    public Stone createStone() {
        if (super.isSingleton()) {
            return SpaceStoneSingleton.getInstance();
        } else {
            return Prototypes.spacePrototype.buildPrototype(new SpaceStone());
        }
    }
}
