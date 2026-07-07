import java.util.ArrayList;

public class Lab201 {

	public static void main(String[] args) 
	{
		ArrayList<String> names = new ArrayList<String>();
		
		System.out.println("Length = " + names.size());
		
		names.add("Alice");
		names.add("Emma");	
		names.add("Leon");	
		names.add("John");	
		
		System.out.println("Length = " + names.size());
		System.out.println(names);
	}

}
