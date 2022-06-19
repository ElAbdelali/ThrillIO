package com.abdelalieljaouhari.thrillio.controllers;

import com.abdelalieljaouhari.thrillio.entities.Bookmark;
import com.abdelalieljaouhari.thrillio.entities.User;
import com.abdelalieljaouhari.thrillio.managers.BookmarkManager;

public class BookmarkController {
	private static BookmarkController instance = new BookmarkController();
	
	private BookmarkController() {}
	public static BookmarkController getInstance() {
		return instance;
	}
	public void saveUserBookmark(User user, Bookmark bookmark) {
		BookmarkManager.getInstance().saveUserBookmark(user, bookmark);
	}

}
