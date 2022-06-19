package com.abdelalieljaouhari.thrillio;

import com.abdelalieljaouhari.thrillio.constants.KidFriendlyStatus;
import com.abdelalieljaouhari.thrillio.constants.UserType;
import com.abdelalieljaouhari.thrillio.controllers.BookmarkController;
import com.abdelalieljaouhari.thrillio.entities.Bookmark;
import com.abdelalieljaouhari.thrillio.entities.User;

public class View {

	public static void browse(User user, Bookmark[][] bookmarks) {
		System.out.println("\n" + user.getEmail() + " is browsing items ...");
		int bookmarkCount = 0;

		for (Bookmark[] bookmarkList : bookmarks) {
			for (Bookmark bookmark : bookmarkList) {
				if (bookmarkCount < DataStore.USER_BOOKMARK_LIMIT) {
					boolean isBookmarked = getBookmarkDecision(bookmark);
					if (isBookmarked) {
						bookmarkCount++;

						BookmarkController.getInstance().saveUserBookmark(user, bookmark);

						System.out.println("New Item Bookmarked --" + bookmark);
					}
				}
				// mark as kid-friendly
				if (user.getUserType().equals(UserType.EDITOR) || user.getUserType().equals(UserType.CHIEF_EDITOR)) {
					if (bookmark.isKidFriendlyEligable()
							&& bookmark.getKidFriendlyStatus().equals(KidFriendlyStatus.UNKNOWN)) {
						String kidFriendlyStatus = getKidFriendlyStatusDecision(bookmark);
						if(!kidFriendlyStatus.equals(KidFriendlyStatus.UNKNOWN)) {
							bookmark.setKidFriendlyStatus(kidFriendlyStatus);
							System.out.println("Kid-friendly status: " + kidFriendlyStatus + ", " + bookmark);
						}
					}
				}
			}
		}

	}

	private static String getKidFriendlyStatusDecision(Bookmark bookmark) {
		double randomVal = Math.random();
		return randomVal < 0.4 ? KidFriendlyStatus.APPROVED
				: (randomVal >= 0.4 && randomVal < 0.8) ? KidFriendlyStatus.REJECTED
						: KidFriendlyStatus.UNKNOWN;
	}

	private static boolean getBookmarkDecision(Bookmark bookmark) {
		return Math.random() < 0.5 ? true : false;
	}
}