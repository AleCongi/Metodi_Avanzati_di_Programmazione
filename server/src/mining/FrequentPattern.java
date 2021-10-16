package mining;

import data.*;

import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class FrequentPattern implements Iterable<Item>, Comparable<FrequentPattern>, Serializable {

	/**
	 * @uml.property  name="fp"
	 * @uml.associationEnd  multiplicity="(0 -1)"
	 */
	private List<Item> fp;



	/**
	 * @uml.property  name="support"
	 */
	private float support;
	
	
	public FrequentPattern(){
		fp = new LinkedList<Item>();
	}
	
	// costrutore per copia
	public FrequentPattern(FrequentPattern FP){
		fp = new LinkedList<Item>();

		Iterator<Item> iter = FP.fp.iterator();

		while (iter.hasNext()) {
			Item it = iter.next();
			fp.add(it);
		}

		support=FP.getSupport();
	}


	//aggiunge un nuovo item al pattern
	protected void addItem(Item item)
	{
		fp.add(item);

	}

	public Item getItem(int index){
		return fp.get(index);
	}

	public float getSupport(){
		 return support;
	 }

	 public int getPatternLength(){
		return fp.size();
	 }

	public String toString() {
		String value = "";

		Iterator<Item> iter2 = fp.iterator();
		Iterator<Item> iter = fp.iterator();

		iter2.next();
		while (iter2.hasNext()) {
			value += "(" + iter.next() + ") AND ";
			iter2.next();
		}
		if (fp.size() > 0) {
			value += "(" + fp.get(fp.size() - 1) + ")";
			value += "[" + support + "]";
		}

		return value;
	}

	// Aggiorna il supporto
		 protected float computeSupport(Data data){
			int suppCount=0;
			// indice esempio
			for(int i=0;i<data.getNumberOfExamples();i++){
				//indice item
				boolean isSupporting=true;
				for(int j=0;j<this.getPatternLength();j++)
				{

					if(this.getItem(j) instanceof DiscreteItem){
						DiscreteItem item=(DiscreteItem)this.getItem(j);
						DiscreteAttribute attribute=(DiscreteAttribute)item.getAttribute();
						//Extract the example value
						Object valueInExample=data.getAttributeValue(i, attribute.getIndex());
						if(!item.checkItemCondition(valueInExample)){
							isSupporting=false;
							break; //the ith example does not satisfy fp
						}
					}


					else if(this.getItem(j) instanceof ContinuousItem){												//parte messa da me
						ContinuousItem item=(ContinuousItem) this.getItem(j);
						ContinuousAttribute attribute=(ContinuousAttribute) item.getAttribute();
						//Extract the example value
						Object valueInExample=data.getAttributeValue(i, attribute.getIndex());
						if(!item.checkItemCondition(valueInExample)){
							isSupporting=false;
							break; //the ith example does not satisfy fp
						}
					}





					
				}
				if(isSupporting)
					suppCount++;
			}
			return((float)suppCount)/(data.getNumberOfExamples());
			
		}

	 protected void setSupport(float support) {
		 this.support = support;
	 }

	@Override
	public Iterator<Item> iterator() {
		return null;
	}

	@Override
	public int compareTo(FrequentPattern f) {

		if (this.getSupport() > f.getSupport()) {
			return 1;
		} else if (this.getSupport() < f.getSupport()) {
			return -1;
		} else return 0;
	}

 }
