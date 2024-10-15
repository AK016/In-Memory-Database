package com.memorydatabase;

import java.util.HashMap;

public class DatabaseManager {
	private HashMap<String, Database> Data;

	public DatabaseManager() {
		super();
		this.Data = new HashMap<>();
	}

	public HashMap<String, Database> getData() {
		return Data;
	}

	public void setData(HashMap<String, Database> data) {
		Data = data;
	}

	public Database createDatabase(String DatabaseName) {
		if (Data.containsKey(DatabaseName)) {
			System.out.println("Database already exist with the same name");
		}
		Database database = new Database(DatabaseName);
		Data.put(DatabaseName, database);
		System.out.println("Database Created Successfully");
		return Data.get(DatabaseName);
	}

	public void deleteDatabase(String DatabaseName) {
		if (!Data.containsKey(DatabaseName)) {
			System.out.println("Database doesn't exist");
		}
		System.out.println("Database Deleted");
		Data.remove(DatabaseName);
	}

}
