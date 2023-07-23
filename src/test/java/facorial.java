import java.util.Scanner;

class facorial {

	int s= 1;
	
		
	public int factorial() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		
	
	
	for(int i= num; i>1;i--) {
		
		s= s*i;
		
	}
		
	System.out.println(s);
	return s;
	
	
	
	}}
	
	


