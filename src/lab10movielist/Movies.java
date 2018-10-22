package lab10movielist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Movies {

	private String category;
	private String movieTitle;

	// blank constructor. leave blank
	public Movies() {

	}

	// overloading constructor
	public Movies(String movieTitle, String category) {
		this.category = category;
		this.movieTitle = movieTitle;
	}

	public String getCategory() {// getting the category for movies
		return category;
	}

	public void setCategory(String category) {// setting the category for movies
		this.category = category;
	}

	public String getMovieTitle() {// getting movie title
		return movieTitle;
	}

	public void setMovieTitle(String movieTitle) {// setting movie title
		this.movieTitle = movieTitle;
	}

	// method to generate Array List
	public ArrayList<Movies> listOfMovies() {

		// Actual Array List of Movies
		ArrayList<Movies> list = new ArrayList<>();// Adding all the movies in the list using the .add for the array
													// method
		list.add(new Movies("White Chicks", "comedy"));
		list.add(new Movies("Zoolander", "comedy"));
		list.add(new Movies("Friday", "comedy"));
		list.add(new Movies("Superbad", "comedy"));
		list.add(new Movies("21 Jump Street", "comedy"));
		list.add(new Movies("Pulp Fiction", "drama"));
		list.add(new Movies("Taken", "drama"));
		list.add(new Movies("The Godfather", "drama"));
		list.add(new Movies("Scarface", "drama"));
		list.add(new Movies("City of God", "drama"));
		list.add(new Movies("Godzilla", "animated"));
		list.add(new Movies("The Lion King", "animated"));
		list.add(new Movies("Toy Story", "animated"));
		list.add(new Movies("Moana", "animated"));
		list.add(new Movies("Dragonball Super", "animated"));
		list.add(new Movies("Star Wars: A New Hope", "scifi"));
		list.add(new Movies("Avatar", "scifi"));
		list.add(new Movies("The Matrix", "scifi"));
		list.add(new Movies("Poltregiest", "scifi"));
		list.add(new Movies("Back to the Future", "scifi"));
		list.add(new Movies("The Exorcist", "horror"));
		list.add(new Movies("Friday the 13th", "horror"));
		list.add(new Movies("Conjuring 2", "horror"));
		list.add(new Movies("Sinister", "horror"));
		list.add(new Movies("Paranormal Activity", "horror"));
		list.add(new Movies("Dead Pool", "action"));
		list.add(new Movies("The Avengers", "action"));
		list.add(new Movies("Black Panther", "action"));
		list.add(new Movies("The Equalizer", "action"));
		list.add(new Movies("Brick Mansions", "action"));
		list.add(new Movies("Hatchet", "Horror"));
		list.add(new Movies("Creep", "thriller"));
		list.add(new Movies("Predator", "Scifi"));
		list.add(new Movies("Monster House", "animated"));
		list.add(new Movies("Transformers", "action"));
		list.add(new Movies("Moonlight", "drama"));
		list.add(new Movies("Alien","thriller"));
		list.add(new Movies("Rocky","action"));
		list.add(new Movies("The Maze Runner","Scifi"));
	    list.add(new Movies("Step Brothers","comedy"));
		list.add(new Movies("Insidious","horror"));
		list.add(new Movies("Jumper","Scifi"));
	    list.add(new Movies("A Quiet Place","horror"));
	    list.add(new Movies("Twilight","drama"));
	    list.add(new Movies("Split","thriller"));
	    list.add(new Movies("Home Alone","comedy"));
	    list.add(new Movies("Kingsmen","action"));
	    list.add(new Movies("Iron Giant","animated"));
	    list.add(new Movies("Hot Tub Time Machine","comedy"));
	    list.add(new Movies("Dope","drama"));
	    				
						
		

		return list;
	}

	@Override
	public String toString() {

		return movieTitle;
	}
}
