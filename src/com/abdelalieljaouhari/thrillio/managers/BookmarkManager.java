package com.abdelalieljaouhari.thrillio.managers;

import com.abdelalieljaouhari.thrillio.entities.Bookmark;

public class BookmarkManager {

	private static BookmarkManager instance = new BookmarkManager();

	private BookmarkManager() {
	}

	public static BookmarkManager getInstance() {
		return instance;
	}

	public Bookmark createBookmark(long id, String title, String profileUrl) {
		Bookmark bookmark = new Bookmark();
		bookmark.setId(id);
		bookmark.setTitle(title);
		bookmark.setProfileUrl(profileUrl);

		return bookmark;
	}

}
