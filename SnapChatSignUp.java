class SnapChatSignUp {
	
	public static void main(String[] snap) {
		
		createUserAccount("Bhagya" ,"Shree" , "April-28-2004" , "bhagya@123gmai.com" ,"456tfdgghy&*" );
	
	}
	static void createUserAccount(String firstName , String lastName , String birthday , String userName , String password){
		System.out.println("WELCOME TO SIGNUP PAGE OF SNAPCHAT");
		System.out.println("First name : " + firstName);
		System.out.println("Last name : " + lastName);
		System.out.println("Birthday : " + birthday);
		System.out.println("Username : " + userName);
		System.out.println("Password : " + password);
		
	}

}