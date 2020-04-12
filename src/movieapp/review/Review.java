package movieapp.review;

import java.util.UUID;

import movieapp.enums.Rating;

public class Review {
	String uuid;
	Reviewer reviewer;
	String text;
	int clicks;
	Rating rating;

	public Review(Reviewer reviewer, String text, int clicks, Rating rating) {
		super();
		this.uuid = UUID.randomUUID().toString();
		this.reviewer = reviewer;
		this.text = text;
		this.clicks = clicks;
		this.rating = rating;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public Reviewer getReviewer() {
		return reviewer;
	}

	public void setReviewer(Reviewer reviewer) {
		this.reviewer = reviewer;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public int getClicks() {
		return clicks;
	}

	public void setClicks(int clicks) {
		this.clicks = clicks;
	}

	public Rating getRating() {
		return rating;
	}

	public void setRating(Rating rating) {
		this.rating = rating;
	}
	
	

	@Override
	public String toString() {
		return "reviewer=" + reviewer.getFirstname() + ", text=" + text + ", clicks=" + clicks + ", rating="
				+ rating + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((uuid == null) ? 0 : uuid.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Review other = (Review) obj;
		if (uuid == null) {
			if (other.uuid != null)
				return false;
		} else if (!uuid.equals(other.uuid))
			return false;
		return true;
	}	
	
}
