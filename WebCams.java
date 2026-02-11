class WebCams {
	static boolean isWebCamOn;
	static boolean onOrOff() {
		if(isWebCamOn == false){
			isWebCamOn = true;
			System.out.println("The WebCam is ON");
		}
		else if(isWebCamOn == true) {
			isWebCamOn = false;
			System.out.println("The WebCam is OFF");
		}
		return isWebCamOn;
	}

}