package Session_7;

import java.util.ArrayList;

public class ArrayListRawType {

	public static void main(String[] args) {
		
		ArrayList ar = new ArrayList();
		
		int arrayListSize = ar.size();
		System.out.println(arrayListSize);
		System.out.println(ar.size());
		
		System.out.println("------------------------------------");
		
		ar.add(100); // 0
		ar.add(200); // 1
		ar.add("test"); // 2
		
		System.out.println(ar.size());
		
		ar.add(400); // 3
		ar.add(500); // 4
		System.out.println(ar.size());
		
		for(int i=0; i<ar.size(); i++)
		{
			System.out.println(ar.get(i));
		}
		
		System.out.println("-------------------------------------");
		System.out.println(ar.get(2));
		//System.out.println(ar.get(6));
		
		ar.remove(3);
		System.out.println("-------------------------------------");
		System.out.println(ar.size());
		
		for(int j=0; j<ar.size(); j++)
		{
			System.out.println(ar.get(j));
		}
		System.out.println("-------------------------------------");
		// 100 200 test 500
		for(int i=0; i<ar.size(); i++)
		{
			if(ar.get(i).equals("test"))
			{
				System.out.println("Yes I got \"test\" in the ar arrayList at index position " + i);
			}
			
			
		}
		
		
		
		
		
		
		
		
		
 
	}

}
