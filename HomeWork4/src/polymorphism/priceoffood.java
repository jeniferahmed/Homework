package polymorphism;

public class priceoffood {
//Overloading
	
	public void expensive (int a, int b, int c) {
		System.out.println("price "+ (a+b+c));
	}
		
	public void expensive (double x, double y) {
		System.out.println("More expensive " + x*y);
	}
	

}
