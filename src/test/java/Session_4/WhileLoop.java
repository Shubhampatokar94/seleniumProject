package Session_4;

public class WhileLoop {

	public static void main(String[] args) {
		
		// 1 to 5
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);
		
		System.out.println("------------------------------------------");
		
		System.out.print(1 + " ");
		System.out.print(2 + " ");
		System.out.print(3 + " ");
		System.out.print(4 + " ");
		System.out.print(5 + " ");
		
		System.out.println("-------------------------------------------");
		
		// Print from 1 to 10
		// While loop
		int i = 1; // Start point		
		while(i<=10) // Condition
		{
			System.out.println(i);
			//i++;
			//++i;
			i = i+1; // i++ or ++i
		}
		System.out.println("-------------------------------------------");
		
		int j = 1;
		while(j<=10)
		{
			System.out.println(j);
			
			if(j == 9)
			{
				System.out.println("Hay This is five");
				break;
			}
			
			j++; // Increment
		}
		
		System.out.println("-------------------------------------------");
		
		
		boolean isCashIsReceived = true;
		
		int amount = 250;
		
		while(isCashIsReceived)
		{
			System.out.println("Your bill is paid successfully with amount -> " + amount);
			System.out.println("Thank you !!!");
			
			isCashIsReceived = false;
		}

	}

}
