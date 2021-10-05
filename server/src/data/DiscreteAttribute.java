package data;

import java.io.Serializable;

public class DiscreteAttribute extends Attribute implements Serializable {
    String values[];

    public DiscreteAttribute(String name, int index, String values[]) {
        super(name, index);

        int dimensione = values.length;
        this.values = new String[dimensione];
        for (int i = 0; i < dimensione; i++) {
            this.values[i] = values[i];
        }
    }

    public int getNumberOfDistinctValues() {
        return values.length;
    }

    public String getValue(int index) {
        return values[index];
    }

}