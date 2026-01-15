package practice;
import java.sql.*;
import java.util.*;
public class PreparedStatementDemo {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","jitu@123");
		PreparedStatement ps=con.prepareStatement("Select name from student Where id=?");
		Scanner sc=new Scanner(System.in);
		int id=sc.nextInt();
		ps.setInt(1, id);
		
		ResultSet rs=ps.executeQuery();
		rs.next();
		System.out.println(rs.getString(1));
		
		
		
			
		}
		catch(Exception e) {
			System.err.print(e);
		}
		// TODO Auto-generated method stub

	}

}
