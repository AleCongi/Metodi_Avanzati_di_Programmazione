package data;

import java.io.Serializable;

public class DiscreteAttribute extends Attribute implements Serializable {
    String values[];


    /**
     * @author Raffaele Di Anna, Alessandro Carella, Alessandro congedo
     * @param name stringa indicante il nome
     * @param index intero indicante l'indice
     * @param values array di stringhe di valori
     * costruttore di DiscreteAttribute che richiama il super.
     */
    protected DiscreteAttribute(String name, int index, String values[]) {
        super(name, index);

        int dimensione = values.length;
        this.values = new String[dimensione];
        for (int i = 0; i < dimensione; i++) {
            this.values[i] = values[i];
        }
    }


    /**
     * @author Raffaele Di Anna, Alessandro Carella, Alessandro congedo
     * restituisce la dimensione dell'array values
     */
    public int getNumberOfDistinctValues() {
        return values.length;
    }

    /**
     * @author Raffaele Di Anna, Alessandro Carella, Alessandro congedo
     * @param index intero indicante l'indice
     * restituisce la stringa indicante il valore in posizione index
     */
    public String getValue(int index) {
        return values[index];
    }

}