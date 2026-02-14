class HaierRefrigeratorExecutor{
	public static void main(String[] anrs){
	
	 String product = HaierRefrigerator.getProductInfo();
	 String dimensions = HaierRefrigerator.getDimensionsInfo() ;
	 String brand = HaierRefrigerator.getBrandInfo();
	 String capacity = HaierRefrigerator.getCapacityInfo() ;
	 String configuration = HaierRefrigerator.getConfigurationInfo();
	 String color = HaierRefrigerator.getColorInfo();
	 String model = HaierRefrigerator.getModelInfo() ;
	 String freezerCapacity = HaierRefrigerator.getFreezerCapacityInfo() ;
	 String material = HaierRefrigerator.getMaterialInfo() ;
	 String certification = HaierRefrigerator.getCertificationInfo();
	
	System.out.println("Product : " + product);
	System.out.println("Dimensions : " + dimensions);
	System.out.println("Brand : " + brand);
	System.out.println("Capacity : " + capacity);
	System.out.println("Configuration : " + configuration);
	System.out.println("Color : " + color);
	System.out.println("Model : " + model);
	System.out.println("Freezer Capacity : " + freezerCapacity);
	System.out.println("Material : " + material);
	System.out.println("Certification : " + certification);
 
 }


}