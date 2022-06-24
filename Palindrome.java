package week2.day1;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name ="madam";
		 String revValue = "";
	 int nameLength=name.length();
		 for(int i=nameLength-1; i>=0; i--)
		 {
			 revValue = revValue+name.charAt(i);
			 
		 }
		 if(name.equals(revValue))
		 {
			 System.out.println(name+" name is palindrome");
		 }
		 else
		 {
			 System.out.println(name+" name is not palindrome");
		 }

	}

}
