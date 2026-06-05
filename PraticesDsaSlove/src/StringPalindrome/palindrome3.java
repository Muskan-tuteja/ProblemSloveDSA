package StringPalindrome;

public class palindrome3 {
	public static void main(String[] args) {
		String str = "MOOM";
		String rev = "";
		
		for(int i = str.length()-1; i>=0; i--) {
			rev += str.charAt(i);
			
		}
		if(str.equals(rev)) {
			System.out.println("palindrome");
		}else {
			System.out.println("Not palinfrome");
		}
	}

}
