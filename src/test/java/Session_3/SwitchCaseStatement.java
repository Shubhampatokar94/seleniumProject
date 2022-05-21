package Session_3;

public class SwitchCaseStatement {

	public static void main(String[] args) {
		
		// Without switch case compare and print value from 1 to 5
		
		int num = 1; // 1 - 5
		
		if(num == 1)
		{
			System.out.println("Number is one");
		}
		else if(num == 2)
		{
			System.out.println("Number is two");
		}
		else if(num == 3)
		{
			System.out.println("Number is three");
		}
		else if(num == 4)
		{
			System.out.println("Number is four");
		}
		else if(num == 5)
		{
			System.out.println("Number is five");
		}
		else
		{
			System.out.println("Number is out of range from 1 to 5");
		}
		
		// With switch case compare and print value from 1 to 5
		int number = 2;
		
		switch(number) {
		
		case 1 :
			    System.out.println("Number is one");
			    break;
		case 2 :
			    System.out.println("Number is two");
			    break;
		case 3 :
		        System.out.println("Number is three");
		        break;
		case 4 :
		        System.out.println("Number is four");
		        break;
		case 5 :
		        System.out.println("Number is five");
		        break;
		default:
			    System.out.println("Number is out of range from 1 to 5");
			    break;
		}
		
		System.out.println("-----------------------------------------------");
		
        int p = 2;
		
		switch(p) {
		
		case 1 :
			    
		case 2 :
			    System.out.println("Hello");
			    break;
		case 3 :
		        
		case 4 :
		        System.out.println("Hi");
		        break;
		default:
			    break;
		}
			    
		System.out.println("-----------------------------------------------");
		
		String browser = "chrome"; // chrome or firefox then it should print the browser name if its apart from these 2 type its implemented yet.
		
		switch(browser) {
		
		case "chrome" :
			           System.out.println("chrome browser got invoked");
			           break;
		case "firefox" :
			           System.out.println("Firefox browser got invoked");
			           break;
	    default:
	    	           System.out.println("Browser is unavailable");
	    	           break;
		}
		
		
		
	}

}

