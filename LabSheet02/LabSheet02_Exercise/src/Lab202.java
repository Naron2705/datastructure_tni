import java.util.ArrayList;
import java.util.Scanner;

public class Lab202 {

	public static void main(String[] args) 
	{
		
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		 int[] initial_numbers = {10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
		 
		 for(int i : initial_numbers)
		 {
	            numbers.add(i);
	        }
		 int lastID = 6;
		 
		 System.out.print("Enter number index: ");
	     int endValue = scan.nextInt();
	     numbers.add(endValue);
	        
	     System.out.print("Enter number index " + lastID + ": ");
	     int insertValue = scan.nextInt();
	     numbers.add(lastID, insertValue);
	        
	     numbers.remove(lastID);
	     
	     scan.nextLine(); // รับ Enter
	     System.out.print("Enter the class date: ");
	     String day = scan.nextLine();
	     
	     numbers.get(lastID - 1);
	     
	     System.out.println("\nDisplay all data");
	     System.out.println(numbers);
	     
	     

		
		 

	}

}
