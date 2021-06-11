package devices;

public abstract class Device implements salleable {
     String model;
     String producer;
     int yearOfProduction;
     Double value;

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public abstract void turnOn();

    public String toString(){
        String x = "Model: " + this.model + ";" +
                "Producent: " + this.producer + ";" +
                "Rok produkcji: " + this.yearOfProduction;
        return x;
    }
}
