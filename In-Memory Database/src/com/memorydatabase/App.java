package com.memorydatabase;

import java.util.HashMap;

public class App {
	public static void main(String[] args) {
		// Create an instance of DatabaseManager
		DatabaseManager dbManager = new DatabaseManager();

		// Create a new database
		Database db = dbManager.createDatabase("AttackOnTitan");

		// Create a new table in the database
		Table table = db.createTable("SubjectsOfYmir");

		// Insert rows into the table
		HashMap<String, String> user1 = new HashMap<>();
		user1.put("Name", "Eren Yeager");
		user1.put("Age", "25");
		table.insertEntry("1", user1);

		HashMap<String, String> user2 = new HashMap<>();
		user2.put("Name", "Yeagerist");
		user2.put("Age", "21");
		table.insertEntry("2", user2);

		// Read an entry from the table
		HashMap<String, String> retrievedUser = table.readEntry("1");
		if (retrievedUser != null) {
			System.out.println("Retrieved User 1: " + retrievedUser);
		}
		System.out.println();

		// Update an entry
		HashMap<String, String> updatedUser = new HashMap<>();
		updatedUser.put("Age", "26");
		table.updateEntry("1", updatedUser);

		// Read the updated entry
		HashMap<String, String> updatedRetrievedUser = table.readEntry("1");
		if (updatedRetrievedUser != null) {
			System.out.println("Updated User 1: " + updatedRetrievedUser);
		}
		System.out.println();

		// Delete a row
		table.deleteEntry("2");

		// Drop the table
		db.deleteTable("SubjectsOfYmir");

		// Delete the database
		dbManager.deleteDatabase("AttackOnTitan");
	}
}
