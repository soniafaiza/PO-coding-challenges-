
public class AlmostPalindrom {
	
	 public static void main(String args[]) { 
		    System.out.println(almostAPalindrome("abccia")); 
		  } 
	
	  public static boolean almostAPalindrome(String str){
		    char[] charArray = str.toCharArray();
		    int num = 0;
		    int k = charArray.length - 1;

		    for(int i = 0; i < charArray.length; i++){
		      if(charArray[i] != charArray[k] && i != k){
		        num++;
		      }
		      k--;
		    }
		    if(num-1 == 1){
		      return true;
		    }
		    return false;
		  }
}

