class AlexaExecutor {
	public static void main(String[] args) {
		
		String size = Alexa.getsizeInof();
		System.out.println("Size : " + size);
		
		String audio = Alexa.getAudioInfo();
		System.out.println("Audio : " + audio);
		
		String generation = Alexa.getGenerationInfo();
		System.out.println("Generation : " + generation);
		
		String language = Alexa.getLanguageInfo();
		System.out.println("Language : " + language);
		
		String genericName = Alexa.getGenericNameInfo();
		System.out.println("Generic name : " + genericName);
		
		String country = Alexa.getCountryInfo();
		System.out.println("Country : " + country);
		
		double price = Alexa.getPriceInfo();
		System.out.println("Price : " + price);
		
		int netQuantity =  Alexa.netQuantityInfo();
		System.out.println("Net quantity : " + netQuantity);
		
		String warranty = Alexa.getWarrantyInfo();
		System.out.println("Warranty : " + warranty);
		
		String smartHomeProtocols = Alexa.smartHomeProtocolsInfo();
		System.out.println("Smart home protocols : " + smartHomeProtocols);
		

   }
}