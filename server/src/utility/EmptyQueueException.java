package utility;

public class EmptyQueueException extends Exception{
    public EmptyQueueException(){
        super("La lista è vuota");
    }
}