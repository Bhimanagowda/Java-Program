package Mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Connection c=null ;
Statement stmt=null;
try
{
	Class.forName("oracle.jdbc.driver.OracleDriver");
	c = DriverManager.getConnection ( "jdbc:oracle:thin:@localhost:1521:xe","system","Amith071623?");
			System.out.println("opened database Succefully");
}
catch(Exception e)
{
	System.err.println(e.getClass().getName()+":"+e.getMessage());
	System.exit(0);
}
	}

}