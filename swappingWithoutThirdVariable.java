public class SwappingNumber {

	public static void main(String[] args) {
		int a=13,b=17;
		System.out.println("Before swapping Number is"+" a=" +a +" and "+" b="+b);
		
		a=a+b;  //a=30; 
		b=a-b;   //b=13;
		a=a-b;    //a=17
		
		 
		 System.out.println("After swapping Number is"+" a=" +a +" and "+" b="+b);
	   
		
	}

}
