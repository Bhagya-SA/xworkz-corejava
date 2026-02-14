class BluetoothHeadsetExecutor {

	public static void main(String[] args) {
		
		 String headphonesJack = BluetoothHeadset.getHeadphonesJackInfo();
		 String material = BluetoothHeadset.getMaterialInfo();
		 String controlType = BluetoothHeadset.getControlTypeInfo();
		 String itemWeight = BluetoothHeadset.getItemWeightInfo();
		 String style = BluetoothHeadset.getStyleInfo();
		 int numberOfItems = BluetoothHeadset.getNumberOfItemsInfo();
		 String batteryLife = BluetoothHeadset.getBatteryLifeInfo();
		 String modelName = BluetoothHeadset.getModelNameInfo();
		 String connectivity = BluetoothHeadset.getConnectivityInfo();
		 String batteriesIncluded = BluetoothHeadset.getBatteriesIncludedInfo();
		
		System.out.println("Headphones jack : " + headphonesJack);
		System.out.println("Material : " + material);
		System.out.println("ControlType : " + controlType);
		System.out.println("Item weight : " + itemWeight);
		System.out.println("Style : " + style);
		System.out.println("Number of items : " + numberOfItems);
		System.out.println("Battery life : " + batteryLife);
		System.out.println("Model name : " + modelName);
		System.out.println("Connectivity : " + connectivity);
		System.out.println("Batteries included : " + batteriesIncluded);
		}
	}