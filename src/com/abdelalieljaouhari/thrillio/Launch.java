package com.abdelalieljaouhari.thrillio;

import com.abdelalieljaouhari.thrillio.entities.Bookmark;
import com.abdelalieljaouhari.thrillio.entities.User;
import com.abdelalieljaouhari.thrillio.managers.BookmarkManager;
import com.abdelalieljaouhari.thrillio.managers.UserManager;

public class Launch {

	private static User[] users;
	private static Bookmark[][] bookmarks;

	private static void loadData() {
		System.out.println("1. Loading Data ...");
		DataStore.loadData();

		users = UserManager.getInstance().getUsers();
		bookmarks = BookmarkManager.getInstance().getBookmarks();


	}

	private static void printUserData() {
		for (User user : users) {
			System.out.println(user);
		}
	}

	private static void printBookmarkData() {
		for (Bookmark[] bookmarkList : bookmarks) {
			for (Bookmark bookmark : bookmarkList) {
				System.out.println(bookmark);
			}
		}
	}
	
	private static void start() {
		for (User user : users) {
			View.browse(user, bookmarks);
		}
	}


	public static void main(String[] args) {

		loadData();
		start();
	}

	
}
