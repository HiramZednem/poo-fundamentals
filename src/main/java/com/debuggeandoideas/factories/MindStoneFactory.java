package com.debuggeandoideas.factories;

import com.debuggeandoideas.models.MindStone;
import com.debuggeandoideas.models.Stone;
import com.debuggeandoideas.prototype.Prototypes;
import com.debuggeandoideas.singleton.MindStoneSingleton;

public class MindStoneFactory extends  ConfigurableStoneFactory{
    @Override
    public Stone createStone() {
       if(super.isSingleton()) {
           return MindStoneSingleton.getInstance();
       }else {
           return Prototypes.mindPrototype.buildPrototype(new MindStone());
       }
    }
}
