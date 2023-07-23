
public class fibonacci {

	public static void main(String[] args) {

		int n = 0,n1=1,n3;
		
		System.out.print(n+" "+n1+" ");
		for(int i = 2 ; i<10; i++ ) {
			
			n3=n+n1;
			n= n1;
			n1=n3;
			
			System.out .print(n3+" ");
		}
	}

}
