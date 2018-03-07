package orderedStructures;

public class Geometric extends Progression {

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

}
