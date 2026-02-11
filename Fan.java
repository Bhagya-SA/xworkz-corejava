class Fan {
	static boolean isFanOn;
	
	static boolean onOrOff() {
		if(isFanOn == false) {
			isFanOn = true;
			System.out.println("The Fan is ON");
		}
		else if(isFanOn == true){
			isFanOn = false;
			System.out.println("The Fan is OFF");
		}
		return isFanOn;
	}
}