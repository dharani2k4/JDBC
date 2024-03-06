package dineshnew;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;
import java.util.Scanner;
public class dinesh1 {
	static String dbUrl="jdbc:mysql://localhost:3306/mknew";
	static String dbUname="root";
	static String dbPassword="";
	static String dbDriver="com.mysql.cj.jdbc.Driver";
	static String name,pass;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String name=sc.next();
		String pass=sc.next();
		Connection con=null;
		try {
			Class.forName(dbDriver);  //class not found exception
			con = DriverManager.getConnection(dbUrl,dbUname,dbPassword);   //sql Exception
			String sql = "insert into mkelite (username,password)"
					+ "values('"+name+"','"+pass+"')";
			Statement s = con.createStatement();
			s.execute(sql);
		   	con.close();
		} catch(Exception e){      
			e.printStackTrace();
		}
	}
}
