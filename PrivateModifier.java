package ProjectsAssig.Java;

    class priaccessspecifier 
	{ 
	   private void display()          //only visible inside the class
	    { 
	        System.out.println("You are using private access specifier"); 
	    } 
	} 

	public class  PrivateModifier {
		public static void main(String[] args) {
		   System.out.println("Private Access Specifier");
			priaccessspecifier  obj = new priaccessspecifier(); 
		}
	}


