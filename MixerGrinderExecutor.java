class MixerGrinderExecutor {

	public static void main(String[] mixer) {
		
		double price = MixerGrinder.getPrice();
		String brand = MixerGrinder.getBrand();
		String color = MixerGrinder.getColor();
		String specialFeature = MixerGrinder.getSpecialFeature();
		String capacity = MixerGrinder.getCapacity();
		String controlType = MixerGrinder.getControlType();
		String manufacturer = MixerGrinder.getManufacturer();
		String countryOrigin = MixerGrinder.getCountryOfOrigin();
		long itemModelNumber = MixerGrinder.getItemModelNumber();
		String asin = MixerGrinder.getASIN();
	
		System.out.println("Price : " + price);
		System.out.println("Brand : " + brand);
		System.out.println("Color : " + color);
		System.out.println("Special feature : " + specialFeature);
		System.out.println("Capacity : " + capacity);
		System.out.println("Control type : " + controlType);
		System.out.println("Manufacturer : " + manufacturer);
		System.out.println("Country of origin : " + countryOrigin);
		System.out.println("Item model number : " + itemModelNumber);
		System.out.println("ASIN : " + asin);
		
	}

}