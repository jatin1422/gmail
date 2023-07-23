
public class callmethod {

	String name;
	String age;
	
	
	public callmethod(String name,String age){

		this.name = name;
	     this.age=age;
	     
		
	}
	
    public void setname(String name) {
		
    	this.name = name;
    	
    }
    
    public void setage(String age) {
    	
    	this.age=age;
    	
    }
    
    public String getname() {
    	return name;
    }
    
    public String getage() {
    	
    	return age;
    }
    
    static callmethod setname(callmethod name3) {
    	
    	callmethod newname = new callmethod("jatin",name3.getage());
    	
    	
   return newname;
    	
    	
    	
    
    }
	
	
	public static void main(String[] args) {
		
		callmethod s = new callmethod("jatin3","89");
		
		callmethod retu = setname(s);
		System.out.println(retu.getname());
		
		System.out.println(s.getname());
		
		s.setname("jat in");
		System.out.println(s.getname());
	

	}

}
