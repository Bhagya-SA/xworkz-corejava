class LaptopCoolingPadExecutor {

	public static void main(String[] args) {
		
		 String brand = LaptopCoolingPad.getBrandInfo();
		 String color = LaptopCoolingPad.getColorInfo() ;
		 String material = LaptopCoolingPad.getMaterialInfo();
		 String itemWeight = LaptopCoolingPad.getItemWeightInfo() ;
		 String productDimensions = LaptopCoolingPad.getProductDimensionsInfo();
		 String itemHeight = LaptopCoolingPad.getItemHeightInfo();
		 String itemWidth = LaptopCoolingPad.getItemWidthInfo() ;
		 String powerSource = LaptopCoolingPad.getPowerSourceInfo() ;
		 String manufacturer = LaptopCoolingPad.getManufacturerInfo() ;
		 String series = LaptopCoolingPad.getSeriesInfo();
		
		System.out.println("Brand : " + brand);
		System.out.println("Color : " + color);
		System.out.println("Material : " + material);
		System.out.println("Item weight : " + itemWeight);
		System.out.println("Product dimension : " + productDimensions);
		System.out.println("Item height : " + itemHeight);
		System.out.println("Item width : " + itemWidth);
		System.out.println("Power source : " + powerSource);
		System.out.println("Manufacturer : " + manufacturer);
		System.out.println("Series : " + series);
		
	
	
	}


}