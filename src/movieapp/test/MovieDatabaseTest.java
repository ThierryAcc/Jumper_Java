package movieapp.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import movieapp.enums.Genre;
import movieapp.enums.Rating;
import movieapp.movie.Movie;
import movieapp.movie.MovieDatabase;
import movieapp.movie.MovieReport;
import movieapp.review.Review;
import movieapp.review.Reviewer;

public class MovieDatabaseTest {
	MovieDatabase database;
	Movie movie1;
	Movie movie2;
	Reviewer reviewer1;
	Reviewer reviewer2;
	Reviewer reviewer3;
	Review reviewInception1;
	Review reviewInception2;
	Review reviewInception3;
	MovieReport[] movieReports = {};

	@Before
	public void setup() {
		database = new MovieDatabase();
		movie1 = new Movie("Inception", Genre.THRILLER);
		movie2 = new Movie("Superbad", Genre.COMEDY);

		reviewer1 = new Reviewer("Dennis", "Teise");
		reviewer2 = new Reviewer("Erkan", "Colakoglu");
		reviewer3 = new Reviewer("Alexandra", "Grigoreva");
		reviewInception1 = new Review(reviewer1, "Top", 1111, Rating.VERY_GOOD);
		reviewInception2 = new Review(reviewer2, "Average", 3333, Rating.OK);
		reviewInception3 = new Review(reviewer3, "Not", 2222, Rating.VERY_BAD);
	}

	@Test
	public void testAddMovie() {
		Movie[] expected = { movie1 };
		database.addMovie(movie1);
		assertArrayEquals(expected, database.getMovies());
	}

	@Test
	public void testEmptyDatabase() {
		Movie[] expected = {};
		assertArrayEquals(expected, database.getMovies());
	}

	@Test
	public void testInsertMovieWithoutReviews() {
		assertNull(database.getMostPopularReview(movie1));
	}

	@Test
	public void testGetMostPopularReview() {
		movie1.addReview(reviewInception1);
		movie1.addReview(reviewInception2);
		movie1.addReview(reviewInception3);
		
		MovieDatabase database = new MovieDatabase();
		Review expected = reviewInception2;
		Review actual = database.getMostPopularReview(movie1);

		assertEquals(expected, actual);
	}

	@Test
	public void testGeneratePopularMovieReportNull() {
		MovieReport[] expected = {};
		assertArrayEquals(expected, database.generatePopularMovieReport());
	}

	@Test
	public void testListMoviesByGenre() {
	}

}
