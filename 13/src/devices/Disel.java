package devices;

public class Disel extends Car{
    public Disel(String model, String producer, String price, Double value, int yearOfProduction) {
        super(model, producer, price, value, yearOfProduction);
    }
    public void refuel(){
        System.out.println("Zatankowano Dizla");
    }
}
