/**
 * 
 */
package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * 
 */
public class BatchUpdate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/ORCL","system","Jitu1234");
			             Statement s=     con.createStatement();
			           //  s.addBatch("INSERT INTO STUDENT VALUES(40,'JK',22)");
			             s.addBatch("UPDATE STUDENT SET AGE=25 WHERE NAME='JK'");
			             s.executeBatch();
			             
		}
		catch(Exception e) {
			System.err.print(e);
		}
	}

}
