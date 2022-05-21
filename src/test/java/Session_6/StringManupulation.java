package Session_6;

public class StringManupulation {

	public static void main(String[] args) {
		
		String str1 = "Hello Everyone lets learn something about Strings";
		int lengthOfStr1 = str1.length();
		System.out.println("Length of String is - " + (lengthOfStr1+10));
		
		System.out.println("Length of String is - " + (str1.length()+10));
		
		String str2 = "I am learning String in Java ";
		
		System.out.println("Char at 2nd index position is - " + str2.charAt(2));
		System.out.println((str2.length()));
        System.out.println("Char at 48th index position is - " + str2.charAt(48));
        
        String str3 = "Hello there";
        System.out.println(str3.length());
        System.out.println("Index number of char 'e' in str3 is : " + str3.indexOf('e'));
        System.out.println("Index number of char 'e' 2nd occurance is : " + str3.indexOf('e', 7));
        System.out.println("Index number of char 'e' 2nd occurance is : " + str3.indexOf('e', str3.indexOf('e')+1));
        
        String str4 = "Github is acquired by microsoft in year 2018";
        System.out.println("Index number for word by in string str4 is : " + str4.indexOf("year"));
        System.out.println("Index number for word apple in string str4 is : " + str4.indexOf("z"));
        
        String str5 = " Selenium is used to automate web applications";
        System.out.println(str5.toUpperCase());
        
        String str6 = "SELENIUM CANNOT AUTOMATE DEXTop appLICATION";
        System.out.println(str6.toLowerCase());
        
        String str7 = "          Selenium is a free automation tool     ";
        System.out.println("After removing white spaces from string \"str7\" output is : " + str7.trim());
        // "After removing white spaces from
        //string "str7" output is : Selenium is a free automation tool
        
        
        String str8 = "15/11/2021"; //15:11:2021 15#11#2021
        System.out.println(str8.replace('/', ':'));
        System.out.println(str8.replace('/', '#'));
        String temp = "Hello there I am looking forward for your reply Hello";
        System.out.println(temp.replace("Hello", "Hi"));
        
        String str9 = "Selenium can handle html code";
        System.out.println("is the word is available in the string str9 : " + str9.contains("Selenium"));
        boolean isStringAvailable = str9.contains("html");
        System.out.println(isStringAvailable);
        
        String str10 = "The transaction number is - 78E35dL";
        // The transaction number is - 55E35dL
        // The transaction number is - 78sd5dL
        System.out.println("The transaction number is : " + str10.substring(27));
        
        String str11 = "Your transaction number is 78E35dL thank you";
        System.out.println("The transaction number is : " + str11.substring(26, 33));
        
        String statement1 = "Java is platform independent";
        String
        
        
        
        
        
        
        
        
        
        
	}

}
