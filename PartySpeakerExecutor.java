class PartySpeakerExecutor {

	public static void main(String[] speaker) {
	
	double price = PartySpeaker.getPriceInfo();
	String inputVoltage = PartySpeaker.getInputVoltageInfo();
	String mounting = PartySpeaker.getMountingInfo();
	String modelName = PartySpeaker.getModelName();
	String speakerType = PartySpeaker.getSpeakerTypeInfo();
	String compatibleDevices  = PartySpeaker.getCompatibleDevicesInfo();
	String color  = PartySpeaker.getColorInfo();
	String speakerSize = PartySpeaker.getSpeakerSizeInfo();
	String powerSource = PartySpeaker.getPowerSourceInfo();
	String brand = PartySpeaker.getBrandInfo();
	
	System.out.println("Price : " + price);
	System.out.println("Input voltage : " + inputVoltage);
	System.out.println("Mounting : " + mounting);
	System.out.println("Model name : " + modelName);
	System.out.println("Speaker type : " + speakerType);
	System.out.println("Compatible devices : " + compatibleDevices);
	System.out.println("Color : " + color);
	System.out.println("Speaker size : " + speakerSize);
	System.out.println("Power source : " + powerSource);
	System.out.println("Brand name : " + brand);
	
	
	
	}

}
