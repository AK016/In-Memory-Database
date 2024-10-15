package com.memorydatabase;

import java.util.Date;
import java.util.HashMap;

public class Database {
	private String DatabaseName;
	private HashMap<String, Table> database;
	private Date createdAt;

	public Database(String databaseName) {
		super();
		DatabaseName = databaseName;
		this.database = new HashMap<>();
		this.createdAt = new Date();
	}

	public String getDatabaseName() {
		return DatabaseName;
	}

	public void setDatabaseName(String databaseName) {
		DatabaseName = databaseName;
	}

	public HashMap<String, Table> getdatabase() {
		return database;
	}

	public void setdatabase(HashMap<String, Table> database) {
		this.database = database;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	// Create new database
	public Table createTable(String tableName) {
		if (database.containsKey(tableName)) {
			System.out.println("Table already exist with the same name");
		}
		Table table = new Table(tableName);
		database.put(tableName, table);
		System.out.println("Table Created Successfully");
		return database.get(tableName);
	}

	// To delete a table from database
	public void deleteTable(String tableName) {
		if (!database.containsKey(tableName)) {
			System.out.println("Table doesn't exist");
		}
		System.out.println("Table deleted successfully");
		database.remove(tableName);
	}

}
