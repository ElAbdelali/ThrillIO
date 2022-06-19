package com.abdelalieljaouhari.thrillio.entities;

import static org.junit.Assert.*;

import org.junit.Test;

import com.abdelalieljaouhari.thrillio.constants.MovieGenre;
import com.abdelalieljaouhari.thrillio.managers.BookmarkManager;

public class MovieTest {

	@Test
	public void testIsKidFriendlyEligible() {
		Movie movie = BookmarkManager.getInstance().createMovie(3000, "Citizen Kane",
				"https://www.imdb.com/title/tt0033467/?ref_=nv_sr_srsg_0", 1941,
				new String[] { "Orson Welles", "Joseph Cotten"}, new String[] { "Orson Welles" }, MovieGenre.HORROR,
				8.5);
		
		boolean isKidFriendlyEligible = movie.isKidFriendlyEligable();
		
		assertFalse("If the Movie Genre is horror, the movie is not Kid Friendly Eligable.", isKidFriendlyEligible);
		
		movie = BookmarkManager.getInstance().createMovie(3000, "Citizen Kane",
				"https://www.imdb.com/title/tt0033467/?ref_=nv_sr_srsg_0", 1941,
				new String[] { "Orson Welles", "Joseph Cotten"}, new String[] { "Orson Welles" }, MovieGenre.THRILLERS,
				8.5);
		
		isKidFriendlyEligible = movie.isKidFriendlyEligable();
		
		assertFalse("If the Movie Genre is Thriller, the movie is not Kid Friendly.", isKidFriendlyEligible);
	}

}
