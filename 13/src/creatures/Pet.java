package creatures;

import devices.Car;
import devices.Human;

public class Pet extends Animal {
    private int wiek;
    public Pet(String species,  int wiek) {
        super(species);
        this.wiek = wiek;
    }

    @Override
    public void sell(Human seller, Human buyer, Double price, Car c) {

    }
}
