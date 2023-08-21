package ru.maltseva.junglesimulatorapp._main;

import ru.maltseva.junglesimulatorapp.model.Panther;
import ru.maltseva.junglesimulatorapp.util.EventSimulator;

public class _Main {
    public static void main(String[] args) {
        Panther panther = new Panther();
        EventSimulator eventSimulator = new EventSimulator();
        eventSimulator.startSimulation(panther);
    }
}