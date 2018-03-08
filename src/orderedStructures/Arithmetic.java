package orderedStructures;

import interfaces.Combinable;

public class Arithmetic extends Progression implements Combinable {
	private double commonDifference; 
	
	public Arithmetic(double firstValue, double commonDifference) { 
		super(firstValue); 
		this.commonDifference = commonDifference; 
	}
	
	@Override
	public double nextValue() {
		if(super.executed = false) {
			throw new IllegalStateException("The method firstValue has not runned yet."); }
		current = current + commonDifference; 
		return current;
	}
	
	@Override
	public String toString() {
		return "Arith("+ this.firstValue() + "," + this.commonDifference+ ")";
	}
	
	@Override
	public double getTerm(int n) {
		if (n <= 0) 
			throw new IndexOutOfBoundsException("getAllTerm: Invalid argument value = " + n);
		
		return this.firstValue() + this.commonDifference*(n-1);
	}
	
    public boolean equals(Object o) {
        Arithmetic arith = new Arithmetic(this.firstValue(), this.commonDifference);
        if (o instanceof Arithmetic) {
            if (arith.toString().equals(o.toString())) {
                return true;
            } else
                return false;
        } else 
            return false;
    }
    
    @Override
    public Progression addProg(Progression other) {
    	double otherCommonDiff = other.getTerm(2) - other.getTerm(1);
		return new Arithmetic(this.firstValue()+other.firstValue(), this.commonDifference+otherCommonDiff);
    }

	@Override
	public Progression subtractProg(Progression other) {
		double otherCommonDiff = other.getTerm(2) - other.getTerm(1);
		return new Arithmetic(this.firstValue()-other.firstValue(), this.commonDifference-otherCommonDiff);
	}

}
