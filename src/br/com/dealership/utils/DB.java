package br.com.dealership.utils;

import java.util.HashMap;
import java.util.Map;

import br.com.dealership.bean.User;

public class DB {
	
	private static Map<Integer, User> Database = new HashMap<Integer, User>();
	
	public static void newUser(Integer id, User user) {
		DB.Database.put(id, user);
	}
	
	public static User searchClient(Integer id) {
		User user = DB.Database.get(id);
		if (user == null) {
			return null;
		}
		return user;
	}
}
