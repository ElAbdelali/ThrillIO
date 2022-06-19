package com.abdelalieljaouhari.thrillio.managers;

import com.abdelalieljaouhari.thrillio.dao.BookmarkDao;
import com.abdelalieljaouhari.thrillio.entities.Book;
import com.abdelalieljaouhari.thrillio.entities.Bookmark;
import com.abdelalieljaouhari.thrillio.entities.Movie;
import com.abdelalieljaouhari.thrillio.entities.User;
import com.abdelalieljaouhari.thrillio.entities.UserBookmark;
import com.abdelalieljaouhari.thrillio.entities.WebLink;

public class BookmarkManager {

	private static BookmarkManager instance = new BookmarkManager();
	private static BookmarkDao dao = new BookmarkDao();
	
	private BookmarkManager() {
	}

	public static BookmarkManager getInstance() {
		return instance;
	}

	public WebLink createWebLink(long id, String title, String url, String host) {

		WebLink weblink = new WebLink();
		
		weblink.setId(id);
		weblink.setTitle(title);
		weblink.setUrl(url);
		weblink.setHost(host);
		

		return weblink;
	}

	public Movie createMovie(long id, String title, String profileUrl, int releaseYear, String[] cast,
			String[] directors, String genre, double imdbRating) {

		Movie movie = new Movie();

		movie.setId(id);
		movie.setTitle(title);
		movie.setProfileUrl(profileUrl);
		movie.setReleaseYear(releaseYear);
		movie.setCast(cast);
		movie.setDirectors(directors);
		movie.setGenre(genre);
		movie.setImdbRating(imdbRating);

		return movie;

	}

	public Book createBook(long id, String title, int publicationYear, String publisher, String[] Author, String genre, double amazonRating) {

		Book book = new Book();

		book.setId(id);
		book.setTitle(title);
		book.setPublicationYear(publicationYear);
		book.setPublisher(publisher);
		book.setAuthor(Author);
		book.setGenre(genre);
		book.setAmazonRating(amazonRating);

		return book;
	}

	public Bookmark[][] getBookmarks() {
		return dao.getBookmarks();
	}

	public void saveUserBookmark(User user, Bookmark bookmark) {
		UserBookmark userBookmark = new UserBookmark();
		userBookmark.setUser(user);
		userBookmark.setBookmark(bookmark);
		
		dao.saveUserBookmark(userBookmark);
	}

}
