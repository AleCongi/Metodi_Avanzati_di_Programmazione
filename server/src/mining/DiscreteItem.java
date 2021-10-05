package mining;

import data.*;

class DiscreteItem extends Item {

        public DiscreteItem(DiscreteAttribute attribute, String value) {
            super(attribute,value);
        }


    public boolean checkItemCondition(Object value){
        return this.getValue().equals(value);
    }



    }

