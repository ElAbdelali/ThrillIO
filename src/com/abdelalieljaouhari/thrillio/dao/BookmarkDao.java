package com.abdelalieljaouhari.thrillio.dao;

import com.abdelalieljaouhari.thrillio.DataStore;
import com.abdelalieljaouhari.thrillio.entities.Bookmark;
import com.abdelalieljaouhari.thrillio.entities.UserBookmark;

public class BookmarkDao {
	
	public Bookmark[][] getBookmarks() {
		return DataStore.getBookmarks();
	}

	public void saveUserBookmark(UserBookmark userBookmark) {
		DataStore.add(userBookmark);
	}

}
