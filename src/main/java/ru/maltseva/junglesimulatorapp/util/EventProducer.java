package ru.maltseva.junglesimulatorapp.util;

import ru.maltseva.junglesimulatorapp.model.Panther;

public class EventProducer {
    public void activateEvent() {

    }

    private void sleepEvent(Panther panther) {
        int energy = panther.getEnergy();
        energy = energy + 20;
        if (energy > 100) {
            energy = 100;
        }
        panther.setEnergy(energy);
        System.out.println("Пантера поспала! Энергия восстановилась. Текущая энергия: " + panther.getEnergy() + " " +
                "Текущее здоровье: " + panther.getHealth());
    }

    private void walkEvent(Panther panther) {
        int energy = panther.getEnergy();
        energy = energy - 3;
        if (energy < 0) {
            energy = 0;
        }
        panther.setEnergy(energy);
        System.out.println("Пантера пошла на прогулку! Энергия - 3. Текущая энергия: " + " " +
                "Текущее здоровье: " + panther.getHealth());
    }

    private void runEvent(Panther panther) {
        int energy = panther.getEnergy();
        energy = energy - 7;
        if (energy < 0) {
            energy = 0;
        }
        panther.setEnergy(energy);
        System.out.println("Пантера пробежала! Энергия - 7. Текущая энергия: " + " " +
                "Текущее здоровье: " + panther.getHealth());
    }
    private void eatAntelope(Panther panther){
        int health = panther.getHealth();
        int energy = panther.getEnergy();
        health = health + (int) (panther.getFANGS()*3);
        if (health > 100){
            health = 100;
        }
        energy = energy - 6;
        if (energy < 0) {
            energy = 0;
        }
        panther.setEnergy(energy);
        panther.setHealth(health);
    }
    private void eatBuffalo(Panther panther){
        int health = panther.getHealth();
        int energy = panther.getEnergy();
        health = health + (int) (panther.getFANGS()*5);
        if (health > 100){
            health = 100;
        }
        energy = energy - 8;
        if (energy < 0) {
            energy = 0;
        }
        panther.setEnergy(energy);
        panther.setHealth(health);
    }
}
