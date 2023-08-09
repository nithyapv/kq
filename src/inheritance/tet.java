package inheritance;

public class tet {
	
	public static void main1(String[] args) {
		
	
	
	child c = new child();
	
	
	
	c.bike();
	
	c.loan();
	
	c.gold();
	
	c.house();
	

}
	
	public static void main(String[] args) {
		
		child c = new child();// sub class reference can holding sub class object
		
		parent p = new parent(); //super class referenece can holding super class object
		
		
		//child c = new parent();   //sub class reference cannot hold super class object
		
		//super class reference can hold sub class object

		
		parent h = new child();  		
		h.house();
		
	}
	
	public static void main1(String[] args) {
		//grand parent object can call parent and child object but only access grand parent properties
		
		// and also if both sub class and parent class will have same method or variable and it will access child method or variable
		
		grandp f = new grandp();
		
		f.land();
		
		
				
		grandp  q = new child();
		
		q.house();
		
		q.land();
		
		parent t1 = new child();
		
		t1.house();
		
 grandp  r = new parent();
		
		r.land(); 
		r.gold();

		
		
		
		
	}

}