package com.abdelalieljaouhari.thrillio.entities;

import java.util.Arrays;

public class Book extends Bookmark {

	private int publicationYear;
	private String publisher;
	private String[] Author;
	private String genre;
	private double amazonRating;

	public int getPublicationYear() {
		return publicationYear;
	}

	public void setPublicationYear(int publicationYear) {
		this.publicationYear = publicationYear;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String[] getAuthor() {
		return Author;
	}

	public void setAuthor(String[] author) {
		Author = author;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public double getAmazonRating() {
		return amazonRating;
	}

	public void setAmazonRating(double amazonRating) {
		this.amazonRating = amazonRating;
	}

	@Override
	public String toString() {
		return "Book [publicationYear=" + publicationYear + ", publisher=" + publisher + ", Author="
				+ Arrays.toString(Author) + ", genre=" + genre + ", amazonRating=" + amazonRating + "]";
	}

}
