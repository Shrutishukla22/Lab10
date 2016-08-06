package moviesByCatagories;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab10Main {

	public static void main(String[] args) {
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Welcome to the movie List Application");
		String choice = "yes";
		while (choice.equalsIgnoreCase("yes")) {

			System.out.println("What catagory you interested in?");
			String input1 = scan1.nextLine();
			
			ArrayList<Movie> list = new ArrayList<Movie>();
			list.add(new Movie("Jason Bourne", "Action"));
			list.add(new Movie("Captain America", "Action"));
			list.add(new Movie("Frozen", "Animated"));
			list.add(new Movie("Inside out", "Animated"));
			list.add(new Movie("Bridesmade", "Drama"));
			list.add(new Movie("Captain Fantastic", "Drama"));
			list.add(new Movie("Ghostbuster", "scifi"));
			list.add(new Movie("Martians", "scifi"));
			list.add(new Movie("Mother's Day", "comedy"));
			list.add(new Movie("High School", "comedy"));
			boolean found=false;
			for(int i=0;i<list.size();i++){
		    	   if(input1.equalsIgnoreCase(list.get(i).getCategory())){
		    		   System.out.println(list.get(i).getTitle());
		    		   found=true;
		    	   }	
			}
			if(!found){
				System.out.println("this category does not exist");
			}
			System.out.println("do you want to enter another catagory?");
			choice = scan1.nextLine();
		}
	}

}
