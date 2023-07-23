
public class again {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number = 12354,reverse =0;
		
		while(number!=0) {
			
			int remainder = number%10;
			reverse = reverse*10+remainder;
			number = number/10;
			
			
		}
		System.out.print(reverse);

	}

}
