package Session_4;

public class ForLoop {

	public static void main(String[] args) {
		
		// 1 to 10 
		//for(start point; condition; increment/decrement)
		for(int i = 1; i<=10; i++)
		{
			System.out.println(i);
		}
		
		for(int i = 10; i>=0; i--)
		{
			System.out.println(i);
		}
		
		System.out.println("------------------------------------------------");
		
		
		// 0 to 20 even numbers only
//		for(int even = 1; even<=20; even = even+2)
//		{
//			System.out.println(even);
//		}
		
		for(int j = 0; j<=20; j++)
		{
			if(j % 2 == 0)
			{
				System.out.println(j);
			}
		}
		
		System.out.println("------------------------------------------------");

	}

}
