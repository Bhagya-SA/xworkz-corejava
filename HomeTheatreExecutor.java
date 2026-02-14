class HomeTheatreExecutor{
	public static void main(String[] args){
	 
	 String brand = HomeTheatre.getBrandInfo();
	 String frequency = HomeTheatre.getFrequencyInfo();
	 String inputVoltage = HomeTheatre.getInputVoltageInfo();
	 String mountingType = HomeTheatre.getMountingTypeInfo();
	 String modelName = HomeTheatre.getModelNameInfo();
	 String speakerType = HomeTheatre.getSpeakerTypeInfo() ;
	 String netQuantity = HomeTheatre.getNetQuantityInfo();
	 String color = HomeTheatre.getColorInfo();
	 String isWaterProof = HomeTheatre.getIsWaterProofInfo() ;
	 String itemWeight = HomeTheatre.getItemWeightInfo();
	
	System.out.println("Brand : " + brand );
	System.out.println("Frequency : " + frequency);
	System.out.println("Input voltage : " + inputVoltage);
	System.out.println("Mounting type : " + mountingType);
	System.out.println("Model name : " + modelName);
	System.out.println("Speaker type : " + speakerType);
	System.out.println("Net quantiy : " + netQuantity);
	System.out.println("Color : " + color);
	System.out.println("Is waterproof : " + isWaterProof);
	System.out.println("Item weight : " + itemWeight);

 
 }


}