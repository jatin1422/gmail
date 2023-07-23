
public class Starpattern {

	public static void main(String[] args) {
		
		String a [][]= {{" "," ","*"," "," "},{" ","*","*","*"," "},{"*","*","*","*","*"},{" ","*","*","*"," "},{" "," ","*"," "," "}};
		
		
		
		for(int i =0 ; i<a.length;i++) {
		
			for(int j= 0 ; j<a.length;j++) {
				System.out.print(a[i][j]);
			}
		System.out.println();
		}
		
		
		

	}

}
