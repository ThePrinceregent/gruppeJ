

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.sql.DatabaseMetaData;

public class Util {
	
	//singleton
	// es kann nur eine Instanz/ Objekt der Klasse erzeugt werden (Design Pattern singleton)
	
	private static Util instance = null;
	
	public static Util getInstance()
	{
		if (instance == null)
		{
			
			instance = new Util();
		}
		
		return instance;
	}

	
	
		
		
		
		
	
	
	private static Connection connection = null;
	
	public static Connection getConnection(final String db)throws SQLException, ClassNotFoundException, IOException
	{
		

	
		

		//Class.forName("com.mysql.jdbc.Driver");
	 System.out.println("MySQL JDBC-Treiber geladen!");
	 
//		String url = prop.getProperty("Beispiel?useLegacyDatetimeCode=false&serverTimezone=America/New_York");
//		String user = prop.getProperty("root");
//		String pw = prop.getProperty("1234");
//		
		connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/Beispiel?useLegacyDatetimeCode=false&serverTimezone=America/New_York", "root", "1234");
		   
		return connection;
	}
	
	
	public static void close(final AutoCloseable obj)
	{
		 if (obj != null)
				try {
					// AutoClosable
					obj.close();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	}	


}
