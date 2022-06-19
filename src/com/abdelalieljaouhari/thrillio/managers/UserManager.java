package com.abdelalieljaouhari.thrillio.managers;

import com.abdelalieljaouhari.thrillio.dao.UserDao;
import com.abdelalieljaouhari.thrillio.entities.User;

public class UserManager {

	private static UserManager instance = new UserManager();
	private static UserDao dao = new UserDao();

	private UserManager() {
	}

	public static UserManager getInstance() {
		return instance;
	}

	public User createUser(long id, String email, String password, String fName, String lName, int gender,
			String userType) {

		User user = new User();
		user.setId(id);
		user.setEmail(email);
		user.setPassword(password);
		user.setfName(fName);
		user.setlName(lName);
		user.setGender(gender);
		user.setUserType(userType);

		return user;

	}

	public User[] getUsers() {
		return dao.getUsers();
	}
	
	

}
