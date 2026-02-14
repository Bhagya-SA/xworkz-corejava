class BoatRockerzBluetoothExecutor {	
	public static void main(String[] args) {
		
		 String brand = BoatRockerzBluetooth.getBrandInfo();
		 String modelID = BoatRockerzBluetooth.getModelIDInfo();
		 String color = BoatRockerzBluetooth.getColorInfo();
		 String headphoneType = BoatRockerzBluetooth.getHeadphoneType();
		 String inlineRemote = BoatRockerzBluetooth.getInlineRemoteInfo();
		 String connectivity = BoatRockerzBluetooth.getConnectivityInfo();
		 String compatibleDevices = BoatRockerzBluetooth.getCompatibleDevices();
		 String fastCharging = BoatRockerzBluetooth.getFastChargingInfo();
		 String noiseCancellation = BoatRockerzBluetooth.getNoiseCancellationInfo() ;
		 String primaryUse = BoatRockerzBluetooth.getPrimaryUseInfo();
		
		System.out.println("Brand : " + brand);
		System.out.println("ModelID : " + modelID);
		System.out.println("Color : " + color);
		System.out.println("Headphone Type : " + headphoneType);
		System.out.println("Inlie Remote : " + inlineRemote);
		System.out.println("Connectivity : " + connectivity);
		System.out.println("Compatible Device : " + compatibleDevices);
		System.out.println("Fast charging : " + fastCharging);
		System.out.println("Noise Cancellation : " + noiseCancellation);
		System.out.println("Primary Use : " + primaryUse);
		}
	
}	