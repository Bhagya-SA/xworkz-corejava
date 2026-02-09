class RelianceSmartBazaar {
	public static void main(String[] args) {
		String fruits[] = {"Apple(Red Delicious)" , "Apple(Green/Granny Smith)" , "Banana(Robusta)" , "Banana(Elaichi)" , "Mango(Alphonsa)" , "Mango(Kesar)" , "Green grapes" , "Red globe grapes" , "Black grapes" , "Papaya" , "Watermelon" , "Muskmelon" , "Pomegranate" , "Orange" , "Kinnow" , "Guava" , "Pineapple" , "Kiwi" , "Dragon Fruit" , "Pear" , "Sapota" , "Strawberry" , "Coconut" , "Lemon" , "Custard apple"};
		
		String vegetables[] = {"Onions" , "Potatoes" , "Tomatoes" , "Spinach" , "Cabbage" , "Cauliflower" , "Brinjal" , "Lady finger" , "Carrots" , "Beetroot" , "Ginger" , "Garlic" , "Green Beans" , "Cucumber" , "capsicum" , "Broccoli" , "Mushrooms" , "Coriander leaves" , "Bottle Gourd" , "Bitter Gourd" , "Lemons" , "Redish" , "Green peas" , "Green chili" , "Sweet corn"};
		
		String stationaryItems[] = {"Long notebooks" , "Spiral notebooks" , "A4 Copier paper" , "Graph books" , "Exam sheets/Pads" , "Drawing books" , "Brown paper cover rolls" , "Ballpoint pens" , "Gel pens" , "Graphite Pencils" , "Highlighter" , "Permanent Markers" , "Sketch pens" , "Mechanical Pencils" , "Oil Pastels" , "Wax Cryons" , "Poster colors" , "Oil Paint Brushes/Brushes" , "Geometry Box" , "Erasers" , "Sharpeners" , "Glue sticks" , "Scissors" , "Files and Folders" , "Staplers and Pins"};
		
		String packedFoodItems[] = {"Potato chips" , "Namkeen & Savoury snacks" , "Roasted Chana" , "Makhana" , "papads & Ready-to-Fry" , "Extrude & Snacks" , "Glucose biscuits" , "Cream Biscuits" , "Marie Biscuits" , "Cookies" , "Chocolates" , "Wafers" , "Choco Pie" , "Instant noodles" , "Ready-to-cook Mixes" , "Pasta & Macaroni" , "Vermicelli" , "Frozen Veg Snacks" , "Ready-to-eat curries" , "Soup mixes" , "Instant gulab Jamun" , "Oats" , "Breakfast Cereals" , "Jams & Spreads" , "Honey"};
		
		String groomingProducts[] = {"Fash wash" , "Bathing Bars" , "Shower Gels" , "Body scrubs" , "Body lotions" , "Sunscreen" , "Talcum powder" , "Hand sanitizers" , "Hand wash" , "Hair oil" , "Shampoo" , "Hair conditioner" , "Hair serum" , "Dry Shampoo" , "Hair styling gel" , "Beard trimmers" , "Shaving foam" , "After shave lotion" , "Beard oil" , "Men's specialized facewash" , "Loofahs" , "Oral Care" , "Deodorants" , "Compact makeup"};
		
		String skinCares[] = {"Pears pure & Gentle glycerine soap" , "Dove cream beauty bathing bar" , "Fiama multivariant gel bars" , "Medimix Ayurvedic soap" , "Mysore sandal soap" , "Simple refreshing facial wash" , "Pond's Hydra Miracle Gel Facewash" , "Mamaearth Rice Face Wash" , "Lacto Calamine Salicylic Acid Body Wash" , "Dettol Original Bathing Soap Bar" , "Godrej No.1 Lime and Aloe Vera Soap" , "Lakmé Peach Milk Moisturizer" , "Nivea Shea Smooth Lotion" , "Mamaearth Ubtan Moisturizing Body Lotion" , "Pond's Bright Beauty Serum Cream" , "Plum Green Tea Renewed Clarity Night Gel" , "Plum E-luminence Deep Moisturizing Creme" , "Lacto Calamine Face Lotion (for Oily Skin)" , "Plum 15% Vitamin C Face Serum (Mandarin)" , "Plum 2% Encapsulated Salicylic Acid Serum" , " Plum 1% Retinol Face Serum with Bakuchiol" , "Mamaearth Vitamin C Daily Glow Sunscreen" , "Dermatouch Kojic Acid Soap (for Pigmentation)" , "Plum Green Tea Pore Cleansing Face Wash"};
		
		String hairCares[] = {"Anti-dandruff shampoo" , "Hydrating/Moisture shampoo" , "Onion shampoo for hair fall" , "Color-protect shampoo" , "Sulfate-free shampoo" , "Dry shampoo" , "Volumizing shampoo" , "Herbal/Natural shampoo" , "Daily moisture conditioner" , "Smoothing/Frizz-control conditioner" , "Deep conditioning hair mask" , "Onion hair mask" , "Leave-in conditioner" , "Keratin-smooth mask" , "Onion hair oil" , "Ayurvedic hair oil" , "Coconut oil" , "Almond oil" , " Hair serum for shine/frizz" , "Serum for damage repair" , "Hair styling gel" , "Hair wax/pomade" , "Hair mousse" , "Heat protectant spray" , "Hair building fibers "};
		
		String hygieneProducts[] = {"Hand Sanitizers" , "Handwash" , "Bathing Bars/Soaps" , "Shower Gel/Body Wash" , "Shampoo" , "Conditioner" , "ToothBrush" , "Tootpaste" , "MouthWash" , "Body spray" , "Talcum Powder" , "Face Wash" , "Shaving Gel/Cream" , "Razors" , "Sanitary Pads/Napkins" , "Tampons" , "Panty Liners" , "Wet Wipes/Face Wipes" , "Body Lotion" , "Cotton Buds" , "Toilet Cleaner Liquid/Powder" , "Floor Cleaner Liquid", "Glass Cleaner" , "Dishwashing Liquid/Bar" , "Disinfectant Spray/Liquid "} ;
		
		String homewareMerchandises[] = {"Non-stick cookware sets" , "Stainless steel containers" , "Pressure cookers" , "Glassware sets" , "Dinner sets" , "Kitchen storage jars" , "Cutlery sets" , "Gas stoves" , "Chopping boards & knives" , "Insulated water bottles & flasks" , " Floor mops & buckets" , "Plastic buckets & tubs" , "Cleaning brushes & wipers" , "Garbage bags" , "Laundry baskets" , "Hangers & wardrobe organizers" , "Bed sheets & pillow cover" ," Curtains" , "Cushions & covers" , "Bath mats" , "Door mats" , "Wall clocks" , "Artificial flowers/vases" , "Storage organizers" , "Small furniture items (plastic chairs, stools) "};
		
		String cookwares[] = {"Non-stick Dosa Tawa" , "Non-stick Fry Pan" , "Non-stick Kadhai" , "Non-stick Appam Patra" , "Non-stick Tadka Pan" , "Non-stick Omelette Pan" , "Non-stick Cookware Sets" , "Tri-ply Stainless Steel Kadhai" , "Tri-ply Stainless Steel Fry Pan" , "Tri-ply Stainless Steel Fry Pan" , "Tri-ply Stainless Steel Saucepan" , "Stainless Steel Tope/Patila" , "Stainless Steel Handi" , "Stainless Steel Tadka Pan" , "Stainless Steel Idli Pot" , "Stainless Steel Steamer/Idli Cooker" , "Copper Bottom Handi/Tope" , "Stainless Steel Milk Boiler" , "Aluminium Pressure Cooker" , "Stainless Steel Pressure Cooker" , "Hard Anodised Pressure Cooker" , "Pressure Pan" , "Hard Anodised Kadhai/Kadai" , "Iron Roti Tawa" , "Iron Kadhai" , "Iron Tadka Pan"};
		
		String kitchenAppliances[] = {"Cooktops & Hobs" , "Mixer Grinders" , "Induction Cooktops" , "Gas stoves" , "Electric kettles" , "Air Fryers" , "Microwave oven" , "Sandwich makers" , "Oven Toaster grillers" , "Rice cookers" , "Blenders" , "Food processors" , "Coffee makers" , "Juicers" , "Electric flour mills" , "Water Purifiers" , "Pop-up Toasters" , "Egg Boilers" , "Hand mixers" , "Electric choopers" , "Water dispensers" , "Built-in-hobs" , "electric chimneys" , "Deep fryers" , "Dishwashers" };
		
		String kitchenStorageSolutions[] = {"Airtight plastic containers" , "Stainless steel spice containers" , "Glass storage jars with bamboo lids" , "Refrigerator drawer organizers" , "Modular kitchen racks/shelves" , "Stackable spice organizers" , "Grain dispensers/containers" , "Plastic cutlery organizers" , "Under-sink storage racks" , "Magnetic knife holders" , "Corner storage racks" , "Vegetable and fruit wire baskets" , "Airtight glass canisters" , "Container sets for dry fruits" , "Microwave-safe storage bowls" , "Hanging pantry organizers" , "Spice racks for countertops" , "Modular plastic drawer units" , "Stainless steel pantry organizers" , "Oil dispensers" , "Airtight lunch boxes" , "Silicone food storage bags" , "Wall-mounted spice racks" , "Modular cereal dispensers" , "Stackable storage crates "};
		
		String clothingForMen[] = {"Polo T-shirts" , "Graphic T-shirts" , "Round Neck T-shirts" , "Full Sleeve T-shirts" , "Oversized T-shirts" , "Printed Casual Shirts" , "Linen Shirts" , "Denim Shirts" , "Mandarin Collar Shirts" , "Formal Shirts" , "Slim Fit Jeans" , " Regular Fit Jeans" , "Comfort Fit Jeans" , "Chinos" , "Formal Trousers" , "Joggers" , "Cargo Shorts" , "Denim Shorts" , "Track Pants" , "Kurta Sets" , "Short Kurtas" , "Kurta Pajamas" , " Jackets" , "Sweatshirts & Hoodies" , " Windcheaters"};
		
		String clothingForWomen[] = {"Kurta/Kurtis" , "Churidars" , "Salwar Kameez Sets" , "Sarees" , "Leggings" , "Palazzos" , "Ethnic Jackets" , "Lehenga Choli Sets" , "Dupattas" , "Ethnic Skirts " , "T-shirts " , "Denim Jeans" , "Jeggings" , "Casual Tops/Shirts" , "Dresses & Frocks" , "Jumpsuits" , "Playsuits" , "Dungarees" , "Shorts" , "Capris" , "Shrugs/Cardigans" , "Blazers/Formal Jackets" , "Gym Tops/Tanks" , "Trackpants/Joggers" , "Active Shorts/Skorts"};
		
		String luggages[] = {"Hard-shell spinner trolley" , "Hard-shell spinner trolley" , "Hard-shell spinner trolley" , "Soft-shell trolley suitcase" , "Soft-shell trolley suitcase" , "Lightweight polycarbonate cabin bag" , "Polypropylene luggage set" , "Expandable soft-shell trolley" , "Travel duffle bag with wheels" , "Compact duffle bag" , "Cabin-size business trolley" , "Laptop-compatible backpack" , "Rucksack for trekking" , "Weekend travel bag" , "Travel backpack with trolley handle" , "Kids' trolley suitcase" , "Hanging toiletry bag" , "Travel suitcase covers" , "Packing cubes set" , "Travel sling bag" , "Leather messenger bag" , "Briefcase trolley" , "Garment bag" , "Travel neck pillow" , "Luggage security locks"};
		
		String toys[] = {"Soft Toys" , "Remote Control cars" , "Die-cast Alloy Model Bikes" , "3-Wheel Skating Scooters" , "2-Wheel Foldable Kick Scooters" , "Musical Kids Tricycles" , "Battery-Operated Ride-on Scooters" , "Action Figures" , "Monster Trucks" , "Board Games" , "Educational/STEM Building Sets" , "Bubble Shooter Guns" , "Hand-press Portable Fans" , "Art Sets & Drawing Kits" , "Doll Playsets" , "Doll Playsets" , "Puzzle Games" , "Musical Toy Guitar" , "Indoor Sports Equipment" , "Animal Figures" , "Kitchen Set Toys" , "Toy Weapons/Blasters" , "Kitchen/Home Utility Miniature Sets" , "Wooden Spinning Tops" , "Remote Control Snakes" , "Wiggle/Swing Cars"};
		
		String electronics[] = {"Refrigerator" , "Washing machine" , "Air conditioner" , "LED Televisions" , "Air Coolers" , "Water Heaters/Geysers" , "Microwave Ovens" , "Dishwashers" , "Deep Freezers" , "Vacuum Cleaners" , "Induction Cooktops" , "Electric Kettles" , "Mixer Grinders" , "Sandwich Makers/Toasters" , "Rice Cookers" , "Coffee Makers" , "Air Fryers" , "Juicers/Blenders" , "Water Purifiers (RO/UV)" , "Smartphones" , "Feature Phones" , "Tablets" , "Laptops/Computers" , "Smartwatches/Wearables" , " Audio Systems"};
		
		String accessories[] = {"Women’s Handbags & Purses" , "Fashion Belts" , "Scarves & Stoles" , "Fashion Jewelry" , "Bracelets & Bangles" , "Sunglasses" , "Wallets & Clutches" , "Watches" , "Hair Accessories" , "Shapewear Accessories" , "Mobile Cases/Covers" , "Screen Protectors/Tempered Glass" , "Bluetooth Earphones/Earbuds" , "Portable Chargers/Power Banks" , "Mobile Chargers & Adapters" , "USB Cables/Charging Cables" , "Bluetooth Speakers" , "Laptop Cases/Sleeves" , "Smart Wearable Straps" , "Camera Accessories" , " Hairbrushes & Combs" , " Makeup Pouches/Organizers" , "Bath Sponges & Loofahs" , "Kitchen Storage Containers" , "Decorative Wall Clocks"};
		
		String homeAppliances[] = {"Refrigerator" , "Microwave Oven" , "Induction Cooktop" , "Gas Stove/Hob" , "Mixer Grinde" , "Electric Kettle" , "Toaster" , "Juicer" , "Blender" , "Air Fryer" , "Water Purifier" , "Sandwich Maker" , "Food Processor" , "Dishwasher" , "Washing Machine" , "Air Conditioner" , "Air Cooler" , "Ceiling Fan" , "Pedestal Fan" , "Vacuum Cleaner" , "Iron" , "Water Heater" , "Inverter/UPS" , "Air Purifier" , "Sewing Machin"};
		
		String homeDecors[] = {"Bedsheets" , "Pillow Covers" , "Comforters/Duvets" , "Curtains" , "Door Mats" , "Bath Mats" , "Floor Carpets/Rugs" , "Cushion Covers" , "Filled Cushions" , "Cushion Fillers" , "Table Cloths" , "Table Runners" , "Placemats" , "Wall Clocks" , "Photo Frames" , "Artificial Flowers" , "Flower Vases" , "Decorative Showpieces/Figurines" , "Scented Candle" , "Candle Holders" , "Fragrance Diffusers" , "Wall Hangings" , "Decorative Mirrors" , "Storage Baskets/Organizers" , "Small Furniture Items"};
	    
		System.out.println("List of FRUITS");
		
		for(String fruit : fruits)
			System.out.println(fruit);
		
		System.out.println("List of VEGETABLES");
		
		for(String vegetable : vegetables)
			System.out.println(vegetable);
		
		System.out.println("List of STATIONARY ITEMS");
		
		for(String stationaryItem : stationaryItems)
			System.out.println(stationaryItem);
		
		System.out.println("List of PACKED FOOD ITEMS");
		
		for(String packedFoodItem : packedFoodItems) 
			System.out.println(packedFoodItem);
		
		System.out.println("List of GROOMING PRODUCTS");
		
		for(String groomingProduct : groomingProducts)
			System.out.println(groomingProduct);
		
		System.out.println("List of SKIN CARES");
		
		for(String skinCare : skinCares) 
			System.out.println(skinCare);
		
		System.out.println("List of HAIR CARES");
		
		for(String hairCare : hairCares) 
			System.out.println(hairCare);
		
		System.out.println("List of HYGIENE PRODUCTS");
		
		for(String hygieneProduct : hygieneProducts)
			System.out.println(hygieneProduct);
		
		System.out.println("List of HOME MERCHANDISES");
		
		for(String homewareMerchandise : homewareMerchandises) 
			System.out.println(homewareMerchandise);
		
		System.out.println("List of COOKWARES");
		
		for(String cookware : cookwares)
			System.out.println(cookware);
		
		System.out.println("List of KITCHEN APPLIANCES");
		
		for(String kitchenAppliance : kitchenAppliances) 
			System.out.println(kitchenAppliance);
		
		System.out.println("List of KITCHEN STORAGE SOLUTIONS");
		
		for(String kitchenStorageSolution : kitchenStorageSolutions) 
			System.out.println(kitchenStorageSolution);
		
		System.out.println("List of CLOTHING FOR MEN");
		
		for(String clothForMen : clothingForMen)
			System.out.println(clothForMen);
		
		System.out.println("CLOTHING FOR WOMEN");
		
		for(String clothForWomen : clothingForWomen)
			System.out.println(clothForWomen);
		
		System.out.println("LUGGAGES");
		
		for(String luggage: luggages) 
			System.out.println(luggage);
		
		System.out.println("List of TOYS");
		
		for(String toy : toys) 
			System.out.println(toy);
		
		System.out.println("List of ELECTRONICS");
		
		for(String electronic : electronics)
			System.out.println(electronic);
		
		System.out.println("List of ACCESSORIES");
		
		for(String accessorie : accessories)
			System.out.println(accessorie);
		
		System.out.println("List of HOME APPLIANCES");
		
		for(String homeAppliance : homeAppliances)
			System.out.println(homeAppliance);
		
		System.out.println("List of HOME DECORS");
		
		for(String homeDecor : homeDecors)
			System.out.println(homeDecor);
	 
	 
	}
	


}