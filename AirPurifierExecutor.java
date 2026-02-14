class AirPurifierExecutor {

	public static void main(String[] purifier) {
	
		double price = AirPurifier.getPrice();
		String color = AirPurifier.getColor() ;
		String brand = AirPurifier.getBrand() ;
		String floorArea = AirPurifier.getFloorArea() ;
		String specification = AirPurifier.getSpecificationMet() ;
		String noiseLevel = AirPurifier.getNoiseLevel() ;
		int manufacturerYear = AirPurifier.manufacturerYear() ;
	    
		System.out.println("Price : " + price);
		System.out.println("Color : " + color);
		System.out.println("Brand : " + brand);
		System.out.println("Floor area : " + floorArea);
		System.out.println("Specification : " + specification);
		System.out.println("Noise level : " + noiseLevel);
		System.out.println("ManufacturerYear : " + manufacturerYear);
	
	
	}

}