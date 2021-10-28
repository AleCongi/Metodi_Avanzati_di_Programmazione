package mining;

import data.*;

import java.io.Serializable;

public abstract class Item implements Serializable {

    private Attribute attribute;                    //attributo coinvolto nell'item
    private Object value;                           //valore assegnato all'attributo


    /**
     * @author Raffaele Di Anna, Alessandro Carella, Alessandro congedo
     * @param attribute oggetto di tipo Attribute
     * @param value oggetto indicante il valore
     * costruttore di Item
     */
    public Item(Attribute attribute, Object value){
     this.attribute=attribute;
     this.value=value;
    }

    /**
     * @author Raffaele Di Anna, Alessandro Carella, Alessandro congedo
     * restituisce l'attributo di Item
     */
    public Attribute getAttribute() {
        return attribute;
    }

    /**
     * @author Raffaele Di Anna, Alessandro Carella, Alessandro congedo
     * restituisce il valore di Item
     */
    public Object getValue() {
        return value;
    }

    /**
     * @author Raffaele Di Anna, Alessandro Carella, Alessandro congedo
     * @param value oggetto indicante il valore
     * metodo astratto per verificare che il valore rispetti una determinata condizione.
     *
     */
    public abstract boolean checkItemCondition(Object value);

    /**
     *
     */
    public String toString(){
            return attribute+"="+value;
    }

}
