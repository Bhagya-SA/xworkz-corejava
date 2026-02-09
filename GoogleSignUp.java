class GoogleSignUp {

	
	public static void main(String[] google) {
		saveUserAccount("Bhagya","Shree","shree@gmail.com","adghj7643$%^","adghj7643$%^");
	}
	static void saveUserAccount(String firstName , String lastName , String userName , String password , String confirmPassword) {
		System.out.println("WELCOME TO SIGN UP PAGE OF GOOGLE");
		System.out.println("First name : " + firstName);
		System.out.println("Last name : " + lastName);
		System.out.println("UserName : " + userName);
		System.out.println("Password : " + password);
		System.out.println("Confirm password : " + confirmPassword);
	}

}