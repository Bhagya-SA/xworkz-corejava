class AnarkaliKurtaExecutor {

	public static void main(String[] args) {
			
		String productDimension = AnarkaliKurta.getProductDimension() ;
		String manufacturer = AnarkaliKurta.getManufacturerInfo();
		String asin = AnarkaliKurta.getAsinInfo();
		String itemPartNumber = AnarkaliKurta.getItemPartNumber();
		String department = AnarkaliKurta.getDepartmentInfo() ;
		String packer = AnarkaliKurta.getPackerInfo();
		String itemWeight = AnarkaliKurta.getItemWeightInfo() ;
		String genericName = AnarkaliKurta.getGenericNameInfo();
		String itemDimension = AnarkaliKurta.getItemDimensionInfo();
		String style = AnarkaliKurta.getStyleInfo();
		
		
		System.out.println("Product Dimension : " + productDimension);
		System.out.println("Manufacturer : " + manufacturer);
		System.out.println("ASIN : " + asin);
		System.out.println("Item part number : " + itemPartNumber);
		System.out.println("Department : " + department);
		System.out.println("Packer : " + packer);
		System.out.println("Item weight : " + itemWeight);
		System.out.println("Generic Name : " + genericName);
		System.out.println("Item Dimensions : " + itemDimension);
		System.out.println("Style : " + style);
		
}	

	}