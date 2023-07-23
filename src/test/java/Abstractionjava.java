

 abstract class car{
	 
	
	 public car() {
		 System.out.println("whoho");
	 }
	 void name(String carname) {
		 System.out.println(carname);
	 }
	  
	 abstract void price();
	 abstract void milague();
	 
	
 }

class description extends car{

	description(){
		System.out.println("java");
	}
	
	
	@Override
	void price() {
		
		System.out.println("new car price is 700");
	}

	@Override
	void milague() {
		
		
	}

	
}
class maruti extends car{

	public maruti(int cars)
	{
		System.out.println("Number of car is "+cars);
	}
	
	@Override
	void price() {
		System.out.println("price of maruti car is 900000rS");
		
	}

	@Override
	void milague() {
		// TODO Auto-generated method stub
		
	}
	
}

public class Abstractionjava {

	public static void main(String[] args) {
		
		car c = new description();
		c.price();
		c.milague();
		c.name("safari");
		
		car n = new maruti(4);
n.price();
		


	}

}
