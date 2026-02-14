class VoyagerLaptopBackPackExecutor {

	public static void main(String[] args) {
		
		 String material = VoyagerLaptopBackPack.getMaterialInfo() ;
		 String color = VoyagerLaptopBackPack.getColorInfo() ;
		 double price = VoyagerLaptopBackPack.getPriceInfo();
		 String waterResistant= VoyagerLaptopBackPack.getWaterResistantInfo();
		 String pattern = VoyagerLaptopBackPack.getPatternInfo();
		 String compartment = VoyagerLaptopBackPack.getCompartmentInfo() ;
		 String dimensions = VoyagerLaptopBackPack.getDimensionsInfo() ;
		 String pockets = VoyagerLaptopBackPack.getPocketsInfo();
		 String handle = VoyagerLaptopBackPack.getHandleInfo();
		 String closure = VoyagerLaptopBackPack.getClosureInfo() ;
		
		System.out.println("Material : " + material);
		System.out.println("Color : " + color);
		System.out.println("Price " + price);
		System.out.println("Water resistant : " + waterResistant);
		System.out.println("pattern : " + pattern);
		System.out.println("Compartment : " + compartment);
		System.out.println("Dimensions : " + dimensions);
		System.out.println("Pockets : " + pockets);
		System.out.println("Handle : " + handle);
		System.out.println("Closure : " + closure);
		
	
	
	}


}