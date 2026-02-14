class LenovoLaptopExecutor {

	public static void main(String[] laptop) {
		 String series = LenovoLaptop.getSeriesInfo() ;
		 String color = LenovoLaptop.getColorInfo();
		 String formFactor = LenovoLaptop.getFormFactorInfo() ;
		 String screen = LenovoLaptop.getScreenInfo();
		 String packageDimension = LenovoLaptop.getPackageDimensionInfo();
		 String processorBrand = LenovoLaptop.getProcessorBrandInfo();
		 float processorSpeed = LenovoLaptop.getProcessorSpeedInfo();
		 int processorCount = LenovoLaptop.getProcessorCountInfo();
		 String manufacturer = LenovoLaptop.getManufacturerInfo();
		 String itemWeight = LenovoLaptop.getItemWeightInfo();
		
		System.out.println("Series : " + series);
		System.out.println("Color : " + color);
		System.out.println("Form Factor : " + formFactor);
		System.out.println("Screen : " + screen);
		System.out.println("Package Dimension : " + packageDimension);
		System.out.println("Processor Brand : " + processorBrand);
		System.out.println("Processor Speed : " + processorSpeed);
		System.out.println("Processor Count : " + processorCount);
		System.out.println("Manufacturer : " + manufacturer);
		System.out.println("Item Weight : " + itemWeight);
	}


}