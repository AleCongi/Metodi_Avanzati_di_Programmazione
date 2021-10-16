package mining;

import java.io.Serializable;

public class EmergingPattern extends FrequentPattern implements Serializable {

    private float growrate;

    //METODI

    protected EmergingPattern(FrequentPattern fp,float growrate){
        super(fp);
        setGrowrate(growrate);
    }

    public float getGrowrate() {
        return growrate;
    }

    protected void setGrowrate(float growrate) {
        this.growrate = growrate;
    }

    public String toString(){
    return (super.toString() + " " + "["+growrate+"]");
    }

}
