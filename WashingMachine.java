class WashingMachine {
	static boolean isMachineOn;
	
	static boolean onOrOff() {
		if(isMachineOn == false) {
			isMachineOn = true;
			System.out.println("The washing machine is ON");
		}
		else if(isMachineOn == true){
			isMachineOn = false;
			System.out.println("The washing machine is OFF");
		}
		return isMachineOn;
	
	}
}