package com.debuggeandoideas.factories;

import com.debuggeandoideas.models.RealityStone;
import com.debuggeandoideas.models.Stone;
import com.debuggeandoideas.prototype.Prototypes;
import com.debuggeandoideas.singleton.RealityStoneSingleton;

public class RealityStoneFactory extends ConfigurableStoneFactory{
    @Override
    public Stone createStone() {
       if(super.isSingleton()) {
           return RealityStoneSingleton.getInstance();
       } else {
           return Prototypes.realityPrototype.buildPrototype(new RealityStone());
       }
    }
}
