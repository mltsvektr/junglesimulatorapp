package ru.maltseva.junglesimulatorapp.util;

import ru.maltseva.junglesimulatorapp.model.Panther;

public class EventSimulator {
    public void startSimulation(Panther panther) {
        while (checkStatus(panther)) {
            int num = (int) Math.random() * 100;
        }

    }

    private void sleepEvent(Panther panther) {
        int energy = panther.getEnergy();
        energy = energy + 20;
        if (energy > 100) {
            energy = 100;
        }
        panther.setEnergy(energy);
        checkEnergy(panther);
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
        checkEnergy(panther);
        System.out.println("Пантера пошла на прогулку!  Текущая энергия: " + " " +
                "Текущее здоровье: " + panther.getHealth());
    }

    private void runEvent(Panther panther) {
        int energy = panther.getEnergy();
        energy = energy - 7;
        if (energy < 0) {
            energy = 0;
        }
        panther.setEnergy(energy);
        checkEnergy(panther);
        System.out.println("Пантера пробежала! Текущая энергия: " + " " +
                "Текущее здоровье: " + panther.getHealth());
    }

    private void eatAntelope(Panther panther) {
        int health = panther.getHealth();
        int energy = panther.getEnergy();
        health = health + (int) (panther.getFANGS() * 3);
        if (health > 100) {
            health = 100;
        }
        energy = energy - 6;
        if (energy < 0) {
            energy = 0;
        }
        panther.setEnergy(energy);
        panther.setHealth(health);
        checkEnergy(panther);
        System.out.println("Пантера съела антилопу! Текущая энергия: " + panther.getEnergy() + " " +
                "Текущее здоровье: " + panther.getHealth());
    }

    private void eatBuffalo(Panther panther) {
        int health = panther.getHealth();
        int energy = panther.getEnergy();
        health = health + (int) (panther.getFANGS() * 5);
        if (health > 100) {
            health = 100;
        }
        energy = energy - 8;
        if (energy < 0) {
            energy = 0;
        }
        panther.setEnergy(energy);
        panther.setHealth(health);
        checkEnergy(panther);
        System.out.println("Пантера съела буйвола!Текущая энергия: " + panther.getEnergy() + " " +
                "Текущее здоровье: " + panther.getHealth());
    }

    private void hunterAttack(Panther panther) {
        int health = panther.getHealth();
        int energy = panther.getEnergy();
        health = health - 10;
        if (health < 0) {
            health = 0;
        }
        energy = energy - 8;
        if (energy < 0) {
            energy = 0;
        }
        panther.setEnergy(energy);
        panther.setHealth(health);
        checkEnergy(panther);
        System.out.println("На пантеру напал охотник! Текущая энергия: " + panther.getEnergy() +
                "Текущее здоровье: " + panther.getHealth());
    }

    private boolean checkStatus(Panther panther) {
        if (panther.getHealth() <= 0) {
            return false;
        } else {
            return true;
        }
    }

    private void checkEnergy(Panther panther) {
        int health = panther.getHealth();
        if (panther.getEnergy() <= 0) {
            health = health - 5;
            if (health < 0) {
                health = 0;
            }
            panther.setHealth(health);
        }
    }

}
