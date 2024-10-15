# In-Memory Database System

This project implements a basic in-memory database system in Java. The system allows users to create databases, tables, and perform CRUD operations (Create, Read, Update, Delete) on rows within tables.

## Project Structure

- **App.java**: The entry point of the application. It demonstrates how to use the in-memory database system.
- **DatabaseManager.java**: Manages the creation and deletion of databases.
- **Database.java**: Represents a single database that can hold multiple tables.
- **Table.java**: Represents a table in a database. Tables consist of rows, and each row is represented as a key-value pair.
- **Row.java**: Represents a single row in a table. Each row contains a unique row ID and a set of key-value pairs (column name and value).

## Features

- Create and delete databases.
- Create and delete tables within a database.
- Insert, update, read, and delete rows in a table.
- Maintain metadata like creation time and update time for rows and tables.

## Getting Started

### Prerequisites

- JDK (Java Development Kit) 8 or higher installed on your system.

### Running the Project

1. **Compile the Project**:
   Open a terminal or command prompt, navigate to the project directory, and compile the `.java` files using the following command:
   ```bash
   javac -d bin -sourcepath src src/com/memorydatabase/*.java
Run the Application: Once compiled, you can run the App class to see the in-memory database system in action:
bash
Copy code
java -cp bin com.memorydatabase.App
Example Output
plaintext
Copy code
Database Created Successfully
Table Created Successfully
Successfully added a row
Successfully added a row
Retrieved User 1: {Name=Eren Yeager, Age=25}

Row successfully updated
Updated User 1: {Name=Eren Yeager, Age=26}

Row deleted successfully
Table doesn't exist
Table deleted successfully
Database doesn't exist
Database Deleted
