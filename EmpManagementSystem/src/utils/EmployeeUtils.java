package utils;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;

import com.core.app.Emp;
public interface EmployeeUtils {
//add a static method to store emp details
	 static void storeEmployeeDetails(Map<String,Emp> emps,String fileName) throws IOException
	 {
		 //I/o sttream:Seriallization--->write
		 //JavaApp--->OOS--->FOS---->BIN file
		 try(ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream(fileName)))//checked exc:IOExcep
		{
			 out.writeObject(emps);
		}
	 }
	 ////add a static method to restore emp details
	 static Map<String,Emp>  restoreEmployeeDetails(String fileName)
	 {
		 //deserillizer:reading:javaApp<---bin file
		 try(ObjectInputStream in=new ObjectInputStream(new FileInputStream(fileName)))
		 {
			return (Map<String,Emp> )in.readObject();
		 }
		 catch(Exception E)
		 {
			 System.out.println("Deserializer "+E);
			 return new HashMap<>();
		 }
		
	 }
	
}
//Dont use Appendable files and seriallization together