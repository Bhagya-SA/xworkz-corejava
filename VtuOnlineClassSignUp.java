class VtuOnlineClassSignUp{
	
	static void createUserAccount(String email , String phoneNumberCode , long phoneNumber , String firstName , String lastName , String password) {
		System.out.println("Create an account");
		System.out.println("Email : " + email);
		System.out.println("Code : " + phoneNumberCode);
		System.out.println("Phone number : " + phoneNumber);
		System.out.println("First name : " + firstName);
		System.out.println("Last name : " + lastName);
		System.out.println("Password : " + password);
	}
	public static void main(String[] edu) {
		createUserAccount("bhagya.shree@gmail.com" , "IND(+91)" , 7654890127L ,"Bhagya", "Shree","ert433%^&$3");
		
	}


}