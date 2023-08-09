package inheritance;

public class text1 {
	
	
	public static void main1(String[] args) {
		
		child1 c = new child1();
		
		c.loan();
		c.bike();
		
		c.house();
		
		c.gold();
		
		c.land();
		
		
	}
	
	public static void main2(String[] args) {
		parent1 c1 = new parent1();
		
		
		c1.house();
		
		c1.gold();
		
		c1.land();
		
		
	} 
	
	public static void main3(String[] args) {
		grandp1 c2 = new grandp1();
		
		
		c2.house();
		
		c2.gold();
		
		c2.land();
		
		
	} 
	
	public static void main4(String[] args) {
		
		grandp1  c3 = new parent1();
		
		c3.house();
		
		c3.gold();
		
		c3.land();
		
	}
	
	public static void main(String[] args) {
		
	child1 c6 = new child1();
	
	grandp1 c6 = new parent1();
		
		c6.house();
		c6.gold();
		
		c6.land();
		
	}
	
	
}
