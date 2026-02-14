class WiFiHotspotExecutor{
	public static void main(String[] hotspot) {
		
		double price= WiFiHotspot.getPrice() ;
		String brand = WiFiHotspot.getBrand();
		String series = WiFiHotspot.getSeries();
		String color = WiFiHotspot.getColor();
		String itemHeight = WiFiHotspot.getItemHeight();
		String itemWidth = WiFiHotspot.getItemWidth();
		String itemModelNumber= WiFiHotspot.getItemModelNumber();
		int numberOfLithiumCells = WiFiHotspot.getNumberOfLithiumCells();
		String includedComponents = WiFiHotspot.getIncludedComponents();
		String manufacturer = WiFiHotspot.getManufacturer();
		String country = WiFiHotspot.getCountryInfo();
		String itemWeight = WiFiHotspot.getItemWeight();
		
		System.out.println("Price : " + price);
		System.out.println("Brand : " + brand);
		System.out.println("Series : " + series);
		System.out.println("Color : " + color);
		System.out.println("Item height : " + itemHeight);
		System.out.println("Item width : " + itemWidth);
		System.out.println("Item model number : " + itemModelNumber);
		System.out.println("Number of lithium cells : " + numberOfLithiumCells);
		System.out.println("Included components : " + includedComponents);
		System.out.println("Manufacturer : " + manufacturer);
		System.out.println("Country : " + country);
		System.out.println("Item weight : " + itemWeight);
		
		
	
	
	}

}