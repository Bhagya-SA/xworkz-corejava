class WirelessEarbudsExecutor {
	public static void main(String[] args){
	
     String brand = WirelessEarbuds.getBrandInfo() ;
	 String color = WirelessEarbuds.getColorInfo() ;
	 String formfactor = WirelessEarbuds.getFormfactorInfo() ;
	 String earPlacement = WirelessEarbuds.getEarPlacementInfo() ;
	 String itemWeight = WirelessEarbuds.getItemWeightInfo();
	 String style = WirelessEarbuds.getStyleInfo() ;
	 String range = WirelessEarbuds.getRangeInfo() ;
	 double version = WirelessEarbuds.getVersionInfo() ;
	 String model = WirelessEarbuds.getModelInfo();
	 String batteriesIncluded = WirelessEarbuds.getInfoOnBatteriesIncluded();
	
	System.out.println("Brand : " + brand);
	System.out.println("Color : " + color);
	System.out.println("Form factor : " + formfactor);
	System.out.println("Ear placement : " + earPlacement);
	System.out.println("Item weight : " + itemWeight);
	System.out.println("Style : " + style);
	System.out.println("Range : " + range);
	System.out.println("Version : " + version);
	System.out.println("Model : " + model);
	System.out.println("Batteries included : " + batteriesIncluded);
	
 }



}