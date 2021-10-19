package mining;

import data.*;

import java.io.*;
import java.util.Iterator;
import java.util.List;
import java.util.LinkedList;
import utility.ComparatorGrowRate;

public class EmergingPatternMiner implements Iterable<EmergingPattern>, Serializable{

    private List<EmergingPattern> epList=new LinkedList<EmergingPattern>();

    /**
     * @author Raffaele Di Anna, Alessandro Carella, Alessandro congedo
     * @param dataBackground oggetto di tipo data
     * @param fpList oggetto di tipo FrequentPatternMiner
     * @param minG valore reale indicante il minG
     * costruttore dell'EmergingPatternMiner
     */
    public EmergingPatternMiner(Data dataBackground,FrequentPatternMiner fpList, float minG) throws EmptySetException{

        boolean OK = false;

        List temp = fpList.getOutputFP();
        Iterator i = temp.listIterator();
        while (i.hasNext()){
            EmergingPattern var = null;
            try {
                var = computeEmergingPattern(dataBackground, (FrequentPattern) i.next(), minG);
            }catch(EmergingPatternException e){
                System.out.println("");
            }
            if (var != null){
                epList.add (var);
                OK = true;
            }
        }
        epList.sort(new ComparatorGrowRate());
        if(!OK) throw new EmptySetException();
    }


    /**
     * @author Raffaele Di Anna, Alessandro Carella, Alessandro congedo
     * @param dataBackground oggetto di tipo data
     * @param fp oggetto di tipo FrequentPattern
     * restituisce un valore float dopo aver computato il GrowRate
     */
    protected float computeGrowRate(Data dataBackground, FrequentPattern fp){
        return fp.getSupport() / fp.computeSupport(dataBackground);
    }


    /**
     * @author Raffaele Di Anna, Alessandro Carella, Alessandro congedo
     * @param dataBackground oggetto di tipo data
     * @param fp oggetto di tipo FrequentPattern
     * @param minGR valore reale indicante il minGR
     * restituisce un nuovo EmergingPattern dopo aver richiamato computeGrowRate e verificato se superiore o uguale al minGR
     */
    protected EmergingPattern computeEmergingPattern(Data dataBackground, FrequentPattern fp, float minGR) throws EmergingPatternException{
        float growRate = computeGrowRate(dataBackground, fp);
        if (growRate >= minGR)
            return new EmergingPattern (fp, growRate);
        else throw new EmergingPatternException();

    }


    /**
     *
     */
    public String toString() {
        String output = "Emerging patterns\n";
        int i = 0;
        Iterator p = epList.listIterator();
        while (p.hasNext()) {
            output += Integer.toString(i + 1) + ":" + p.next() + "\n";
            i++;
        }
        return output;
    }

    /**
     * iteratore
     */
    @Override
    public Iterator<EmergingPattern> iterator() {
        return null;
    }


    /**
     * @author Raffaele Di Anna, Alessandro Carella, Alessandro congedo
     * @param nomeFile stringa indicante il nome del file
     * permette di salvare l'emerging pattern miner all'interno di un file cosi da permettere la serializzazione
     */
    public void salva(String nomeFile) throws FileNotFoundException, IOException {

        FileOutputStream file = new FileOutputStream(nomeFile + ".dat");

        ObjectOutputStream outStream = new ObjectOutputStream(file);

        outStream.writeObject(this);

    }

    /**
     * @author Raffaele Di Anna, Alessandro Carella, Alessandro congedo
     * @param nomeFile stringa indicante il nome del file
     * permette di caricare da file un emerging pattern miner
     */
    public static EmergingPatternMiner carica(String nomeFile) throws FileNotFoundException, IOException, ClassNotFoundException {

        FileInputStream inFile = new FileInputStream(nomeFile + ".dat");
        ObjectInputStream inStream = new ObjectInputStream(inFile);
        EmergingPatternMiner ep  = (EmergingPatternMiner) inStream.readObject();
        return ep;
    }


}