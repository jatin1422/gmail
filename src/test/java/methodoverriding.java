
 class mobile1{
	 String name;
	 int version;
	 
/*	 public mobile1(String name , int version){
		 
		 this.name=name;
		 this.version= version ;
	 }*/
	 
	 public void mobilename(String name) 
	 
	 {
		 this.name = name;
		 
		 System.out.println(name);
		 
	 }
	 
	 public void mobileversion(int version) {
		 this.version=version;
		 
		 System.out.println(version);
	 }
	 
	 
	 
	 
 }


 class newmobile extends mobile1{

	

	@Override
 public void mobilename(String name) 
	 
	 {
		int a = 34;
		
		
		 System.out.println(a+name);
		 super.mobilename("jatin");
	 }
	 @Override
	 public void mobileversion(int version) {
		 
		 this.version=version;
		 System.out.println(version);
	 }
	 
	
	
	 
 }




public class methodoverriding {

	public static void main(String[] args) {

		
		
	mobile1 ne = new newmobile();
	
		ne.mobilename("wednesday");
		ne.mobileversion(90094494);
		
		
	}

}
