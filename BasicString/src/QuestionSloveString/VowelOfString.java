package QuestionSloveString;

public class VowelOfString {
	static int getVowelsCount(String str) {
		int count = 0;
		for(int i=0; i<str.length();i++) {
			char ch = str.charAt(i);
			if(ch=='a' || ch=='e' || ch=='M' || ch=='u') {
				count++;
			}
			
			
		}
		return count;
	}
	public static void main(String[] args) {
		String str = "Muskan";
		System.out.println(getVowelsCount(str));
	}
	
	

}
