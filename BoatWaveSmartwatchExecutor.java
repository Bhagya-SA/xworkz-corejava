class BoatWaveSmartwatchExecutor {	
	public static void main(String[] args) {
		
		 String brand = BoatWaveSmartwatch.getBrandInfo();
		 String series = BoatWaveSmartwatch.getSeriesInfo();
		 String color = BoatWaveSmartwatch.getColorInfo();
		 String batteries = BoatWaveSmartwatch.getBatteriesInfo();
		 String modelNumber = BoatWaveSmartwatch.getModelNumberInfo() ;
		 int numberOfCells = BoatWaveSmartwatch.getNumberOfCellsInfo();
		 String displaySize = BoatWaveSmartwatch.getDisplaySizeInfo();
		 String manufacturer = BoatWaveSmartwatch.getManufacturerInfo();
		 String country = BoatWaveSmartwatch.getCountryInfo();
		 String itemWeight = BoatWaveSmartwatch.getItemWeightInfo();
		
		System.out.println("Brand : " + brand);
		System.out.println("Series : " + series);
		System.out.println("Color : " + color);
		System.out.println("Batteries : " + batteries);
		System.out.println("Model number" + modelNumber);
		System.out.println("Number of cells : " +numberOfCells);
		System.out.println("Display Size : " + displaySize);
		System.out.println("Manufacturer : " +manufacturer);
		System.out.println("Country of origin : " + country);
		System.out.println("Item weight : " + itemWeight);
	}
}	