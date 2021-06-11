package devices;

import java.util.Comparator;


public class Komparator2 implements Comparator<Application> {
    public int compare(Application a1, Application a2) {
        int compare = a1.getNazwa().compareTo(a2.getNazwa());
        if(compare < 0) return -1;
        else if(compare > 0) return 1;
        else return 0;
    }
}