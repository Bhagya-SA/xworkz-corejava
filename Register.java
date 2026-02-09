class Register{
	
		static int dcdrLocation = 5;`
		static String email = "bhagya.sirigur@gmail.com";
		static boolean emailLoginSame = true;
		static String givenName = "Bhgaya";
		static String password = "rgdfyidd%64@3";
		static String registrationAuthMethod = "PASSWORD";
		static String userId = "BHAGYA.SIRIGUR@GMAIL.COM";
	
	
	public static void main (String[] register) {
		
		
		System.out.println("***User Resgistration Details***");
		
		System.out.println("Post office location : " + dcdrLocation);
		System.out.println("Email : " + email);
		System.out.println("Is emailId and loginId same : " + emailLoginSame);
		System.out.println("Full name : " + givenName);
		System.out.println("Password : " + password);
		System.out.println("Authentication method : " + registrationAuthMethod);
		System.out.println("UserId : " + userId);
	}
}