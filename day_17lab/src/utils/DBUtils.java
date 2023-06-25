package utils;
import java.sql.*;
public class DBUtils {
private static Connection cn;
//add a static method to open database
public static Connection openConnection() throws SQLException
{
	
//DriverManager:Connection getConnection() throws excrptiom
	String url="jdbc:mysql://localhost:3306/advjava?createDatabaseIfNotExist=true&useSSL=false&allowPublicKeyRetrieval=true";
	cn=DriverManager.getConnection(url,"root","Orach@1731");
	return cn;
}




}
