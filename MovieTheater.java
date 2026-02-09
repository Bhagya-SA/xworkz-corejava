class MovieTheater{
	public static void main(String[] movietheater) {
		String theaterName = "Navarang";
		String location = "Rajajinagar, 1st stage";
		String movies[] = {"KGF Chapter-1" , "Kantara" , "RRR" , "Kalki AD 2989"};
		String movieGenres[] = {"Action" , "Comedy" , "Suspense"};
		String seatTypes[] = {"Balcony" , "Gold" , "Silver"};
	
	    System.out.println("****************************" + theaterName + "********************");
		System.out.println(" ");
		
		System.out.println("Location of the theater" + theaterName);
		System.out.println(" ");
		
		System.out.println("Total number of movies : " + movies.length);
		System.out.println("List of movies as follows");
		for(String movie : movies) System.out.println(movie);
		System.out.println(" ");
		
		System.out.println("Total number of genre available : " + movieGenres.length);
		System.out.println("Movie genres is as follows");
		for(String movieGenre : movieGenres) System.out.println(movieGenre);
		System.out.println(" ");
		
		System.out.println("Total number of seat types available in the theater : " + seatTypes.length);
		System.out.println("Seat types are as follows");
		for(String seatType : seatTypes) System.out.println(seatType);
	    System.out.println(" ");
	}
}