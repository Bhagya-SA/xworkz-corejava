class AC {
	static boolean isACOn;
	static boolean onOrOff() {
		if(isACOn == false) {
			isACOn = true;
			System.out.println("The AC is ON");
		}
		else if(isACOn == true) {
			isACOn = false;
			System.out.println("The AC is OFF");
		}
		return isACOn;
	}

}