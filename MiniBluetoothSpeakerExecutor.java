class MiniBluetoothSpeakerExecutor {
	public static void main(String[] args) {
		
		 String brand = MiniBluetoothSpeaker.getBrandInfo();
		 String itemDimension = MiniBluetoothSpeaker.getItemDimensionInfo() ;
		 String connectivity = MiniBluetoothSpeaker.getConnectivityInfo();
		 String color = MiniBluetoothSpeaker.getColorInfo();
		 String compatibleDevices = MiniBluetoothSpeaker.getCompatibleDevicesInfo();
		 String mountingType = MiniBluetoothSpeaker.getMountingTypeInfo();
		 String powerSource = MiniBluetoothSpeaker.getPowerSourceInfo();
		 String itemWeight = MiniBluetoothSpeaker.getItemWeightInfo();
		 String impedance = MiniBluetoothSpeaker.getImpedanceInfo();
		 String model  = MiniBluetoothSpeaker.getModelInfo();
		
		System.out.println("Brand : " +brand);
		System.out.println("Item dimension : " + itemDimension);
		System.out.println("Connectivity : " + connectivity);
		System.out.println("Color : + " + color);
		System.out.println("Compatible devices : " +compatibleDevices);
		System.out.println("Mounting type : " + mountingType);
		System.out.println("Power source : " + powerSource);
		System.out.println("Item weight : " + itemWeight);
		System.out.println("Impedance : " + impedance);
		System.out.println("Model : " + model);
		
	
	
	}

}