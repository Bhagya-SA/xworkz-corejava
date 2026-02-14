class AmazonBasicsCameraExecutor {

	public static void main(String[] args) {
		
		String brand = AmazonBasicsCamera.getBrandInfo();
		System.out.println("Brand : " + brand);
		
		String color = AmazonBasicsCamera.getColorInfo();
		System.out.println("Color : " + color);
		
		String device = AmazonBasicsCamera.getDeviceInfo();
		System.out.println("Device : " + device);
		
		String material = AmazonBasicsCamera.getMaterialInfo(); 
		System.out.println("Material " + material);
		
		String specialFeature =AmazonBasicsCamera.getSpecialFeature() ;
		System.out.println("Special feature : " + specialFeature);
		
		String manufacturer = AmazonBasicsCamera.getManufacturerInfo();
		System.out.println("Manufacturer : " + manufacturer);
		
		String countryOfOrigin = AmazonBasicsCamera.getCountryOfOriginInfo();
		System.out.println("Country of origin " + countryOfOrigin);
		
		String itemModelNumber = AmazonBasicsCamera.getItemModelNumberInfo();
		System.out.println("Item model number : " + itemModelNumber);
		
		String asin = AmazonBasicsCamera.getAsinInfo() ;
		System.out.println("ASIN : " + asin);
		
		String productDimensions = AmazonBasicsCamera.getProductDimensionsInfo();
		System.out.println("Product dimensions : " + productDimensions);
		
	
	
	
	}
}