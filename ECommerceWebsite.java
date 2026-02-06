class ECommerceWebsite{
	public static void main(String[] flipkart) {
		String companyName = "FlipKart" ;
		String headQuaters[] = {"Bengalore" , "Karnataka" , "India"};
		String founders[] = {"Sachin Bansal" , "Binny Bansal"};
		int yearFounded = 2007;
		String coreBusinesses[] = {"E-Commerce" , "Online-Shopping" , "Retail"};
		String keyProducts[] = {"Electronics" , "Fashion" , "Home-Essentials" , "Lifestyle-items" , "Books" , "Mobile-Phones"};
		String technologiesUsed[] = {"Java" , "Spring Boot" , "react.js" , "React Native" , "MySQL" , "Hadoop" , "BigData"};
	    
		System.out.println("********************" + companyName + "**************************************");
		System.out.println(" ");
		
		System.out.println("The total number of headquaters available : " + headQuaters.length);
		System.out.println("Headquaters of the Flipkart is as follows : ");
		for(String headQuater : headQuaters) System.out.println(headQuater);
		System.out.println(" "); 
		
		System.out.println("Total number of founders : " + founders.length);
		System.out.println("Fouders of Flipkart : ");
		for(String founder : founders) System.out.println(founder);
		System.out.println(" "); 
		
	
		System.out.println("Founded in the year : " + yearFounded);
		System.out.println(" ");
		
		System.out.println("Total number of core Businesses of the company : " + coreBusinesses.length);
		System.out.println("Core Business of Flipkart is as follows : ");
		for(String coreBusiness : coreBusinesses) System.out.println(coreBusiness);
		System.out.println(" ");
		
		System.out.println("Total number of product available : " + keyProducts.length);
		System.out.println("Key products of the flipkart is as follows : ");
		for(String keyProduct : keyProducts) System.out.println(keyProduct);
		System.out.println(" ");
		
		System.out.println("Total number technologies used : " + technologiesUsed.length);
		System.out.println("Technologies usde in Flipkart is as follows");
		for(String technologyUsed : technologiesUsed) System.out.println(technologyUsed);
	    System.out.println(" ");
	
	}
}