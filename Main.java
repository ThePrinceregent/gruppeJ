//import java.io.IOException;
//import java.sql.Connection;
//import java.sql.SQLException;
//
//public class Main {
//
//	static Connection connection = null;
//	
//	
//public static void main(String[] args) {
//		
//		// Datenbankaufruf - die klasse soll tabels droppen wie scheiﬂe
//		
//		
//		//Frage wegen try catch und ob dies die datenbank permanent offenhalten kann
//		try {
//		
//		connection = Util.getConnection("nothingNeeded");
//		
//	      } catch (SQLException | ClassNotFoundException | IOException e) {
//	          System.out.println(e.getMessage());
//	          e.printStackTrace();
//	       } finally {
//	          
//	          Util.close(connection);
//	       }
//		Alpha start = new Alpha();
//		
//		//aufruf zur Musikklasse - FUNKTIONIERT aber nervt, tamam instrumental entfernt
//		
//		//Musik musik = new Musik();
//		//musik.playSound();
//			
//	}
//
//
//	
//}
