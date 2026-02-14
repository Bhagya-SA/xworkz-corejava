class FrontLoadWashingMachineExecutor {
	public static void main(String[] args) {
		
		 String brand = FrontLoadWashingMachine.getBrandInfo();
		 String model = FrontLoadWashingMachine.getModelInfo();
		 String capacity = FrontLoadWashingMachine.getCapacityInfo();
		 String noiseLevel = FrontLoadWashingMachine.getNoiseLevelInfo();
		 String color = FrontLoadWashingMachine.getColorInfo();
		 String controlConsole = FrontLoadWashingMachine.getControlConsoleInfo();
		 String accessLocation = FrontLoadWashingMachine.getaccessLocationInfo();
		 String voltage = FrontLoadWashingMachine.getVoltageInfo();
		 String material = FrontLoadWashingMachine.getMaterialInfo();
		 String partNumber = FrontLoadWashingMachine.getPartNumberInfo() ;
		
		System.out.println("Brand : " + brand);
		System.out.println("Model : " + model);
		System.out.println("Capacity : " + capacity);
		System.out.println("Noise level : " + noiseLevel);
		System.out.println("Color : " + color);
		System.out.println("Control console : " + controlConsole);
		System.out.println("Access location : " + accessLocation);
		System.out.println("Voltage : " + voltage);
		System.out.println("Material : " + material);
		System.out.println("Part Number : " + partNumber);
		
	}
}