package ru.maltseva.junglesimulatorapp.util;

import ru.maltseva.junglesimulatorapp.model.Panther;

public class EventSimulator {
    public void startSimulation(Panther panther) {
        while (checkStatus(panther)) {
            int num = (int) (Math.random() * 100);
            if (num >= 0 && num < 20) {
                sleepEvent(panther);
            } else if (num >= 20 && num < 30) {
                eatAntelope(panther);
            } else if (num >= 30 && num < 40) {
                eatBuffalo(panther);
            } else if (num >= 40 && num < 50) {
                hideEvent(panther);
            } else if (num >= 50 && num < 60) {
                runEvent(panther);
            } else if (num >= 60 && num < 65) {
                fightLeon(panther);
            } else if (num >= 65 && num < 75) {
                huntEvent(panther);
            } else if (num >= 75 && num < 85) {
                hunterAttack(panther);
            } else if (num >= 85 && num < 90) {
                careKitten(panther);
            } else if (num >= 90 && num <= 100) {
                teachEvent(panther);
            }
        }
        System.out.println("О, нет! Пантера умерла!");

    }

    private void sleepEvent(Panther panther) {
        int energy = panther.getEnergy();
        energy = energy + 30;
        if (energy > 100) {
            energy = 100;
        }
        panther.setEnergy(energy);
        checkEnergy(panther);
        System.out.println("Пантера поспала! Энергия восстановилась. Текущая энергия: " + panther.getEnergy() + " " +
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
        System.out.println("Пантера пробежала! Текущая энергия: " + panther.getEnergy() + " " +
                "Текущее здоровье: " + panther.getHealth());
    }

    private void huntEvent(Panther panther) {
        int energy = panther.getEnergy();
        energy = energy - 10;
        if (energy < 0) {
            energy = 0;
        }
        panther.setEnergy(energy);
        checkEnergy(panther);
        System.out.println("Пантера вышла на охоту! Текущая энергия: " + panther.getEnergy() + " " +
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

    private void fightLeon(Panther panther) {
        int health = panther.getHealth();
        int energy = panther.getEnergy();
        String fightResult = "";
        int i = (int) (Math.random() * 100);
        if (i <= 50) {
            energy = energy - 8;
            if (energy < 0) {
                energy = 0;
            }
            fightResult = "Пантера победила!";
        } else {
            health = health - 8;
            if (health < 0) {
                health = 0;
            }
            energy = energy - 8;
            if (energy < 0) {
                energy = 0;
            }
            fightResult = "О, нет! Лев укусил пантеру!";
        }
        panther.setEnergy(energy);
        panther.setHealth(health);
        checkEnergy(panther);
        System.out.println("Пантера сражалась со львом. Результат битвы: " + fightResult + " " +
                "Текущая энергия: " + panther.getEnergy() + " " +
                "Текущее здоровье: " + panther.getHealth());
    }

    private void hideEvent(Panther panther) {
        int energy = panther.getEnergy();
        energy = energy - 4;
        if (energy < 0) {
            energy = 0;
        }
        panther.setEnergy(energy);
        checkEnergy(panther);
        System.out.println("Пантера спрятала добычу! Текущая энергия: " + panther.getEnergy() + " " +
                "Текущее здоровье: " + panther.getHealth());
    }

    private void careKitten(Panther panther) {
        int energy = panther.getEnergy();
        energy = energy - 2;
        if (energy < 0) {
            energy = 0;
        }
        panther.setEnergy(energy);
        checkEnergy(panther);
        System.out.println("Пантера заботилась о своих детёнышах! Текущая энергия: " + panther.getEnergy() + " " +
                "Текущее здоровье: " + panther.getHealth());
    }

    private void teachEvent(Panther panther) {
        int energy = panther.getEnergy();
        energy = energy - 2;
        if (energy < 0) {
            energy = 0;
        }
        panther.setEnergy(energy);
        checkEnergy(panther);
        System.out.println("Пантера учила своих детёнышей охотиться! Текущая энергия: " + panther.getEnergy() + " " +
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
