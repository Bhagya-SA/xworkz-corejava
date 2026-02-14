class SamsungTabExecutor {
	public static void main(String[] args) {
		
		 String brand = SamsungTab.getBrandInfo() ;
		 String modelName = SamsungTab.getModelNameInfo();
		 String memory = SamsungTab.getMemoryInfo();
		 String screenSize = SamsungTab.getScreenSizeInfo() ;
		 String color = SamsungTab.getColorInfo();
		 String screenResolution = SamsungTab.getScreenResolutionInfo();
		 String itemModel = SamsungTab.getItemModelInfo();
		 int numberOfCells = SamsungTab.getNumberOfCellsInfo();
		 String itemWeight = SamsungTab.getItemWeightInfo();
		 String manufacturer = SamsungTab.getManufacturerInfo() ;
		
		System.out.println("Brand : " + brand );
		System.out.println("Model name : " + modelName);
		System.out.println("Memory storage : " + memory);
		System.out.println("Screen size : " + screenSize );
		System.out.println("Color : " + color);
		System.out.println("Screen resolution : " + screenResolution );
		System.out.println("Item model : " + itemModel);
		System.out.println("Number of cells : " + numberOfCells );
		System.out.println("Item weight : " + itemWeight );
		System.out.println("Manufacturer : " + manufacturer);
		
	
	
	}

}