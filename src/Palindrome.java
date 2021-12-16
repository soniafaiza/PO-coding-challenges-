
public class Palindrome {
	public static void main (String[]args) {
		
		String str = "dad";
		String reverse ="";
		for(int i= str.length()-1; i>=0; i--) {
			reverse += str.charAt(i);
			//System.out.println(reverse);
		} 
		 boolean isPalindrome = true;
		  for(int i=0; i< str.length(); i++) {
			  if(str.charAt(i) != reverse.charAt(i)) {
				    isPalindrome = false;
			  } 
		  }
			 if(isPalindrome) {
				 System.out.println("the str is a palindrome");
			 } 
			 else {System.out.println("not a palindrome"); 
	}
		}
	}
	
	
