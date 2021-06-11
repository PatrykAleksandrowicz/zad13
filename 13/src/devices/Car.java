package devices;

import java.util.ArrayList;
import java.util.Objects;

public abstract class Car extends Device{
    public String price;
    ArrayList<Human> lista_wl = new ArrayList<Human>();

    public Car(String model, String producer, String price, Double value, int yearOfProduction) {
        this.model = model;
        this.producer = producer;
        this.price = price;
        this.value = value;
        this.yearOfProduction = yearOfProduction;

    }
    public void sell(Human seller, Human buyer, Double price, Car c){
        int i=0;
        int numer_z_gar_sprze=0;
        for(Car car:seller.getGarage()){
            if(car == c){
                i++;
                break;
            }
            numer_z_gar_sprze++;
        }
        if(i != 0 && c.lista_wl.get(lista_wl.size()-1) == seller){
            i=0;
            int numer_z_gar_kup=0;
            for(Car car: buyer.getGarage()){
                if(car == null){
                    i++;
                    break;
                }
                numer_z_gar_kup++;
            }
            if(i != 0){
                if(buyer.getCash() >= price){
                    buyer.setCash(buyer.getCash()-price);
                    seller.setCash((seller.getCash()+price));
                    buyer.setCar(seller.getCar(numer_z_gar_sprze), numer_z_gar_kup, buyer); // kupujacy jest wlascicielem
                    seller.setCar(null,numer_z_gar_sprze); // sprzedajacy sprzedal i nie ma auta
                    System.out.println("Samochod pomyslnie zakupiony przez kupujacego od sprzedajacego");
                }
                else{
                    System.out.println("Kupujacy nie ma tyle siana!");
                }
            }
            else{
                System.out.println("Brak miejsc u kupujacego w garazu");
            }
        }
        else{
            System.out.println("Sprzedajacy nie ma samochodu lub nie jest jego wlascicielem!");
        }
    }
    public boolean czyBylWlascicielem(Human h){
        for(Human h1: this.lista_wl){
            if(h1.equals(h)){
                return true;
            }
        }
        return false;
    }
    public boolean czyAsprzedalB(Human a, Human b){
        int poz_a=-1;
        int poz_b=-1;
        int i=0;
        for(Human h1: this.lista_wl){
            if(h1.equals(a)){
                poz_a = i;
            }
            if(h1.equals(b)){
                poz_b = i;
            }
            i++;
        }
        if(poz_a < poz_b && poz_a!=-1 && poz_b!=-1){
            return true;
        }
        else{
            return false;
        }
    }
    public int iloscTransakcji(){
        return this.lista_wl.size()-1; // a sprzedal b, b sprzedal c = 2 transakcje, lista wl = 3
    }
    public  Double getValue()
    {
        return  this.value;
    }
    public  int getYearOfProduction()
    {
        return this.yearOfProduction;
    }
    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || getClass() != o.getClass())return false;
    Car auto = (Car) o;
    return Objects.equals(producer,auto.producer)&&Objects.equals(model,auto.model)&&Objects.equals(price,auto.price)&&Objects.equals(value,auto.value);
    }
    @Override
    public int hashCode() {
        return Objects.hash(producer, model, price, value);
    }

    public void turnOn(){
        System.out.println("Samochod zapalil.");
    }

    abstract public void refuel();
}