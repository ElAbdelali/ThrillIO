package com.abdelalieljaouhari.thrillio.dao;

import com.abdelalieljaouhari.thrillio.DataStore;
import com.abdelalieljaouhari.thrillio.entities.Bookmark;

public class BookmarkDao {
	
	public Bookmark[][] getBookmarks() {
		return DataStore.getBookmarks();
	}

}
