package movieapp.movie;

import java.util.Arrays;

import movieapp.enums.Genre;
import movieapp.enums.Rating;
import movieapp.review.Review;
import movieapp.review.Reviewer;

public class Main {

	public static void main(String[] args) {
		Reviewer reviewer1 = new Reviewer("Dennis", "Teise");
		Reviewer reviewer2 = new Reviewer("Erkan", "Colakoglu");
		Reviewer reviewer3 = new Reviewer("Alexandra", "Grigoreva");
		Review reviewInception1 = new Review(reviewer1, "Top Movie", 1111, Rating.VERY_GOOD);
		Review reviewInception2 = new Review(reviewer2, "Average Movie - dislike the end", 3333, Rating.OK);
		Review reviewInception3 = new Review(reviewer3, "Not my taste, I prefer Soap Operas", 2222, Rating.VERY_BAD);

		Review reviewSuperbad1 = new Review(reviewer1, "Damn fun, love that McLovin guy", 220, Rating.VERY_GOOD);
		Review reviewSuperbad2 = new Review(reviewer2, "Funny! Recommendable", 120, Rating.GOOD);
		Review reviewSuperbad3 = new Review(reviewer3, "Super funny", 330, Rating.VERY_GOOD);

		Movie inception = new Movie("Inception", Genre.THRILLER);
		Movie superbad = new Movie("Superbad", Genre.COMEDY);
		Movie killbill = new Movie("Kill Bill", Genre.ACTION);

		inception.addReview(reviewInception1);
		inception.addReview(reviewInception1);
		inception.addReview(reviewInception2);
		inception.addReview(reviewInception3);

		superbad.addReview(reviewSuperbad1);
		superbad.addReview(reviewSuperbad2);
		superbad.addReview(reviewSuperbad3);

		MovieDatabase database = new MovieDatabase();
		database.addMovie(inception);
		database.addMovie(superbad);
		database.addMovie(killbill);

		MovieReport[] movieReport = database.generatePopularMovieReport();

		System.out.println("LIST MOVIEREPORT");
		
		for (int i = 0; i < movieReport.length; i++) {
			System.out.println(movieReport[i]);
		}

		System.out.println("LIST BY GENRE");
		System.out.println(Arrays.toString(database.listMoviesByGenre(Genre.THRILLER)));
	}

}
