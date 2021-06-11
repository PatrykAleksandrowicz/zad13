package devices;

import java.net.URL;
import java.util.*;

public class Phone extends Device {
    String System;
    private static final String adres = "www.dobreprogramy.pl/combofix,program,windows,6628678494627457";
    private static final int port = 8080;
    private static final String wersja = "19.11.4.1";
    Set<Application> zbior_app = new HashSet<Application>();

    public Phone(String model, String producer, int yearOfProduction, String system) {
        this.System = system;
        this.model = model;
        this.producer = producer;
        this.yearOfProduction = yearOfProduction;
    }
    public void zainstaluj(Application a, Human h1){
        if(h1.getCash() >= a.getCena()){
            this.zbior_app.add(a);
            h1.setCash(h1.getCash()-a.getCena());
        }
        else{
            java.lang.System.out.println("Nie masz tyle siana na ta apke");
        }
    }
    public boolean czyZainstalowana1(Application a){
        for(Application b:zbior_app){
            if(a == b) return true;
        }
        return false;
    }
    public boolean czyZainstalowana2(String nazwa){
        for(Application b:zbior_app){
            if(b.getNazwa() == nazwa) return true;
        }
        return false;
    }
    public void wypiszBezplatne(Set<Application> a){
        for(Application b:a){
            if(b.getCena() == 0.0) java.lang.System.out.println(b.getNazwa());
        }
    }
    public Double wartoscZainstalowanych(){
        Double wartosc=0.0;
        for(Application b:zbior_app){
            wartosc += b.getCena();
        }
        return wartosc;
    }
    public void wypiszAlfabetycznie(){
        List<Application> sortedList = new ArrayList<Application>(this.zbior_app);
        Komparator2 k = new Komparator2();
        Collections.sort(sortedList, k);

        for(Application a: sortedList){
            java.lang.System.out.println(a.getNazwa());
        }
    }
    public void wypiszPoCenie(){
        List<Application> sortedList = new ArrayList<Application>(this.zbior_app);
        Komparator1 k = new Komparator1();
        Collections.sort(sortedList, k);

        for(Application a: sortedList){
            java.lang.System.out.println(a.getNazwa());
        }
    }
    public void turnOn(){
        java.lang.System.out.println("Telefon wlaczyl sie!");
    }

    public void sell1(Human seller, Human buyer, Double price){
        if(seller.getTelephone() != null){
            if(buyer.getCash() >= price){
                buyer.setCash(buyer.getCash()-price);
                seller.setCash((seller.getCash()+price));
                buyer.setTelephone(seller.getTelephone());
                seller.setTelephone(null);

                java.lang.System.out.println("Telefon pomyslnie zakupiony przez kupujacego od sprzedajacego");
            }
            else{
                java.lang.System.out.println("Kupujacy nie ma tyle siana!");
            }
        }
        else{
            java.lang.System.out.println("Sprzedajacy nie ma samochodu!");
        }
    }

    public void installAnnApp(String nazwa){
        java.lang.System.out.println("Zainstalowano aplikacje " + nazwa);
    }
    public void installAnnApp(String nazwa, String wersja){
        java.lang.System.out.println("Zainstalowano aplikacje " + nazwa + " w wersji " + wersja);
    }
    public void installAnnApp(String nazwa, String wersja, String adres){
        java.lang.System.out.println("Zainstalowano aplikacje " + nazwa + " w wersji " + wersja + " z adresu " + adres);
    }
    public void installAnnApp(ArrayList<String> lista){
        java.lang.System.out.println("Zainstalowano nastepujace aplikacje :");
        for(String apka: lista){
            java.lang.System.out.println(apka);
        }
    }
    public void installAnnApp(URL url){
        java.lang.System.out.println("Zainstalowano aplikacje z adresu URL prowadzacego do konkretnej aplikacji z konkretna wersja");
    }

    @Override
    public String toString() {
            String x = "Model: " + this.model + ";" +
                    "Producent: " + this.producer + ";" +
                    "Cena: " + this.System + ";" +
                    "Rok produkcji: " + this.yearOfProduction;
            return x;
        }

    @Override
    public void sell(Human seller, Human buyer, Double price, Car c) {

    }
}