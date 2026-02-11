class WiFi {
	static boolean isConnected;
	
	static boolean onOrOff() {
		if(isConnected == false){
			isConnected = true;
			System.out.println("The WiFi is ON");
		}
		else if(isConnected == true) {
			isConnected = false;
			System.out.println("The WiFi is OFF");
		}
		return isConnected;
	}

}