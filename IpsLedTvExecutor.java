class IpsLedTvExecutor {
	public static void main(String[] args) {
		
		 String brand = IpsLedTv.getBrandInfo() ;
		 String screenSize = IpsLedTv.getScreenSizeInfo() ;
		 String displayTech = IpsLedTv.getDisplayTechInfo() ;
		 String resolution = IpsLedTv.getResolutionInfo() ;
		 String model = IpsLedTv.getModelInfo();
		 String memoryStorage = IpsLedTv.getMemoryStorageInfo() ;
		 String ramMemory = IpsLedTv.getRamMemoryInfo() ;
		 String os = IpsLedTv.getOsInfo();
		 int numberOfItems  = IpsLedTv.getNumberOfItems();
		 double aspectRatio = IpsLedTv.getAspectRatioInfo();
		
		System.out.println("Brand : " + brand);
		System.out.println("Screen size : " + screenSize);
		System.out.println("Display technology : " +displayTech);
		System.out.println("Resolution : " + resolution);
		System.out.println("Model : " + model);
		System.out.println("Memory storage : " + memoryStorage);
		System.out.println("RAM memory : " + ramMemory);
		System.out.println("Operating system : " + os);
		System.out.println("Number of items : " + numberOfItems);
		System.out.println("Aspect ration : " + aspectRatio);
		
	
	
	}

}