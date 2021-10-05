package mining;

import data.*;

import java.io.*;
import java.util.Iterator;
import java.util.List;
import java.util.LinkedList;
import utility.ComparatorGrowRate;

public class EmergingPatternMiner implements Iterable<EmergingPattern>, Serializable{

    private List<EmergingPattern> epList=new LinkedList<EmergingPattern>();

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

    float computeGrowRate(Data dataBackground, FrequentPattern fp){
        return fp.getSupport() / fp.computeSupport(dataBackground);
    }

    EmergingPattern computeEmergingPattern(Data dataBackground, FrequentPattern fp, float minGR) throws EmergingPatternException{
        float growRate = computeGrowRate(dataBackground, fp);
        if (growRate >= minGR)
            return new EmergingPattern (fp, growRate);
        else throw new EmergingPatternException();

    }

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

    @Override
    public Iterator<EmergingPattern> iterator() {
        return null;
    }

    public void salva(String nomeFile) throws FileNotFoundException, IOException {

        FileOutputStream file = new FileOutputStream(nomeFile + ".dat");

        ObjectOutputStream outStream = new ObjectOutputStream(file);

        outStream.writeObject(this);

    }

    public static EmergingPatternMiner carica(String nomeFile) throws FileNotFoundException, IOException, ClassNotFoundException {

        FileInputStream inFile = new FileInputStream(nomeFile + ".dat");
        ObjectInputStream inStream = new ObjectInputStream(inFile);
        EmergingPatternMiner ep  = (EmergingPatternMiner) inStream.readObject();
        return ep;
    }


}