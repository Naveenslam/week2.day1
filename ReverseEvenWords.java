package week2.day1;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String test = "I am a software tester"; 
		String[] split = test.split(" ");
		String newReversedString = "";

		for (int i = 0; i < split.length; i++) {
			if(i%2 != 0) {
				String temp = split[i];
				StringBuffer reverse = new StringBuffer(temp).reverse();
				newReversedString = newReversedString + reverse;
			} else {
				newReversedString = newReversedString + split[i];
			} 
			newReversedString = newReversedString + " ";
		}  
		System.out.println(newReversedString);
	}
			
			
		
		
		

	}

	