package mining;

import java.io.Serializable;

public class Interval implements Serializable {

    private float inf; //estremo inferiore
    private float sup; //estremo superiore

    public Interval(float inf, float sup){
        this.inf=inf;
        this.sup=sup;
    }

    protected void setInf(float inf){
        this.inf=inf;
    }

    protected void setSup(float sup){
        this.sup=sup;
    }

    public float getInf() {
        return inf;
    }

    public float getSup() {
        return sup;
    }

    protected boolean checkValueInclusion(float value){
        return(value>=this.inf && value<this.sup);
    }

    public String toString(){
        String output ="";
        output += "[" + this.inf + "," + this.sup + "[" ;
        return output;
    }

}
