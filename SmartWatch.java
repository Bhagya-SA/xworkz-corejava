class SmartWatch {
	static boolean isSmartWatchOn;
	
	static boolean onOrOff() {
		if(isSmartWatchOn == false) {
			isSmartWatchOn = true;
			System.out.println("The smart watch is turned on");
		}
		else if(isSmartWatchOn == true) {
			isSmartWatchOn = false;
			System.out.println("The smart watch is off");
		}
		return isSmartWatchOn;
	}
}