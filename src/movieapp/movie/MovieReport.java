package movieapp.movie;

import movieapp.enums.Genre;
import movieapp.enums.Rating;

public class MovieReport {
	String title;
	String reviewerFullName;
	String reviewText;
	Genre genre;
	Rating reviewRating;
	
	public MovieReport(String title, Genre genre, String reviewerFullName, String reviewText, Rating reviewRating) {
		super();
		this.title = title;
		this.genre = genre;
		this.reviewerFullName = reviewerFullName;
		this.reviewText = reviewText;
		this.reviewRating = reviewRating;
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

	public String getReviewerFullName() {
		return reviewerFullName;
	}

	public void setReviewerFullName(String reviewerFullName) {
		this.reviewerFullName = reviewerFullName;
	}

	public String getReviewText() {
		return reviewText;
	}

	public void setReviewText(String reviewText) {
		this.reviewText = reviewText;
	}

	public Rating getReviewRating() {
		return reviewRating;
	}

	public void setReviewRating(Rating reviewRating) {
		this.reviewRating = reviewRating;
	}

	@Override
	public String toString() {
		return "MovieReport [title=" + title + ", reviewerFullName=" + reviewerFullName + ", reviewText=" + reviewText
				+ ", genre=" + genre + ", reviewRating=" + reviewRating + "]";
	}
	
	

}
