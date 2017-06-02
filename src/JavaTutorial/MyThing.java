package JavaTutorial;



public class MyThing
{	
	
	public static void main (String[]args) throws Exception{
		
		message(" Anna");
		
		int total;
		
		total = numbers(3,4);

		System.out.println(total );
		
		int good;
		
		good = testFunction(5,5);
		
		System.out.println(good);

		System.out.println(good);

	}
	
	public static void message (String name) {

		 System.out.println( "Hi" + name );	
	 
		 /*	int a=5;
		int b=6;
		
		System.out.println(a-b);
		*/
		
}
  public static int numbers(int a3, int a2)	{
	  // System.out.println(x1 + a2);
	  return a3 + a2;
	   
   }

  public static int testFunction ( int hello, int hello2){
	  return hello + hello2;
  
  // System.out.println("Test " + hello);
  
   }

}
