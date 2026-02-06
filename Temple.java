class Temple {
	public static void main(String[] temple) {
		String templeName = "Kadu Malleshwara temple";
		String location = "Malleshwaram";
		String deityName = "Lord Mallikarjuna";
		String specialFestivals[] = {"Shivaratri" , "Karthika Masa"};
		String openingClosingTimes[] = {"6 AM - 12 PM" , "5 PM - 9 PM"};
		String subShrines[] = {"Ganesha" , "Paravati" , "Nandi" , "Ajaneya Swamy" , "Subramanya"};
		
		System.out.println("********************" + templeName + "**********************************\n");
		
		System.out.println("Location of the temple : " + location);
		
		System.out.println("Name of the deity : \n" + deityName);
		
		System.out.println("The size of special festivals : " + specialFestivals.length);
		System.out.println("Special festivals celebrated in the temple is as follows");
	    for(String specialFestival : specialFestivals) System.out.println(specialFestival);
		
		System.out.println("The size of opening and closing time : " + openingClosingTimes.length);
		System.out.println("Opening and closing timings is as follows");
		for(String openingClosingTime : openingClosingTimes) System.out.println(openingClosingTime);
		
		System.out.println("The number of subshrines is : " + subShrines.length);
		System.out.println("List of subshrines is as follows");
		for(String subShrine : subShrines) System.out.println(subShrine);
	
	}
}