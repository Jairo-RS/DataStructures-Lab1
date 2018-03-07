package orderedStructures;

public class Fibonacci extends Progression {

	private double prev;
	
	public Fibonacci() { 
		this(1); 
		prev = 0; 
	}
	private Fibonacci(double first) {
		super(first);
	}

	@Override
	public double nextValue() {
		if(super.executed = false) {
			throw new IllegalStateException("The method firstValue has not runned yet."); }
		
		double value = prev;
		prev = current;
		current += value;
		return current;
	}
	
	@Override	
	public double firstValue() { 
		double value = super.firstValue(); 
		prev = 0;
		return value; 
	}

}

