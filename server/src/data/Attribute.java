package data;

import java.io.Serializable;


public abstract class Attribute implements Serializable {
    private String name;
    private int index;


    /**
     * @author Raffaele Di Anna, Alessandro Carella, Alessandro Congedo
     * @param name stringa indicante nome dell'attributo
     * @param index intero indicante l'indice
     * Costruttore dell'attributo.
     */
    protected Attribute(String name, int index){
        this.name = name;
        this.index = index;
    }

    /**
     * @author Raffaele Di Anna, Alessandro Carella, Alessandro Congedo
     * @return name stringa indicante il nome
     * Restituisce il nome
     */
    public String getName() {
        return name;
    }


    /**
     * @author Raffaele Di Anna, Alessandro Carella, Alessandro Congedo
     * Restituisce l'indice
     */
    public int getIndex() {
        return index;
    }


    /**
     * @author Raffaele Di Anna, Alessandro Carella, Alessandro Congedo
     */
    public String toString() {
        return name;
    }
}