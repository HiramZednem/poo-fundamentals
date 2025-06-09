package com.debuggeandoideas;

import com.debuggeandoideas.models.MindStone;
import com.debuggeandoideas.prototype.Prototypes;
import com.debuggeandoideas.services.GauntletServiceImpl;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        final var mind = new MindStone();
        System.out.println(mind);
        System.out.println(System.identityHashCode(mind));

        final var mind2 = Prototypes.mindPrototype.buildPrototype(mind);
        System.out.println(mind2);
        System.out.println(System.identityHashCode(mind2));
    }
}