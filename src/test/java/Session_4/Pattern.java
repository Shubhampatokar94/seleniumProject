package Session_4;

public class Pattern {

	public static void main(String[] args) {
		
		// *
		// **
		// ***
		// ****
		
		for(int i=1; i<=4; i++) // Printing the Columns
		{
			for(int j=1;j<=i;j++) // Printing rows
			{
				System.out.print(" * ");
			}
			System.out.println();
		}

	}

}
