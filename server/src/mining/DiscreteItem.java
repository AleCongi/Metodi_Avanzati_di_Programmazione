package mining;

import data.*;

import java.io.Serializable;

public class DiscreteItem extends Item implements Serializable {

        protected DiscreteItem(DiscreteAttribute attribute, String value) {
            super(attribute,value);
        }

    public boolean checkItemCondition(Object value){
        return this.getValue().equals(value);
    }
}

