class GalaxyZFold7AIPhoneExecutor{
	public static void main(String[] args) {
		
		 String brand = GalaxyZFold7AIPhone.getBrandInfo() ;
		 String cellularTechnology = GalaxyZFold7AIPhone.getCellularTechnologyInfo();
		 String memoryStorage = GalaxyZFold7AIPhone.getMemoryStorageInfo();
		 String modelName = GalaxyZFold7AIPhone. getModelNameInfo();
		 String operatingSystem = GalaxyZFold7AIPhone.getOperatingSystemInfo();
		 String ramMemoryInstalled = GalaxyZFold7AIPhone.getRamMemoryInstalledInfo();
		 String refreshRate = GalaxyZFold7AIPhone.getRefreshRateInfo();
		 String resolution = GalaxyZFold7AIPhone.getResolutionInfo();
		 String screenSize = GalaxyZFold7AIPhone.getScreenSizeInfo();
		 String wirelessCarrier = GalaxyZFold7AIPhone.getWirelessCarrierInfo();
		
		System.out.println("Brand : " + brand);
		System.out.println("Cellular technology : " + cellularTechnology);
		System.out.println("Memory storage capacity : " + memoryStorage);
		System.out.println("Model name : " + modelName);
		System.out.println("Operating system : " + operatingSystem);
		System.out.println("RAM memory installed size : " + ramMemoryInstalled);
		System.out.println("Refresh rate : " + refreshRate);
		System.out.println("Resolution : " + resolution);
		System.out.println("Screen size : " + screenSize);
		System.out.println("Wireless carrier : " + wirelessCarrier);
		
		
		}

}