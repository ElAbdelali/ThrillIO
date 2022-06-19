package com.abdelalieljaouhari.thrillio.dao;

import com.abdelalieljaouhari.thrillio.DataStore;
import com.abdelalieljaouhari.thrillio.entities.User;

public class UserDao {
	
	public User[] getUsers() {
		return DataStore.getUsers();
	}

}
