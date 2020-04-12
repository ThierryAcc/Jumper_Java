package movieapp.movie;

import java.util.Arrays;

import movieapp.enums.Genre;
import movieapp.review.Review;

public class Movie {
	String title;
	Genre genre;
	Review[] reviews = new Review[0];

	public Movie(String title, Genre genre) {
		this.title = title;
		this.genre = genre;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	/**
	 * Adds a review to the review Array
	 * @param review - the Review to add to the array.
	 */
	public void addReview(Review review) {
		boolean exists = true;

		for (int i = 0; i < reviews.length; i++) {
			if (review.getUuid().equals(reviews[i].getUuid())) {
				System.out.println("UUID already exists");
				exists = !exists;
				break;
			}
		}

		if (exists) {
			this.reviews = Arrays.copyOf(this.reviews, this.reviews.length + 1);
			this.reviews[this.reviews.length - 1] = review;
		}
	}

	public Review[] getReviews() {
		return reviews;
	}

	@Override
	public String toString() {
		return "Movie [title=" + title + ", genre=" + genre + ", reviews=" + Arrays.toString(reviews) + "]";
	}

	// test fall mehrmals gleiches Review bei addReview einfügen
}
