class CameraBagExecutor {
	public static void main(String[] args) {
		
		 String productDimension = CameraBag.getProductDimensionInfo() ;
		 String manufacturer = CameraBag.getManufacturerInfo();
		 String asin = CameraBag.getAsinInfo() ;
		 String itemNumber = CameraBag.getItemNumberInfo() ;
		 String countryOfOrigin = CameraBag.getCountryOfOriginInfo() ;
		 String department = CameraBag.getDepartmentInfo();
		 String itemWeight  = CameraBag. getItemWeightInfo();
		 String itemDimension = CameraBag.getItemDimensionInfo();
		 String netQuantity = CameraBag.getNetQuantityInfo();
		 String genericName = CameraBag.getGenericNameInfo();
		
		System.out.println("Product dimension : " + productDimension);
		System.out.println("Manufacturer : " + manufacturer);
		System.out.println("ASIN : " + asin);
		System.out.println("Item number : " + itemNumber);
		System.out.println("Country of origin : " + countryOfOrigin);
		System.out.println("Department : " + department);
		System.out.println("Item weight : " + itemWeight);
		System.out.println("Item dimension : " + itemDimension);
		System.out.println("Net quantity : " + netQuantity);
		System.out.println("Generic name : " + genericName);
		
	
	
	
	}


}