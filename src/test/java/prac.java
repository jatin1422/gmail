import java.util.ArrayList;
import java.util.List;

public class prac {
	public static void main(String[] args) {

	List<Integer> list = new ArrayList<>(9);
	
	list.add(9);
	list.add(8);
	list.add(8);
	try {
	System.out.println(list.get(9));}
	
	catch(Exception e) {
		
	}
	for(int a : list) {
		System.out.println(a);
	}
	}
	
}
