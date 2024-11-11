
package com;

import java.sql.*;
import java.util.Scanner;
public class Jdbc {
 
	public static void main(String[] args) throws Exception  {
		
	package Mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcExample {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		  
        // Step 1: Register the driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        // Step 2: Establish the connection
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rooman", "root", "12345");
        System.out.println("Connection created");
        
        

	}

}

 
}