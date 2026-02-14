class CcTvCameraExecutor {
	public static void main(String[] args) {
		
		 String brand = CcTvCamera.getBrandInfo();
		 String modelName = CcTvCamera.getModelNameInfo();
		 String connectivity = CcTvCamera.getConnectivityInfo() ;
		 String compatibleDevice = CcTvCamera.getCompatibleDeviceInfo();
		 String powerSource = CcTvCamera.getPowerSourceInfo();
		 String protocol = CcTvCamera.getProtocolInfo();
		 String color = CcTvCamera.getColorInfo();
		 String formFactor = CcTvCamera.getFormFactorInfo() ;
		 String material = CcTvCamera.getMaterialInfo();
		 String zoomType = CcTvCamera.getZoomTypeInfo();
		
		System.out.println("Brand : " + brand);
		System.out.println("Model name : " + modelName);
		System.out.println("Connectivity : " + connectivity);
		System.out.println("Compatible Device : " + compatibleDevice);
		System.out.println("Power source : " + powerSource);
		System.out.println("Protocol : " + protocol);
		System.out.println("Color : " + color);
		System.out.println("Form factor : " + formFactor);
		System.out.println("Material : " +material);
		System.out.println("Zoom type : " + zoomType);
		
	
	
	
	}
}	