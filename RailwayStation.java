class RailwayStation  {
	public static void main(String[] railways) {
		String stationName = "Bangalore";
		String stationTypes[] = {"junction" , "Terminal" , "Halt" , "Yard"};
		String location = "Bangalore";
		String gaugeTypes[] = {"Broad gauge" , "Metro Gauge"};
	    
		System.out.println("**********************" + stationName + "*******************");
		System.out.println(" ");
		
		System.out.println("The length of station type is : " + stationTypes.length);
		System.out.println("List of station type is as follows");
		for(String stationType : stationTypes) System.out.println(stationType);
		System.out.println(" ");
		
		System.out.println("Location of the station : " + location);
		System.out.println(" ");
		
		System.out.println("The length of the gauge type : " + gaugeTypes.length);
		System.out.println("List of gauge types is as follows : ");
		for(String gaugeType : gaugeTypes) System.out.println(gaugeType);
		System.out.println(" ");
	
	}
}