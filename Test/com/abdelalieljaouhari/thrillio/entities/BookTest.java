package com.abdelalieljaouhari.thrillio.entities;

import static org.junit.Assert.*;

import org.junit.Test;

import com.abdelalieljaouhari.thrillio.constants.BookGenre;
import com.abdelalieljaouhari.thrillio.managers.BookmarkManager;

public class BookTest {

	@Test
	public void testIsKidFriendlyEligible() {
		
		Book book = BookmarkManager.getInstance().createBook(4000, "Walden", 1854, "Wilder Publications",
				new String[] { "Henry David Thoreau" }, BookGenre.PHILOSOPHY, 4.3);
		
		boolean isKidFriendlyEligible = book.isKidFriendlyEligable();
		
		assertFalse("Book Genre is Philosophy therefore it is not Kid Friendly Eligible.", isKidFriendlyEligible);
		
		book = BookmarkManager.getInstance().createBook(4000, "Walden", 1854, "Wilder Publications",
				new String[] { "Henry David Thoreau" }, BookGenre.SELF_HELP, 4.3);
		
		isKidFriendlyEligible = book.isKidFriendlyEligable();
		
		assertFalse("Book Genre is Self-Help therefore it is not kid friendly", isKidFriendlyEligible);

	}

}
