
public class LeapYear {

	public static void main(String[] args) {
		int year=2020;
		if(year%4==0 && year%100!=0) {
			System.out.println(+year+" Year is Leap year ");
		}
		else {
			System.out.println(+year+" Year is not Leap year ");
		}

	}

}