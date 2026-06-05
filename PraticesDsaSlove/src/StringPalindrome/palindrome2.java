package StringPalindrome;

public class palindrome2 {
	public static void main(String[] args) {
		String str = "MOM";
		String rev = "";
		
		for(int i = str.length()-1; i>=0 ; i--) {
			rev += str.charAt(i);
		}
		if(str.equals(rev)) {
			System.out.println("palindrome");
		}else {
			System.out.println("Not palindrome");
		}
		
	}

}
