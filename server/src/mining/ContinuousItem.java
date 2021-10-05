package mining;

import data.ContinuousAttribute;

import java.io.Serializable;

public class ContinuousItem extends Item {

    public ContinuousItem(ContinuousAttribute attribute, Interval value) {
        super(attribute, value);
    }

    public boolean checkItemCondition(Object value){
        return ((Interval) (this.getValue())).checkValueInclusion((float) value);
    }

    public String toString(){
        String output = "";
        output += getAttribute() + " in " + (Interval) this.getValue();
        return output;
    }

}
