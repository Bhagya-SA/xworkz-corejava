class OnePlusTabletExecutor {

	public static void main(String[] speaker) {
	
	double price = OnePlusTablet.getPriceInfo();
	String series = OnePlusTablet.getSeriesInfo();
	String itemWidth = OnePlusTablet.getItemWidthInfo();
	String itemHeight = OnePlusTablet.getItemHeightInfo();
	String resolution = OnePlusTablet.getResolutionInfo();
	String processorBrand  = OnePlusTablet.getProcessorBrandInfo();
	String color  = OnePlusTablet.getColorInfo();
	String ramSize = OnePlusTablet.getRAMSizeInfo();
	String manufacturer = OnePlusTablet.getManufacturerInfo();
	String brand = OnePlusTablet.getBrandInfo();
	
	System.out.println("Price : " + price);
	System.out.println("Series info  : " + series);
	System.out.println("Item Width : " + itemWidth);
	System.out.println("Item Width : " + itemHeight);
	System.out.println("Resolution : " + resolution);
	System.out.println("Processor brand : " + processorBrand);
	System.out.println("Color : " + color);
	System.out.println("RAM size : " + ramSize);
	System.out.println("Manufacturer  : " + manufacturer);
	System.out.println("Brand name : " + brand);
	
	
	
	}

}
