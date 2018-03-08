package orderedStructures;

import interfaces.Combinable;

public class Geometric extends Progression implements Combinable {

	private double commonFactor; 
	
	public Geometric(double firstValue, double commonFactor) { 
		super(firstValue); 
		this.commonFactor = commonFactor; 
	}
	
	@Override
	public double nextValue() {
		if(super.executed = false) {
			throw new IllegalStateException("The method firstValue has not runned yet."); }
		current = current * commonFactor; 
		return current;
	}
	
	@Override
	public String toString() {
		return "Geom("+ this.firstValue() + "," + this.commonFactor+ ")";
	}
	
	@Override
	public double getTerm(int n) {
		if (n <= 0) 
			throw new IndexOutOfBoundsException("getAllTerm: Invalid argument value = " + n);
		
		return this.firstValue() * Math.pow(this.commonFactor, n-1);
	}
	
    public boolean equals(Object o) {
        Geometric geo = new Geometric(this.firstValue(), this.commonFactor);
        if (o instanceof Geometric) {
            if (geo.toString().equals(o.toString())) {
                return true;
            } else
                return false;
        } else
            return false;
    }

	@Override
	public Progression addProg(Progression other) {
		return null;
	}

	@Override
	public Progression subtractProg(Progression other) {
		return null;
	}

}
