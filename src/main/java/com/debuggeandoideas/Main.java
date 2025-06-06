package com.debuggeandoideas;

import com.debuggeandoideas.models.MindStone;
import com.debuggeandoideas.models.PowerStone;
import com.debuggeandoideas.models.RealityStone;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        final var mind = new MindStone();
        final var power = new PowerStone();
        final var reality = new RealityStone();


        mind.usePower();
        System.out.println("---");
        power.usePower();
        System.out.println("---");
        reality.usePower();
    }
}