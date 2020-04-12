package movieapp.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import movieapp.enums.Genre;
import movieapp.enums.Rating;
import movieapp.movie.Movie;
import movieapp.review.Review;
import movieapp.review.Reviewer;

public class MovieTest {
	Reviewer reviewer1;
	Review reviewInception1;
	Review review1;
	Review review2;
	Movie movie;
	Review[] expectedReviews;
	
	@Before
	public void setup() {
		reviewer1 = new Reviewer("Dennis", "Teise");
		reviewInception1 = new Review(reviewer1, "Top Movie", 100, Rating.VERY_GOOD);
		review1 = new Review(reviewer1, "Crazy movie", 1000, Rating.VERY_GOOD);
		review2 = new Review(reviewer1, "Crazy movie 222", 1111, Rating.VERY_GOOD);	
		movie = new Movie("Inception", Genre.THRILLER);
		expectedReviews = new Review[2];
	}
	
	@Test
	public void testAddReview() {
		expectedReviews[0] = review1;
		expectedReviews[1] = review2;
		movie.addReview(review1);
		movie.addReview(review2);
		
		// IS THE EXACT SAME ARRAY
		Review[] actualReviews = movie.getReviews();
		assertArrayEquals(expectedReviews, actualReviews);
	}
	
	@Test
	public void testAddDuplicateReview() {
		Review[] expectedReviews = new Review[2];
		expectedReviews[0] = review1;
		expectedReviews[1] = review2;
		movie.addReview(review1);
		movie.addReview(review2);
		
		// CAN NOT ADD REVIEW IF ALREADY EXISTS
		movie.addReview(review2);
		Review[] actualReviews = movie.getReviews();
		
		assertArrayEquals(expectedReviews, actualReviews);
	}

}
