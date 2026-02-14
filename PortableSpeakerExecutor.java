class PortableSpeakerExecutor {

	public static void main(String[] args) {
		
		 String modelName = PortableSpeaker.getModelNameInfo() ;
		 String speakerType = PortableSpeaker.getSpeakerTypeInfo();
		 String compatibleDevice = PortableSpeaker.getCompatibleDeviceInfo();
		 String netQuantity = PortableSpeaker.getNetQuantityInfo();
		 String color = PortableSpeaker.getColorInfo();
		 String productDimensions = PortableSpeaker.getProductDimensionsInfo();
		 String itemWeight = PortableSpeaker.getItemWeightInfo();
		 int numberOfItems = PortableSpeaker.getNumberOfItemsInfo();
		 String batteriesIncluded = PortableSpeaker.getInfoOfBatteriesIncluded() ;
		 String batteriesRequired = PortableSpeaker.getInfoOfbatteriesRequired();
		
		System.out.println("Model Name : " + modelName);
		System.out.println("Speaker Type : " + speakerType);
		System.out.println("Compatible Device : " + compatibleDevice);
		System.out.println("Net Quantity : " + netQuantity);
		System.out.println("Color : " + color);
		System.out.println("Product Dimension : " + productDimensions);
		System.out.println("Item Weigght : " + itemWeight);
		System.out.println("Number of items : " + numberOfItems);
		System.out.println("Batteries Included : " + batteriesIncluded);
		System.out.println("Batteries Required : " + batteriesRequired);
		
	}

}