package creatures;

import devices.Human;
import devices.salleable;

public abstract class Animal implements salleable, Feedable {
    final String species;
    public String name;
    private Double weight;

    static public final Double DEFAULT_ANIMAL_WEIGHT= 1.0;
    public Animal(String species) {
        this.species = species;

        switch(this.species) {
            case "dog":
                this.weight = 20.0;
                break;
            case "cow":
                this.weight = 400.0;
                break;
            default:
                this.weight = DEFAULT_ANIMAL_WEIGHT;
        }
    }

    public void sell1(Human seller, Human buyer, Double price){
        if(seller.getPet() != null){
            if(buyer.getCash() >= price){
                buyer.setCash(buyer.getCash()-price);
                seller.setCash(seller.getCash()+price);
                buyer.setPet(seller.getPet());
                seller.setPet(null);
                java.lang.System.out.println("Zwierze pomyslnie zakupione przez kupujacego od sprzedajacego");
            }
            else{
                java.lang.System.out.println("Kupujacy nie ma tyle siana!");
            }
        }
        else{
            java.lang.System.out.println("Sprzedajacy nie ma samochodu!");
        }
    }
    public void feed(){
        if(weight >0) {
            this.weight += 1;
            System.out.println("thx for feed my weight is now" + this.weight);
        } else {
            System.out.println("too late, im dead");
        }
    }

    public void takeForAWalk(){
        if(weight >0) {
            this.weight -= 1;
            System.out.println("thx walk done my weight is now:" + this.weight);
        }else{
            System.out.println("too late, im dead");
        }
    }

    public void feed(Double foodWeight){
        if(weight >0) {
            this.weight += foodWeight;
            System.out.println("thx for feed my weight is now" + this.weight);
        } else {
            System.out.println("too late, im dead");
        }
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

}