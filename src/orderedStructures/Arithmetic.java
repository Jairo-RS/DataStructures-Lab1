package orderedStructures;

public class Arithmetic extends Progression {
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

}
