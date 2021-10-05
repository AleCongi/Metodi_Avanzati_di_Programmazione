package mining;

public class EmergingPattern extends FrequentPattern {

    private float growrate;

    //METODI

    public EmergingPattern(FrequentPattern fp,float growrate){
        super(fp);
        setGrowrate(growrate);
    }

    public float getGrowrate() {
        return growrate;
    }

    public void setGrowrate(float growrate) {
        this.growrate = growrate;
    }

    public String toString(){
    return (super.toString() + " " + "["+growrate+"]");
    }



}
