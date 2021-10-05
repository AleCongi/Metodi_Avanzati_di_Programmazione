package utility;

import mining.EmergingPattern;

import java.util.Comparator;

public class ComparatorGrowRate implements Comparator<EmergingPattern>{

    @Override
    public int compare(EmergingPattern e1, EmergingPattern e2) {

        if (e1.getGrowrate() > e2.getGrowrate()) {
            return 1;
        }

        else if (e1.getGrowrate() < e2.getGrowrate()) {
            return -1;
        }

        else return 0;
    }

}
