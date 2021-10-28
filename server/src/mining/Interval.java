package mining;

import java.io.Serializable;

public class Interval implements Serializable {

    private float inf; //estremo inferiore
    private float sup; //estremo superiore


    /**
     * @author Raffaele Di Anna, Alessandro Carella, Alessandro congedo
     * @param inf valore reale indicante l'estremo inf
     * @param sup valore reale indicante l'estremo sup
     * costruttore di Interval
     */
    public Interval(float inf, float sup){
        this.inf=inf;
        this.sup=sup;
    }


    /**
     * @author Raffaele Di Anna, Alessandro Carella, Alessandro congedo
     * @param inf valore reale indicante l'estremo inf
     * permette di impostare il campo inf di Interval uguale ad inf
     */
    protected void setInf(float inf){
        this.inf=inf;
    }


    /**
     * @author Raffaele Di Anna, Alessandro Carella, Alessandro congedo
     * @param sup valore reale indicante l'estremo sup
     * permette di impostare il campo sup di Interval uguale a sup
     */
    protected void setSup(float sup){
        this.sup=sup;
    }

    /**
     * @author Raffaele Di Anna, Alessandro Carella, Alessandro congedo
     * restituisce l'inf di Interval
     */
    public float getInf() {
        return inf;
    }

    /**
     * @author Raffaele Di Anna, Alessandro Carella, Alessandro congedo
     * restituisce il sup di Interval
     */
    public float getSup() {
        return sup;
    }

    /**
     * @author Raffaele Di Anna, Alessandro Carella, Alessandro congedo
     * @param value valore reale indicante il valore
     * restituisce TRUE se valore compreso tra inf e sup altrimenti FALSE
     */
    protected boolean checkValueInclusion(float value){
        return(value>=this.inf && value<this.sup);
    }

    /**
     *
     */
    public String toString(){
        String output ="";
        output += "[" + this.inf + "," + this.sup + "[" ;
        return output;
    }

}
