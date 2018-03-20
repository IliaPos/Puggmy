package puggmy;

import java.awt.*;
import javax.swing.*;



public class Graphic {
	static Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	public static int sizeWidth = 800;
	public static int sizeHeight = 600;
	public static int locationX = (screenSize.width - sizeWidth) / 2;
	public static int locationY = (screenSize.height - sizeHeight) / 2;
	
	public static void init() {
		JFrame newJ = new JFrame("Puggmy 1.0.0");
		//newJ.setSize(1500, 500);
        newJ.setResizable(false); 
       // newJ.setUndecorated(true);
        newJ.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        
 
     
       
        
       
        newJ.setBounds(locationX, locationY, sizeWidth, sizeHeight);
        newJ.setVisible(true);
	}
	
	
}
