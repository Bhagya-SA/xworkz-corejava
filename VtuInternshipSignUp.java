class VtuInternshipSignUp {
	
	static void createUserAccount(String fullName , String emailAddress , long phoneNumber , String password , String confirmPassword) {
		System.out.println("Register\nCreate your account to get started with us\n");		
		System.out.println("Full name : " + fullName);
		System.out.println("Email address : " + emailAddress);
		System.out.println("Phone number : " + phoneNumber);
		System.out.println("Password : " + password);
		System.out.println("Confirm password : " + confirmPassword);
		
	}
	public static void main(String[] vtu) {
		
		createUserAccount("Bhagyashree S A" , "bhagya.shree@gmail.com" ,7652348901L , "tyu$%^765def#$" , "tyu$%^765def#$");	
		
	}



}