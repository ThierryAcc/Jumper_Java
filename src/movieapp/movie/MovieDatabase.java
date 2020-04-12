package movieapp.movie;

import java.util.Arrays;

import movieapp.enums.Genre;
import movieapp.review.Review;

public class MovieDatabase {
	Movie movies[] = new Movie[0];

	public MovieDatabase() {

	}

	public MovieDatabase(Movie[] movies) {
		super();
		this.movies = movies;
	}

	public Movie[] getMovies() {
		return movies;
	}

	@Override
	public String toString() {
		return "MovieDatabase [movies=" + Arrays.toString(movies) + "]";
	}

	/**
	 * Add Movie to the database Only add Movie to the table if it doesn't already
	 * exist
	 * 
	 * @param movie - will be added to database
	 */
	public void addMovie(Movie movie) {
		boolean exists = true;
		for (int i = 0; i < movies.length; i++) {
			if (movie.getTitle().equals(movies[i].getTitle())) {
				exists = !exists;
				break;
			}
		}

		if (exists) {
			this.movies = Arrays.copyOf(this.movies, this.movies.length + 1);
			this.movies[this.movies.length - 1] = movie;

		}
	}

	/**
	 * Iterates over single movie object and finds review with most clicks
	 * 
	 * @param movie - the movie to iterate over
	 * @return return Review with most clicks
	 */
	public Review getMostPopularReview(Movie movie) {
		Review[] reviews = movie.getReviews();

		if (reviews != null && reviews.length == 1) {
			return reviews[0];
		}

		if (reviews != null && reviews.length > 1) {
			Review mostClickedReview = reviews[0];
			int mostClicks = mostClickedReview.getClicks();
			for (int i = 0; i + 1 < reviews.length; i++) {
				if (mostClicks <= reviews[i + 1].getClicks()) {
					mostClickedReview = reviews[i + 1];
				}
			}
			return mostClickedReview;
		}

		return null;
	}

	/**
	 * Parse the Database. Parse the movies: for each movie add the most popular
	 * Review to the movieReports-Array
	 * 
	 * @return an array of MovieReport
	 */
	public MovieReport[] generatePopularMovieReport() {
		MovieReport[] movieReports = new MovieReport[0];

		if (movies != null) {
			for (int i = 0; i < movies.length; i++) {
				if(movies[i].getReviews()!=null) {
					Review mvpReview = this.getMostPopularReview(movies[i]); // returns the review
					if(mvpReview!=null) {
						movieReports = Arrays.copyOf(movieReports, movieReports.length + 1);
						movieReports[movieReports.length - 1] = new MovieReport(movies[i].getTitle(), movies[i].getGenre(),
								mvpReview.getReviewer().getFirstname() + " " + mvpReview.getReviewer().getLastname(),
								mvpReview.getText(), mvpReview.getRating());					
					}
					
				}
			}
		}

		return movieReports;
	}

	/**
	 * Get all Movies by a specific genre
	 * 
	 * @param genre - filter for the array
	 * @return Array of Movies
	 */
	public Movie[] listMoviesByGenre(Genre genre) {
		Movie[] moviesByGenre = new Movie[0];
		if (this.movies != null) {
			for (int i = 0; i < movies.length; i++) {
				if (genre.equals(movies[i].getGenre())) {
					moviesByGenre = Arrays.copyOf(moviesByGenre, moviesByGenre.length + 1);
					moviesByGenre[moviesByGenre.length - 1] = movies[i];
				}
			}
			return moviesByGenre;
		}
		return null;
	}

}
