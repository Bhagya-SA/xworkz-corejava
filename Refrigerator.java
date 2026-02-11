class Refrigerator {
	static boolean isRefiOn;
	static boolean onOrOff() {
		if(isRefiOn == false) {
			isRefiOn = true;
			System.out.println("The refigerator is ON");
		}
		else if(isRefiOn == true) {
			isRefiOn = false;
			System.out.println("The refigertor is OFF");
		}
		return isRefiOn;
		
	}


}