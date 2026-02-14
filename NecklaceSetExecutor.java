class NecklaceSetExecutor {
	public static void main(String[] args) {
		
		 String materialType = NecklaceSet.getMaterialTypeInfo() ;
		 String metalType = NecklaceSet.getMetalTypeInfo();
		 String gemType = NecklaceSet.getGemTypeInfo();
		 String occasionType = NecklaceSet.getOccasionTypeInfo();
		 String itemType = NecklaceSet.getItemTypeInfo() ;
		 String country = NecklaceSet.getCountryInfo();
		 String department = NecklaceSet.getDepartmentInfo();
		 String itemWeight = NecklaceSet.getItemWeight();
		 String netQuantity = NecklaceSet.getNetQuantityInfo();
		 String manufacturer = NecklaceSet.getManufacturerInfo();
		
		System.out.println("Material type : " + materialType);
		System.out.println("Metal type : " + metalType);
		System.out.println("Gem type : " + gemType);
		System.out.println("Occasion type : " + occasionType);
		System.out.println("Item type : " + itemType);
		System.out.println("Country : " + country);
		System.out.println("Department : " + department);
		System.out.println("Item weight : " + itemWeight);
		System.out.println("Net quantity : " + netQuantity);
		System.out.println("Manufacturer : " +manufacturer);
		
	
	
	
	}

}