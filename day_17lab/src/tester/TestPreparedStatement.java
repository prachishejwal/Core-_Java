package tester;

//display user 
import java.sql.*;
import java.util.Scanner;

import static utils.DBUtils.openConnection;

public class TestPreparedStatement {

	public static void main(String[] args) {
		try (// sc
				Scanner sc = new Scanner(System.in);
				//open cn
				Connection cn = openConnection();
				// create pst : pre parsed n pre compiled stmt : holds the query
				PreparedStatement pst = cn.prepareStatement("select * from users where role=? and reg_amt>?");)
						 {
							 System.out.println("Enter the role and reg amount");
							 //set in param.PST API:public void setType(int paramIndex,Type val)throws SE
							 pst.setString(1,sc.next());
							 pst.setDouble(2, sc.nextDouble());
							 //execution methods:execQuery/exeUpdate/execute
							 //API  of pst:public RST executeQuery() throws SE
							 try(ResultSet rst=pst.executeQuery())
							 {
								//rst cursor:before the 1st row
								 //RST API:public boolean next() throwsSE
								 while(rst.next())
									 //read row data:RST API public Type getType(int colPos/String colNmae)
									 {
									 System.out.println("id : "+rst.getInt(1)+" full name : "+rst.getString(2)+" "+rst.getString(3)+"reg date: "+rst.getDate(7));
							 
									 }
								 }
							 
							 
			}//rst.close

		//pst.close , cn.close , sc.close
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
