class AmazonPrime {
	public static void main(String[] amazon) {
		String hindiMovies[] = {"Jugnuma : The Fable" , "120 Bahadur" , "Border" , "Shakuntala Devi" , "Kabhi Khushi Kabhi Gham" , "DDLJ" ,"Kuch Kuch Hota hai" , "Super nani" , "Saina" , "Faana" , "Kahani" , "Bhag Milkha Bhag" , "Masti" , "Veer Sara" , "Rustom" , "Masti" , "Drishyam", "Shershaah" , "Mary Kom" , "Airlift"};
		
		String englishMovies[] = {"Last swim" , "Rabbit trap" , "The Wrecking crew" , "Girls will be girls" , "SpiderMan" , "This time next year" ,"Red One" , "me before you" , "Jurassic park" , "Good night oppy" , "Tom and jerry" , "Jumanji" , "Your fault" , "Our fault" , "A nice boy" , "The conjuring" , "Friends with Benefits", "Boss baby" , "My fault" , "Hangover"};
		
		String teluguMovies[] = {"Fidaa" , "Ninnu Kori" , "Middle class melodies" , "Sasivadane" , "Hello guru premakosam" , "Dear Comrade" ,"Swathimutyam" , "Radhe shyam" , "Chintakayala Ravi" , "Kanya Kumariaa" , "Namo Venkatesha" , "Jaanu" , "Ready" , "Majili" , "Oka Laila Kosam" , "Kushi" , "Boss", "Oh my friend" , "Krishna" , "Rangasthlam"};
		
		String tamilMovies[] = {"Jai Bhim" , "Mahaan" , "Asuran" , "Master" , "Mark Antony" , "Thangalaan" ,"Kanguva" , "Amaran" , "The greatest of all time(GOAT)" , "Vettaiyan" , "Maharaja" , "Raayan" , "Maaveeran" , "Pathu Thala" , "Yaathisai" , "Weapon" , "Dr56", "Itu Mugan" , "Kadaisi Ulaga Por" , "Bigil"};
		
		String malayalamMovies[] = {"Golam" , "Athi Bheekara kaamukan" , "Aavesham" , "Kaathal-The core" , "Drishyam" , "Dhrishyam 2" ,"Mura" , "Pachuvum Athbutha Vilakkum" , "Kanguva" , "Udal" , "Thalavara" , "Joesph" , "Bannerghatta" , "Kooman" , "Soothravakyam" , "Antony" , "Ela Veezha Poonchira", "Christopher" , "Level cross" , "Cold case"};
		
		String kannadaMovies[] = {"KGF chapter-1" , "KGF chapter-2" , "Kantara" , "Katha Sangama" , "French Biryani" , "Brat" ,"Sapta Sagaradaache ello : Side A" , "Sapta Sagaradaache ello : Side B" , "Yaana" , "777 Charlie" , "Dia" , "Love Mocktail" , "Kavaludari" , "Rathnan Prapancha" , "Home" , "Act 1978" , "Avane Srimannarayana", "Gandhada Gudi" , "Hondisi bareyeri" , "Katha Sangama"};
		
		String marathiMovies[] = {"Asambhav" , "Sant Dnyaneshwaranchi Muktai" , "JHIMMA" , "Bin Lagnachi Goshta" , "Naach Ga Ghuma" , "Gharat Ganpati" ,"BALOCH" , "Shivrayancha Chhava" , "Phullwanti" , "Hashtag Tadev Lagnam" , "Aajcha Divas Majha" , "Medium Spicy" , "Tukaram" , "Pawankhind" , "Bai Ga" , "Ashi Hi Jamva Jamvi" , "Jilabi", "Mumbai Pune Mumbai 3" , "Juna Furniture" , "Subhedar"};
		
		String punjabiMovies[] = {"Yaar Mera Titliaan Warga" , "Honsla Rakh" , "" , "Nikka Zaildar 3" , "Chal Mera Putt" , "Galwakdi" ,"Chandigarh Amritsar Chandigarh" , "Shadaa" , "Shava Ni Girdhari Lal" , "Ek Aur Ek Gyarah" , "Sher Bagga" , "Godday Godday Chaa" , "Mahi Mera Nikka Jeha" , "Ji Wife Ji" , "Saunkan Saunkne" , "Bina Band Chal England" , "Aa Gaye Munde UK De", "Pinky Moge Wali 2" , "Bajre Da Sitta" , "Blackia"};
		
		String bengaliMovies[] = {"Cockpit" , "Flat No. 609" , "Rupey Tomay Bholabo Na" , "Sonar Kella" , "Pather Panchali" , "Byomkesh Parbo" ,"Alinagarer Golokdhadha" , "Borfi" , "K: The Secret Eye" , "Badshahi Angti" , "Kishmish" , "Hirak Rajar Deshe" , "Dhonni Meye" , "Chaar" , "Ranna Baati" , "Ebar Shabor" , "Hullor", "Drishtikone" , "Abhimaan" , "Sesh Anka"};
		
		String gujarathiMovies[] = {"Dear Father" , "Ratanpur" , "Trisha On The Rocks" , "Gujjubhai Most Wanted" , "Jija Sala Jija" , "Love Ni Bhavai" ,"Gajab Thai Gayo!" , "Nayika Devi: The Warrior Queen" , "21 Divas" , "FULEKU" , "Builder Boys" , "Dhunki" , "FRENDO" , "Luv Ni Love Storys" , "Tari Sathe" , "Lakiro" , "Dhaad", "Halkie Fulkee" , "Gujarati Wedding In Goa" , "Ventilator"};
		
		String internationalMovies[] = {"Talaash" , "Rad cliff" , "Taxi" , "Crazy" , "Insomnia" , "Mario" ,"Maquia" , "City on fire" , "The Wailinig" , "Memories" , "Dil Chahta hai" , "Penguin Highway" , "Another Round" , "Barbara" , "A Hero" , "Jiro Dreams of Sush" , "Transit", "A Man Called Ove" , "The Salesman" , "WarGames"};	
		
		System.out.println("***********************" + "List of HINDI MOVIES" + "*************************");
		for(String hindiMovie : hindiMovies) {
			System.out.println(hindiMovie);
		}
		
		System.out.println("***********************" + "List of ENGLISH MOVIES" + "*************************");
		for(String englishMovie : englishMovies) {
			System.out.println(englishMovie);
		}
		
		System.out.println("***********************" + "List of TELUGU MOVIES" + "*************************");
		for(String teluguMovie : teluguMovies) {
			System.out.println(teluguMovie);
		}
		
		System.out.println("***********************" + "List of TAMIL MOVIES" + "*************************");
		for(String tamilMovie : tamilMovies) {
			System.out.println(tamilMovie);
		}
		
		System.out.println("***********************" + "List of MALAYALAM MOVIES" + "*************************");
		for(String malayalamMovie : malayalamMovies) {
			System.out.println(malayalamMovie);
		}
		
		System.out.println("***********************" + "List of KANNADA MOVIES" + "*************************");
		for(String kannadaMovie : kannadaMovies) {
			System.out.println(kannadaMovie);
		}
		
		System.out.println("***********************" + "List of MARATHI MOVIES" + "*************************");
		for(String marathiMovie : marathiMovies) {
			System.out.println(marathiMovie);
		}
		
		System.out.println("***********************" + "List of PUNJABI MOVIES" + "*************************");
		for(String punjabiMovie : punjabiMovies) {
			System.out.println(punjabiMovie);
		}
		
		System.out.println("***********************" + "List of BENGALI MOVIES" + "*************************");
		for(String bengaliMovie : bengaliMovies) {
			System.out.println(bengaliMovie);
		}
		
		System.out.println("***********************" + "List of GUJARATHI MOVIES" + "*************************");
		for(String gujarathiMovie : gujarathiMovies) {
			System.out.println(gujarathiMovie);
		}
		
		System.out.println("***********************" + "List of INTERNATIONAL MOVIES" + "*************************");
		for(String internationalMovie : internationalMovies) {
			System.out.println(internationalMovie);
		}
		
	}

}