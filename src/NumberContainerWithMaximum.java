
//class that inherits from Number Container

public class NumberContainerWithMaximum extends NumberContainer {

	private Number maximum; 
	
	
	void store(Number element) {
		super.store(element); 
		
		if ((maximum == null) || element.doubleValue() > maximum.doubleValue()) {
			
			maximum = element.doubleValue(); 
		}
			
		
	}
	
	public Number getMaximum() {
		
		return maximum; 
		
		
	}
	
	
}
