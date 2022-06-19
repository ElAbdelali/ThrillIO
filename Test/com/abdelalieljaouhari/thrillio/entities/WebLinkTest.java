package com.abdelalieljaouhari.thrillio.entities;

import static org.junit.Assert.*;

import org.junit.Test;

import com.abdelalieljaouhari.thrillio.managers.BookmarkManager;

public class WebLinkTest {

	@Test
	public void testIsKidFriendlyEligable() {
		// Test 1: explicit in url results in false
		WebLink webLink = BookmarkManager.getInstance().createWebLink(2000, "Taming Tiger Part 2",
				"http://www.javaworld.com/article/2072759/core-java/taming-Explicit--part-2.html",
				"http://www.javaworld.com");
		
		boolean isKidFriendlyEligable = webLink.isKidFriendlyEligable();
		
		assertFalse("Explicit keyword found in the url, method returns false as it is not kid friendly.", isKidFriendlyEligable);
		
		// Test 2: explicit in title results in false
		webLink = BookmarkManager.getInstance().createWebLink(2000, "Taming Tiger Explicit Part 2",
				"http://www.javaworld.com/article/2072759/core-java/taming-tiger--part-2.html",
				"http://www.javaworld.com");
		
		isKidFriendlyEligable = webLink.isKidFriendlyEligable();
		
		assertFalse("Explicit keyword found in the title, method returns false as it is not kid friendly.", isKidFriendlyEligable);
		
		// Test 3: adult in host results in false
		webLink = BookmarkManager.getInstance().createWebLink(2000, "Taming Tiger Part 2",
				"http://www.javaworld.com/article/2072759/core-java/taming-tiger--part-2.html",
				"http://www.javaworldAdult.com");
		
		isKidFriendlyEligable = webLink.isKidFriendlyEligable();
		
		assertFalse("Adult keyword found in the host, method returns false as it is not kid friendly.", isKidFriendlyEligable);
		
		// Test 4: adult in url, but not in host results in true
		webLink = BookmarkManager.getInstance().createWebLink(2000, "Taming Tiger Part 2",
				"http://www.adultjavaworld.com/article/2072759/core-java/taming-tiger--part-2.html",
				"http://www.javaworld.com");
		
		isKidFriendlyEligable = webLink.isKidFriendlyEligable();
		
		assertTrue("Adult keyword found in the url but not in the host, method returns true as it is kid friendly.", isKidFriendlyEligable);
		
		
		// Test 5 adult in title only -- true
		webLink = BookmarkManager.getInstance().createWebLink(2000, "Adult Taming Tiger Part 2",
				"http://www.javaworld.com/article/2072759/core-java/taming-tiger--part-2.html",
				"http://www.javaworld.com");
		
		isKidFriendlyEligable = webLink.isKidFriendlyEligable();
		
		assertTrue("Adult keyword found only in the title, method returns true as it is kid friendly.", isKidFriendlyEligable);
	}

}
