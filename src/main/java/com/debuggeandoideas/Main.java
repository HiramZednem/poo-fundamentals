package com.debuggeandoideas;

import com.debuggeandoideas.services.GauntletServiceImpl;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        final var gauntletService = new GauntletServiceImpl();

        gauntletService.useGauntlet("");
    }
}