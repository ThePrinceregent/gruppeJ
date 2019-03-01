
import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

public class Musik
{
	public Clip clip;
 // public AudioClip music = getAudioClip(getCodeBase(),"Pic/8Bit.mp3");
    boolean clipsdontstopplayingsotheyrepeat = false;
  public void playSound() {
      try {
      
          AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("Pic/TPS.wav"));
          
          
          clip = AudioSystem.getClip();
          clip.open(audioInputStream);
          //while (clipsdontstopplayingsotheyrepeat = false) {
          
          clip.start();
          
        //  }
      } catch (Exception e) {

          JOptionPane.showMessageDialog(null, e);
      }
  }}
  
  
