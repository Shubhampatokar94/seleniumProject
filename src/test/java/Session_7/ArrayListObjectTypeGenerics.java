package Session_7;

import java.util.ArrayList;

public class ArrayListObjectTypeGenerics {

	public static void main(String[] args) {
		
		ArrayList<Object> ar = new ArrayList<Object>();
		
		ar.add(100); // 0
		ar.add(200); // 1
		ar.add("test"); // 2
		ar.add(true);
		ar.add(12.33);
		ar.add("!");
		
		for(int i=0;i<ar.size();i++) 
		{
			System.out.println(ar.get(i));
		}
		
		

	}
	
	
	// Data types
	// Array
	// Array Object Type
	// ArrayList
	//ArrayList Generic Type
	// ArrayList Object Generic Type
	

}
