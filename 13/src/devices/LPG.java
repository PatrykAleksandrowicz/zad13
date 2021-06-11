package devices;

public class LPG extends Car{
    public LPG(String model, String producer, String price, Double value, int yearOfProduction) {
        super(model, producer, price, value, yearOfProduction);
    }
    public void refuel(){
        System.out.println("Zatankowano LPG");
    }
}
