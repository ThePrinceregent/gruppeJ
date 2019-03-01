import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Window;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javafx.*;



public class Alpha extends JFrame {

	/*
	Create
	Read
	Update
	Delete
	*/
	
	
	//Deklarierung der variabelen
	private int width = 50;
	private int hight = 50;
	public boolean trun = false;
	static Connection connection = null;
	
	
	//Deklarierung von Feldern
	private JButton B1 = new JButton("Buttn");
	
	
	
	//Deklarierung von platzhaltern
	private JLabel Text1 = new JLabel("Einkaufswagen");
	private JLabel Text2 = new JLabel("Angebote (3 Buttons)");
	private JLabel Text3 = new JLabel("Gridlayout mit userdaten usw");
	private JLabel Text4 = new JLabel("Einkaufswagen, dann zahlungsbereich");
	private JLabel Text5 = new JLabel("Einstellungen, Userdaten ändern im South");
	private JLabel Text6 = new JLabel("Platzhalter1");
	private JLabel Text7 = new JLabel("Platzhalter2");
	private JLabel Text8 = new JLabel("Platzhalter3");
	private JLabel Text9 = new JLabel("Platzhalter4");
	private JLabel Text0 = new JLabel("Platzhalter5");
	
	
	
	//aufbau des fensters
	JPanel Nordleiste = new JPanel(new GridLayout(1,4)); //x y 
	JPanel Mittelleiste = new JPanel(new GridLayout(2,3));//~
	JPanel Suedleiste = new JPanel(new GridLayout(1,10));
	JPanel Ostleiste = new JPanel(new GridLayout(1,1)); //~
	

	
	//Deklarierung der Nordleistenfelder
	private JLabel N1 = new JLabel("username platzhalter"); //Username aus Datenbank
	private JLabel N2 = new JLabel("0 Sekunden"); // weitere felder?
	
	// deklarierung der suedleistenfelder
	
	
	//deklarierung der Mittelleistenfelder
	
	
	
	public Alpha() {
		
		Thread superThread = timer();
		superThread.start();
		
		System.out.println("DINGDING Hauptfenster");
		//Aufbau vom Fenster
		JPanel Area = new JPanel();
		
		//JPanel westArea = new JPanel( new GridLayout(5,2));
		
		// this.getContentPane().add(Text1, BorderLayout.EAST);
		this.getContentPane().add(Ostleiste, BorderLayout.EAST);
		this.getContentPane().add(Nordleiste, BorderLayout.NORTH);
		this.getContentPane().add(Suedleiste, BorderLayout.SOUTH);
		this.getContentPane().add(Mittelleiste, BorderLayout.CENTER);
		
		//Alpha.getContentPane().add(this.scoreboard, BorderLayout.NORTH );
			
	// Felder der Nordleiste
		Nordleiste.add(N1);
		Nordleiste.add(N2);
		Nordleiste.add(Text8);
		
		// Felder Sued
		
		
		// felder mittelleiste
		Mittelleiste.add(Spezi1);
		
		
		// felder Ostleiste
		
		
		
		// grundeigenschaften vom fester
		setVisible(true);
		setSize(1000, 1000);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.getContentPane().add(Area);
		//setGlassPane(start);
		// Hier aufruf des logins
		
	}
	// hier die Methoden falls die nicht woanders besser aufgehoben sind
	
	
	//Timerthread um sitzungsdauer anzuzeigen
	//trun sagt ob er läuft
	//timez ist die anzahl an sekunden
	

	
	
	public void klick() throws SQLException {
		
		DatabaseMetaData dbmd = connection.getMetaData();
        System.out.println("Metadaten der Datenbank:");
        System.out.println("DB          :" + dbmd.getDatabaseProductName());
		
	}
	// Dieser Thread verfolgt die Sitzungsdauer. Er gibt lediglich 
	// an wie lange die stzund schon geht bis zu maximal minuten
	public Thread timer()
	{
			Thread superThread = new Thread(new Runnable() 
			{
				int time = 0;
				int timem; //Variabele für minuten
				int times; //Variabele für sekunden
	
				@Override
				public void run() 
				{
					// loadmethode ergänzen?
					while (true)
					{
					trun = true;
					
					timem = time / 60;
					times = time % 60;
					
					if (timem == 0) {
						N2.setText("Sitzungsdauer: " + times + " Sekunden");
						
					} else {
						N2.setText("Sitzungsdauer: " + timem + " Minuten" + times + " Sekunden");
					}
		
					time++;
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

					}
				}
			});
			return superThread;
			
	}
	
	public static void main(String[] args) {
		
		// Datenbankaufruf - die klasse soll tabels droppen wie scheiße
		
		
		//Frage wegen try catch und ob dies die datenbank permanent offenhalten kann
		try {
		
		connection = Util.getConnection("nothingNeeded");
		
	      } catch (SQLException | ClassNotFoundException | IOException e) {
	          System.out.println(e.getMessage());
	          e.printStackTrace();
	       } finally {
	          
	          Util.close(connection);
	       }
		
		
		new Login();
//					login.start();
		
		//aufruf zur Musikklasse - FUNKTIONIERT aber nervt, tamam instrumental entfernt
		
		
			
	}
}
