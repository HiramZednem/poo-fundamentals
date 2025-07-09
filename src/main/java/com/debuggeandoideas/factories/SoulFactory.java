package com.debuggeandoideas.factories;

import com.debuggeandoideas.models.SoulStone;
import com.debuggeandoideas.models.Stone;
import com.debuggeandoideas.prototype.Prototypes;
import com.debuggeandoideas.singleton.SoulStoneSingleton;

public class SoulFactory extends ConfigurableStoneFactory {

    @Override
    public Stone createStone() {
        if(super.isSingleton()) {
            return SoulStoneSingleton.getInstance();
        } else {
            return Prototypes.soulPrototype.buildPrototype(new SoulStone());
        }
    }
}
