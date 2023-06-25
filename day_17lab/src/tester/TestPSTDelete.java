package tester;

import static utils.DBUtils.openConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class TestPSTDelete {

	public static void main(String[] args) {
		try (// sc
				Scanner sc = new Scanner(System.in);
				//open cn
				Connection cn = openConnection();
				// create pst : pre parsed n pre compiled stmt : holds the query
				PreparedStatement pst = cn.prepareStatement("delete from users where id=?");)
						 {
							 System.out.println("Enter user id to delete details");
							 pst.setInt(1, sc.nextInt());
							 int updateCount=pst.executeUpdate();
							 if(updateCount==1)
								 System.out.println("User details deleted !");
						 
							 else
								 
								 System.out.println("Invalid user id !!");
						 }
							 catch(Exception e)
		{
							 e.printStackTrace();

	}

	}
}
