
public class NumberContainerWithMaximumTest {
	
	
	
	
	public static void main(String[] args) {
		
		
		
		NumberContainerWithMaximum ncm = new NumberContainerWithMaximum(); 
		
		
		
		ncm.store(123455); //autoboxing
		ncm.store(12345);
		ncm.store(1234);
		ncm.store(123);
		ncm.store(12345634);


		
		System.out.print(ncm.getMaximum()); 
		
		
		
	}
	

}
