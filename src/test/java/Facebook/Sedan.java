package Facebook;

class Fouwheels{
	
	
	
	int gear;
	int speed;
	
	public Fouwheels(int gear , int speed) {
	
	}
	
	 

	public void startgear1(int gear) {
		this.gear = gear;
		System.out.println(gear);
		
	}
	
public 	void speed3(int speed) {
	System.out.println	(this.speed = speed);
		
	}
	
}

 class brezza extends Fouwheels{
	 
	int volume;
	public  brezza(int gear , int speed,int volume) {
			super(gear,speed);
			
		this.volume = volume;
			
	}
	
	
	
	public void music() {
	
		System.out.println(volume);
		 super.startgear1(0);
		 super.speed3(4);
	}
	 
	public void newspeed(int speed2) {
		System.out.println(speed= speed+speed2);
	}
 }








public class Sedan {

	public static void main(String[] args) {
		
		brezza f = new brezza(5,9,4);
		
		f.music();
		f.startgear1(4);
		f.newspeed(4);
		

		

	}

}
