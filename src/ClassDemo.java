
public class ClassDemo {
	
	static String good = "Test";
	static int home = 10;
	static int Test=123;
	public static void main(String[] args) {

		
	    String hello = "Times Hello";
	   
		
				System.out.println("1 "+hello);
				System.out.println("2 "+good);
				System.out.println("3 "+home);
				System.out.println("4 "+Test);
				
			carClass c1= new carClass();
			carClass c2 = new carClass();
			
			//c1.model = "Mazda";
			//c2.year = 2010;
			System.out.println(c1.year);
			System.out.println(c1.getYear());	
	}

	
	 
}

class carClass {
	
	int year = 2100;
	String model;
	
	public int getYear(){
		return this.year;
	}
	
	
	
}