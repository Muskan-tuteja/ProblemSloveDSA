package QuestionSloveString;

public class WithOutLength {
	public static int  getLengthOfString(String str) {
		char[] arr = str.toCharArray();
		int len = arr.length;
		return len;
		
		
	}
	public static void main(String[] args) {
		String str = "Muskan";
		System.out.println(getLengthOfString(str));
	}

}

