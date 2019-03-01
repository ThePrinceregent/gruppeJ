/*
import javax.swing.JFrame;

public class Loginfenster extends JFrame {

	
	
	
	
}
*/
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
 
public class Login extends JFrame implements ActionListener{
	
	
	//deklaration der Felder
 JLabel l1, l2, l3;
 JTextField t1;
 JButton btnl1;
 JPasswordField p1;
 Login() {
	 JFrame frame = new JFrame("Login");
	 l1 = new JLabel("Login");
	 l1.setForeground(Color.blue);
	 l1.setFont(new Font("Serif", Font.BOLD, 20));
 
	 l2 = new JLabel("Username");
	 l3 = new JLabel("Password");
	 t1 = new JTextField();
	 p1 = new JPasswordField();
	 btnl1 = new JButton("Login");
 
  //größen angepasst, vielleicht zurücksetzen?
  
  
  l1.setBounds(100, 30, 400, 30);
  l2.setBounds(80, 70, 200, 30);
  l3.setBounds(80, 110, 200, 30);
  t1.setBounds(300, 70, 200, 30);
  p1.setBounds(300, 110, 200, 30);
  btnl1.setBounds(150, 160, 100, 30);
 
  //zuordnung der felder
  
  frame.add(l1);
  frame.add(l2);
  frame.add(t1);
  frame.add(l3);
  frame.add(p1);
  frame.add(btnl1);
 
  //btn1.addActionListener(	  );
  
  //fenster grundeigenschaften
  frame.setSize(400, 400);
  frame.setLayout(null);
  frame.setVisible(true);
 }
 

 btnl1.addActionListener(new ActionListener() {
//	 
// 
// });
//
 
 
 public void actionPerformed(ActionEvent ae)
 {
   String user = t1.getText();
   String pw = p1.getText();
   if(user.equals("1") && pw.equals("1"))
   {
	   //Aufruf des hauptfensters
	   
//	   new Alpha();
//	   Musik musik = new Musik();
	//   musik.playSound();
	   
//      Alpha.setVisible(true);
//      JLabel label = new JLabel("Welcome:"+uname);
//      wel.getContentPane().add(label);
    }
    else
    {
      JOptionPane.showMessageDialog(this,"nope",
      "Error",JOptionPane.ERROR_MESSAGE);  
    }
  }
 
// 
// public static void main(String[] args) {
//  new Login();
//  
  //start der musik?
  
 }

// frag die gummiente

























//
//import javafx.application.Application;
//import javafx.event.ActionEvent;
//import javafx.event.EventHandler;
//import javafx.geometry.Insets;
//import javafx.geometry.Pos;
//import javafx.scene.Scene;
//import javafx.scene.control.Button;
//import javafx.scene.control.Label;
//import javafx.scene.control.PasswordField;
//import javafx.scene.control.TextField;
//import javafx.scene.layout.GridPane;
//import javafx.scene.layout.HBox;
//import javafx.scene.paint.Color;
//import javafx.scene.text.Font;
//import javafx.scene.text.FontWeight;
//import javafx.scene.text.Text;
//import javafx.stage.Stage;
//
//public class Login extends Application {
//
////    public static void main(String[] args) {
////        launch(args);
////    }
//
//    @Override
//    public void start(Stage primaryStage) {
//        primaryStage.setTitle("JavaFX Welcome");
//        GridPane grid = new GridPane();
//        grid.setAlignment(Pos.CENTER);
//        grid.setHgap(10);
//        grid.setVgap(10);
//        grid.setPadding(new Insets(25, 25, 25, 25));
//
//        Text scenetitle = new Text("Welcome");
//        scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
//        grid.add(scenetitle, 0, 0, 2, 1);
//
//        Label userName = new Label("User Name:");
//        grid.add(userName, 0, 1);
//
//        TextField userTextField = new TextField();
//        grid.add(userTextField, 1, 1);
//
//        Label pw = new Label("Password:");
//        grid.add(pw, 0, 2);
//
//        PasswordField pwBox = new PasswordField();
//        grid.add(pwBox, 1, 2);
//
//        Button btn = new Button("Sign in");
//        HBox hbBtn = new HBox(10);
//        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
//        hbBtn.getChildren().add(btn);
//        grid.add(hbBtn, 1, 4);
//
//        final Text actiontarget = new Text();
//        grid.add(actiontarget, 1, 6);
//
//        btn.setOnAction(new EventHandler<ActionEvent>() {
//
//            @Override
//            public void handle(ActionEvent e) {
//                actiontarget.setFill(Color.FIREBRICK);
//                actiontarget.setText("Sign in button pressed");
//            }
//        });
//
//        Scene scene = new Scene(grid, 300, 275);
//        primaryStage.setScene(scene);
//        primaryStage.show();
//    }
//}
