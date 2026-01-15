package jdbc;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class ConnDemo {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); 
			System.out.println("driver class loaded");	
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/ORCL","system","Jitu1234");
			System.out.println("successfully connected");
Statement  s=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
 ResultSet rs=s.executeQuery("select STUDENT_ID,NAME,AGE from STUDENT");
 
 rs.absolute(1);
 
rs.moveToInsertRow();
rs.updateInt(1, 100);
rs.updateString(2,"jitendranmm");
rs.updateInt(3, 150);
rs.insertRow();
System.out.println("inserted ");
 //System.out.println(rs.getString(2));
//s.executeUpdate("UPDATE STUDENT SET AGE=24 WHERE NAME='JINU'");
			
			
			//System.out.println();System.out.println();
	
			
		}
		
		
		
		
		
		
		catch(Exception e)
		{
			System.err.println(e);
		}
		
	}

}
