package devices;

import java.util.Comparator;

public class Komparator implements Comparator<Car>
{

    @Override
    public int compare(Car c1, Car c2) {
        if(c2 == null) return -1;
        if(c1.getYearOfProduction() > c2.getYearOfProduction()) return 1;
        else if(c1.getYearOfProduction() < c2.getYearOfProduction()) return -1;
        else return 0;
    }
}