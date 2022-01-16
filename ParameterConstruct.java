package ProjectsAssig.Java;
public class ParameterConstruct{  
    int id;  
    String name;  
     public ParameterConstruct(){   
    	System.out.println("inside");
    }  
    public ParameterConstruct(int i,String n){  
	    id = i;  
	    name = n;  
    }  
     public void display()
    {
    	System.out.println(id+" "+name);
    }  
    public static void main(String args[]){
    ParameterConstruct s1 = new ParameterConstruct(654,"Ravi");  
    ParameterConstruct s2 = new ParameterConstruct(655,"Kiran");  
    s1.display();  
    s2.display();  
   }  
}  