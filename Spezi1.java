import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

//Objektklasse für den Button für einzelflaschen. Dasselbe für Katen und palette
public class Spezi1 extends JLabel{

	private String name;
	
	
	private String path;
	
	
	public Spezi1(String datapath) {
		this.name=datapath;
	path = "Pic/SpeziE.jpg";
	ImageIcon image = new ImageIcon(this.path);	
    setIcon(image);
    
    addMouseListener(new MouseAdapter() {
        public void mousePressed(MouseEvent e) {
        	
        	
        	
        	
        //wird geklickt, reaktion hier	
        }
    
	});
	
}
}
