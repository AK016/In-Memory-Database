package com.memorydatabase;

import java.util.Date;
import java.util.HashMap;

public class Row {
	private String rowId;
	private HashMap<String, String> values;
	private Date createdAt;
	private Date updatedAt;

	public Row(String rowId, HashMap<String, String> values, Date createdAt, Date updatedAt) {
	    this.rowId = rowId;
	    this.values = values;  
	    this.createdAt = createdAt;
	    this.updatedAt = updatedAt;
	}


	public String getRowId() {
		return rowId;
	}

	public void setRowId(String rowId) {
		this.rowId = rowId;
	}

	public HashMap<String, String> getValues() {
		return values;
	}

	public void setValues(HashMap<String, String> values) {
		this.values = values;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getupdatedAt() {
		return updatedAt;
	}

	public void setupdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

}
