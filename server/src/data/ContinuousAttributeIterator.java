package data;

import java.io.Serializable;
import java.util.Iterator;

public class ContinuousAttributeIterator implements Iterator<Float>, Serializable {

	private float min;
	private float max;
	private int j=0;
	private int numValues;
	
	ContinuousAttributeIterator(float min,float max,int numValues){
		this.min=min;
		this.max=max;
		this.numValues=numValues;
	}
	
	@Override
	public boolean hasNext() {
		
		return (j<=numValues);
	}

	public Float next() {

		j++;
		return min+((max-min)/numValues)*(j-1);
	}

	public void remove() {}

}
