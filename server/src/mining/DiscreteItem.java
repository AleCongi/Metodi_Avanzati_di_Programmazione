package mining;

import data.*;

import java.io.Serializable;

public class DiscreteItem extends Item implements Serializable {


    /**
     * @author Raffaele Di Anna, Alessandro Carella, Alessandro congedo
     * @param attribute DiscreteAttribute
     * @param value stringa indicante il valore
     * costruttore richiamante il super
     */
        protected DiscreteItem(DiscreteAttribute attribute, String value) {
            super(attribute,value);
        }


    /**
     * @param value oggetto di cui effettuare il controllo
     * restituisce vero o falso se il valore coincide
     */
    public boolean checkItemCondition(Object value){
        return this.getValue().equals(value);
    }
}

