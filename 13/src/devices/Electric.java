package devices;

public class Electric extends Car{
    public Electric(String model, String producer, String price, Double value, int yearOfProduction) {
        super(model, producer, price, value, yearOfProduction);
    }
    public void refuel(){
        System.out.println("Prad naladowany");
    }
}
