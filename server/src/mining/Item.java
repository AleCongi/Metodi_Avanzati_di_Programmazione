package mining;

import data.*;

import java.io.Serializable;

public abstract class Item implements Serializable {

    private Attribute attribute;                    //attributo coinvolto nell'item
    private Object value;                           //valore assegnato all'attributo

//METODI

    public Item(Attribute attribute, Object value){
     this.attribute=attribute;
     this.value=value;
    }

    public Attribute getAttribute() {
        return attribute;
    }

    public Object getValue() {
        return value;
    }

    public abstract boolean checkItemCondition(Object value);

    public String toString(){
            return attribute+"="+value;
    }

}
