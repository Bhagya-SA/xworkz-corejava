class SmartDoorLockExecutor {

	public static void main(String[] args) {
		
		 String brand = SmartDoorLock.getBrandInfo();
		 String specialFeature = SmartDoorLock.getSpecialFeatureInfo();
		 String lockType = SmartDoorLock.getLockTypeInfo();
		 String material = SmartDoorLock.getMaterialInfo();
		 String color = SmartDoorLock.getColorInfo() ;
		 String shape = SmartDoorLock.getShapeInfo();
		 String modelName = SmartDoorLock.getModelNameInfo();
		 String finishType = SmartDoorLock.getFinishTypeInfo();
		 int numberOfPieces  = SmartDoorLock.getNumberOfPiecesInfo();
		 String itemWeight = SmartDoorLock.getItemWeightInfo();
		
		System.out.println("Brand : " + brand);
		System.out.println("Special feature : " +specialFeature);
		System.out.println("Lock type : " + lockType);
		System.out.println("Material : " + material);
		System.out.println("Color : " + color);
		System.out.println("Shape : " + shape);
		System.out.println("Model name : " + modelName);
		System.out.println("Finish type : " + finishType);
		System.out.println("NumberOfPieces : " + numberOfPieces);
		System.out.println("Item weight : " + itemWeight);
		
	
	
	
	}



}