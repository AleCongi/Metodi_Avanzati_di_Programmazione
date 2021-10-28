package utility;

public class EmptyQueueException extends Exception{

    /**
     * @author Raffaele Di Anna, Alessandro Carella, Alessandro congedo
     * costruttore dell'eccezione che richiama super
     */
    public EmptyQueueException(){
        super("La lista è vuota");
    }
}