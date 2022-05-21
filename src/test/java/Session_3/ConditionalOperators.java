package Session_3;

public class ConditionalOperators {
	
	public static void main(String[] args) {
		
		// Compare and validate between 2 or more values
		
		// == : Comparison operator
		// >  :
		// <  :
		// >= :
		// <= :
		// != : not
		// && : and
		// || : or
		
		// Ex - 1
		int a = 10;
		int b = 20;
		
		if(b>a)
		{
			System.out.println("b is greater than a");
		}
		else
		{
			System.out.println("a is greater than b");
		}
		
		System.out.println("-----------------------------------------------");
		
		if(b == a)
		{
			System.out.println("both values are same");
		}
		else if(b>a)
		{
			System.out.println("b is greater than a");
		}
		else
		{
			System.out.println("a is greater than b");
		}
		
		System.out.println("-----------------------------------------------");
		
		if(b >= a)
		{
			System.out.println("b is either greater or equal to a");
		}
		else
		{
			System.out.println("a is greater than b");
		}
		
		System.out.println("-----------------------------------------------");
		
		int total = 100;
		if(!(total == 0))
		{
			System.out.println("you are eligible for 10 % discount");
		}
		else
		{
			System.out.println("you are not eligible for discount");
		}
		
		System.out.println("-----------------------------------------------");
		
		if(true)
		{
			System.out.println("Hi there");
		}
		else
		{
			System.out.println("Bye");
		}
		
		System.out.println("-----------------------------------------------");
		
		// nested if
		
		int num = 15; // 17 -> num should be greater than 10 and then check if it is 15 or 17 otherwise say its less than or equal to 10
		if(num == 15)
		{
			if(num == 15)
			{
				System.out.println("number is equal to 15");
			}
			if(num == 17)
			{
				System.out.println("number is equal to 17");
			}
		}
		else
		{
			System.out.println("number is less than 10 or equal to 10");
		}
		
		System.out.println("-----------------------------------------------");
		
		int number = 10; 
		
		if(number == 10)
		{
			System.out.println("number is 10");
		}
		else if(number == 20)
		{
			System.out.println("number is 20");
		}
		else if(number == 30)
		{
			System.out.println("number is 30");
		}
		else
		{
			System.out.println("no number found");
		}
		
		System.out.println("-----------------------------------------------");
		
		//WAP to find highest from 3 numbers
		
		int x = 100;
		int y = 200;
		int z = 300;
		
		if(x>y && x>z) // true true = true, false <-> true = false, false false = false
		{
			System.out.println("x is highest");
		}
		else if(y>z)
		{
			System.out.println("y is highest");
		}
		else 
		{
			System.out.println("z is highest");
		}
		
		System.out.println("-----------------------------------------------");
		
		String UserName = "Abhishek";
		// 2 dev - Tom and Peter 
		// 2 QA  - Steve and Joe
		
		// for dev
		if(UserName == "Tom" || UserName == "Peter") // true or true = true, false or true = true, false or false = false
		{
			System.out.println("Hi dev " + UserName);
			System.out.println("How can I help you?");
		}
		// for QA
		else if(UserName == "Steve" || UserName == "Joe")
		{
			System.out.println("Hi QA " + UserName);
			System.out.println("How can I help you?");
		}
		// for apart from dev and QA
		else
		{
			System.out.println("Hi " + UserName);
			System.out.println("How can I help you?");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
