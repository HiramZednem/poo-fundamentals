package com.debuggeandoideas.services;

import com.debuggeandoideas.models.RealityStone;
import com.debuggeandoideas.models.Stone;
import com.debuggeandoideas.singleton.RealityStoneSingleton;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.java.Log;

import java.lang.reflect.Field;
import java.util.Map;

//@ServiceAdd commentMore actions
@Log
//@AllArgsConstructor
@NoArgsConstructor
public class GauntletServiceImpl implements GauntletService {

//    private final RealityStone realityStone = RealityStoneSingleton.getInstance();
    private Stone mindStone;
    private Stone powerStone;
    private Stone realityStone;
    private Stone soulStone;
    private Stone spaceStone;
    private Stone timeStone;

    @Override
    public void useGauntlet(String stoneName) {
        switch (stoneName) {
            case "mind" -> log.info("Use stone: " + this.mindStone);
            case "power" -> log.info("use stone: " + this.powerStone);
            case "reality" -> log.info("Use stone: " + this.realityStone);
            case "soul" -> log.info("Use stone: " + this.soulStone);
            case "space" -> log.info("Use stone: " + this.spaceStone);
            case "time" -> log.info("Use stone: " + this.timeStone);
            default -> throw new IllegalArgumentException("Invalid Name");
        }

    }

    @Override
    public void useFullPower() {
        if (
                this.mindStone != null &&
                this.powerStone != null &&
                this.realityStone != null &&
                this.soulStone != null &&
                this.spaceStone != null &&
                this.timeStone != null
        ) {
            log.info("using all power");
        } else {
            throw new IllegalStateException("You need to have all the stones to use full power");
        }

    }

    public void setStones(Map<String, Stone> stones) {
        stones.forEach((fieldName, stone) -> {
            try {
                Field field = this.getClass().getDeclaredField(fieldName);
                field.setAccessible(true);
                field.set(this, stone);
                log.info("Dependency Inyection of " + fieldName);
                field.setAccessible(false);

            } catch (NoSuchFieldException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        });
    }
}