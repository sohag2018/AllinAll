package interviewCoddingQ;

public class SubString {

	public static void main(String[] args) {
		String str="I love to do codding";
		str.subSequence(2, 4);
		
		//let's print the word love (starting index 2 and ending index 6 as index starts with 0)
		
		 String substr=str.substring(13, 20);
		
		System.out.println("our substring value is :" +substr);

	}

}
