class FacebookSignUp {
	public static void main(String[] facebook) {
		saveUserAccount("Bhagya","Sirigur","28-April-2004","Female",6543789231L,"abcfdtge#56*&%#");
	}
	static void saveUserAccount(String firstName , String surName , String dateOfBirth , String gender , long mobileNumber , String newPassword) {
		System.out.println("WELCOME TO SIGNUP PAGE OF FACEBOOK");
		System.out.println("First name : " + firstName);
		System.out.println("Surname : " + surName);
		System.out.println("Date of birth : " + dateOfBirth);
		System.out.println("Gender : " + gender);
		System.out.println("Mobile number : " + mobileNumber);
		System.out.println("New password : " + newPassword);
	}

}