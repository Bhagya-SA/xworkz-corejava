class VoklineShoesExecutor {
	
	public static void main(String[] args) {
		
		 String brand = VoklineShoes. getBrandInfo();
		 String brandColor = VoklineShoes.getBrandColorInfo() ;
		 String suitableFor = VoklineShoes.getSuitableForInfo();
		 String color = VoklineShoes.getColorInfo();
		 String outerMaterial = VoklineShoes.getOuterMaterialInfo();
		 String idealFor = VoklineShoes.IdealForInfo() ;
		 String occasion = VoklineShoes.getOccasionInfo() ;
		 int euroSize = VoklineShoes.getEuroSizeInfo();
		 String typeForCasual = VoklineShoes.getTypeForCasualInfo() ;
		 int netQuantity = VoklineShoes.getNetQuantityInfo();
		
		System.out.println("Brand : " + brand);
		System.out.println("Brand color : " + brandColor);
		System.out.println("Suitable for : " + suitableFor);
		System.out.println("Color : " + color);
		System.out.println("Outer Material : " + outerMaterial);
		System.out.println("Ideal for : " + idealFor);
		System.out.println("Occasion : " + occasion);
		System.out.println("Euro size : " + euroSize);
		System.out.println("Type for casual : " + typeForCasual);
		System.out.println("Net Quantity : " + netQuantity);
		
	
	
	}


}