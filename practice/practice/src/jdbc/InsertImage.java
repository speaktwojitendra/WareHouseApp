package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.io.FileInputStream;
public class InsertImage {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("driver class loaded");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/ORCL","system","Jitu1234");
			System.out.println("connected");
			PreparedStatement ps=con.prepareStatement("insert into IMAGE values(?,?)");
			ps.setString(1, args[0]);
			
			FileInputStream fis=new FileInputStream(args[1]);
			ps.setBinaryStream(2, fis, fis.available());
			ps.executeUpdate();
			System.out.println("one image inserted successfully");
			
			
		}
		// TODO Auto-generated method stub
catch(Exception e) {
	System.out.println(e);
}
	}

}
