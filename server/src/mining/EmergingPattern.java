package mining;

import java.io.Serializable;

public class EmergingPattern extends FrequentPattern implements Serializable {

    private float growrate;


    /**
     * @author Raffaele Di Anna, Alessandro Carella, Alessandro congedo
     * @param fp FrequentPattern
     * @param growrate valore reale indicante il growrate
     * costruttore dell'EmergingPattern che richiama il super e setta il growrate
     */
    protected EmergingPattern(FrequentPattern fp,float growrate){
        super(fp);
        setGrowrate(growrate);
    }


    /**
     * @author Raffaele Di Anna, Alessandro Carella, Alessandro congedo
     * restituisce il growrate
     */
    public float getGrowrate() {
        return growrate;
    }


    /**
     * @author Raffaele Di Anna, Alessandro Carella, Alessandro congedo
     * @param growrate valore reale indicante il growrate
     * imposta il growrate
     */
    protected void setGrowrate(float growrate) {
        this.growrate = growrate;
    }

    public String toString(){
    return (super.toString() + " " + "["+growrate+"]");
    }

}
