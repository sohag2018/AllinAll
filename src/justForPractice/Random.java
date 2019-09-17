package justForPractice;

public class Random {
	
	public static void checkAge(int n) {
		
		if(n<22) {
			System.out.println("Access denied");
		}else {
			System.out.println("Access permited");
		}
		
	}

	public static void main(String[] args) {
		Random r = new Random();
        checkAge();


	}

}
