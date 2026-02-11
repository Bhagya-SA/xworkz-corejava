class DigitalCamera {
	static boolean isCameraOn;
	static boolean onOrOff() {
		if(isCameraOn == false) {
			isCameraOn = true;
			System.out.println("The Digital camera is ON");
		}
		else if(isCameraOn == true) {
			isCameraOn = false;
			System.out.println("The Digital camera is OFF");
		}
		return isCameraOn;
	}


}