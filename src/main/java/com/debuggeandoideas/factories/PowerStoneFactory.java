package com.debuggeandoideas.factories;

import com.debuggeandoideas.models.PowerStone;
import com.debuggeandoideas.models.Stone;
import com.debuggeandoideas.prototype.Prototypes;
import com.debuggeandoideas.singleton.PowerStoneSingleton;

public class PowerStoneFactory extends ConfigurableStoneFactory{
    @Override
    public Stone createStone() {
        if (super.isSingleton()) {
            return PowerStoneSingleton.getInstance();
        } else {
            return Prototypes.powerPrototype.buildPrototype(new PowerStone());
        }
    }
}
