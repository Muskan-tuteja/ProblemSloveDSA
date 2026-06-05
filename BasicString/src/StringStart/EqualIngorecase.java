package StringStart;

public class EqualIngorecase {
	public static void main(String[] args) {
		String name1 = "Muskan";
		String name2 = "MUSKAN";
		
		if(name1.equalsIgnoreCase(name2)) {
			System.out.println("Both String are Equal");
		}else {
			System.out.println("Both String are not equal");
		}
	}

}
