package devices;

import java.util.Comparator;

public class Komparator1 implements Comparator<Application> {
    public int compare(Application a1, Application a2) {
        if(a2 == null) return -1;
        if(a1.getCena() > a2.getCena()) return 1;
        else if(a1.getCena() < a2.getCena()) return -1;
        else return 0;
    }
}
