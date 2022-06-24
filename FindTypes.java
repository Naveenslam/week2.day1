package week2.day1;

public class FindTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String test = "$$ Welcome to 2nd Class of Automation $$ ";
		// Here is the input
		int letter = 0, space = 0, num = 0, specialChar = 0;
		// Here is what the count you need to find
		char[] str1=test.toCharArray();
		for(int i=0;i<test.length(); i++)
		{
			char c = str1[i];
			if(Character.isLetter(c))
			{
				letter+=1;
			}
			
else if(Character.isDigit(c)) {
				
				//Incrementing num value by 1 if condition is true
				num+= 1;
			}
			
			//Conditional check whether the character is space 
			else if(Character.isSpaceChar(c)) {
				
				//Incrementing space value by 1 if condition is true
				space += 1;
			}
			else {
				//Incrementing specialChar value by 1 if condition is true
				specialChar+= 1;
			}
		}
		//Printing the count of letter,number,spaces and special character
		System.out.println("letter: "+letter);
		System.out.println("space: "+space);
		System.out.println("num: "+num);
		System.out.println("specialCharacter: "+specialChar);
	}
}