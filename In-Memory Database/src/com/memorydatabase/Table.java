package com.memorydatabase;

import java.util.Date;
import java.util.HashMap;

public class Table {
	private String TableName;
	private HashMap<String, Row> table;
	private Date createdAt;

	public Table(String tableName) {
		super();
		TableName = tableName;
		this.table = new HashMap<>();
		this.createdAt = new Date();
	}

	public String getTableName() {
		return TableName;
	}

	public void setTableName(String tableName) {
		TableName = tableName;
	}

	public HashMap<String, Row> gettable() {
		return table;
	}

	public void settable(HashMap<String, Row> table) {
		this.table = table;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	// To insert a row in table
	public void insertEntry(String rowId, HashMap<String, String> values) {
		if (table.containsKey(rowId)) {
			System.out.println("Duplicate Entry not Allowed");
		}
		Row row = new Row(rowId, values, new Date(), new Date());
		table.put(rowId, row);
		System.out.println("Successfully added a row");
	}

	// To read a row's values
	public HashMap<String, String> readEntry(String rowId) {
		if (!table.containsKey(rowId)) {
			System.out.println("Row ID doesn't exist");
			return null;
		}
		Row row = table.get(rowId);
		return row.getValues();
	}

	// To update the row values in table
	public void updateEntry(String rowId, HashMap<String, String> valuesMap) {
		Row row = table.get(rowId);
		valuesMap.forEach((k, v) -> {
			row.getValues().put(k, v);
		});
		System.out.println("Row successfully updated");
		row.setupdatedAt(new Date());
	}

	// To delete a row
	public void deleteEntry(String rowId) {
		if (!table.containsKey(rowId)) {
			System.out.println("Invalid row ID");
		}
		table.remove(rowId);
		System.out.println("Row deleted successfully");
	}

}
