package Utilities;          //A class that holds the initialization and termination methods of the DB connection.

import java.sql.DriverManager;

import static java.lang.Class.forName;

public class ManageDB extends CommonOps{

    public static void initConnection(String dbURL, String user, String password) {
        try {
            forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(dbURL, user, password);
        } catch (Exception e) {
            System.out.println("Could not initiate database connection");
        }
    }

    public static void closeConnection() {
        try {
            connection.close();
        } catch (Exception e) {
            System.out.println("Could not close database connection");
        }
    }
}
