import java.sql.*;//importing SQL 
import java.util.Scanner;
public class ConnectDB {
//database connection variables
	static Connection connection = null;
	
	static String databaseName ="myprojectdb";
	
	static String url = "jdbc:mysql://localhost:3306/"+databaseName; //URL with database name
	
	static String username = "root";//UserName of my database
	static String password ="vinushashi@123";//password of my database please don't tell to anyone :p
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
	/*	Scanner sc = new Scanner(System.in);
		int docterId = sc.nextInt();
		sc.nextLine();
		String docterName = sc.nextLine();*/
		Class.forName("com.mysql.jdbc.Driver").newInstance();//this will say to connect MySQL
		
		connection = DriverManager.getConnection(url,username,password);   //creating connection with database
		// TODO Auto-generated method stub
		if(connection!=null)
		{
			System.out.println(" connected");
		}
		else {
			System.out.println("not connected");
		}
		connection.close();

	}
	
}

	
