package data;

import java.io.Serializable;
import java.util.Iterator;

public class ContinuousAttribute extends Attribute implements Iterable<Float>, Serializable {
    private float max;
    private float min;// rappresentano gli estremi di un intervallo

    public ContinuousAttribute(String name, int index, float min, float max) {
        super(name, index);

        this.max = max;
        this.min = min;
    }

    public float getMin() {
        return this.min;
    }

    public float getMax() {
        return this.max;
    }

    public Iterator<Float> iterator(){
        return new ContinuousAttributeIterator(min, max, 5);
    }


}