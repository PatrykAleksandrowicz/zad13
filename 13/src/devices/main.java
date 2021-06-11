package devices;

import creatures.FarmAnimal;
import creatures.Pet;

import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class main {
    public static void  main(String[] args){
        Application a1 = new Application("jeden", "1.0", 200.0);
        Application a2 = new Application("dwa", "1.2", 300.0);
        Application a3 = new Application("trzy", "1.3", 0.0);
        Application a4 = new Application("cztery", "1.4", 800.0);
        Application a5 = new Application("piec", "1.7", 20.0);
        Set<Application> zbior = new HashSet<Application>();
        zbior.add(a1);
        zbior.add(a2);
        zbior.add(a3);
        zbior.add(a4);
        zbior.add(a5);

        Human h1 = new Human("Patryk", "Aleksandrowicz", 12, "men", 20000.0);
        h1.setCash(10.0);

        Phone p = new Phone("11 pro", "Apple", 2012, "IoS");

        p.zainstaluj(a1,h1);

        h1.setCash(10000.0);

        p.zainstaluj(a1,h1);

        System.out.println(h1.getCash());

        p.zainstaluj(a2,h1);
        p.zainstaluj(a3,h1);

        System.out.println(p.czyZainstalowana1(a1));
        System.out.println(p.czyZainstalowana1(a2));
        System.out.println(p.czyZainstalowana2("jeden"));
        System.out.println(p.czyZainstalowana2("dwa"));
        p.wypiszBezplatne(zbior);
        System.out.println(p.wartoscZainstalowanych());
        p.wypiszAlfabetycznie();
        System.out.println("-------");
        p.wypiszPoCenie();

    }
}