class MicrowaveOven {
	static boolean isOvenOn;
	
	static boolean onOrOff() {
		if(isOvenOn == false) {
			isOvenOn = true;
			System.out.println("The microwave oven is ON");
		}
		else if(isOvenOn == true) {
			isOvenOn = false;
			System.out.println("The microwave oven is OFF");
		}
		return isOvenOn;
	}

}