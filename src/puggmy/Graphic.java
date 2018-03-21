package puggmy;

import java.awt.*;
import javax.swing.*;



public class Graphic extends JFrame{
	private static JButton newKeyButton = new JButton("Random key");
	private static JButton goButton = new JButton("Go");
	private static JTextField inputForKey = new JTextField("", 5);
	private static JTextField inputText = new JTextField("", 10);
	private static JTextField outputText = new JTextField("", 10);
	private static JLabel labelForKey = new JLabel("Input key: ");
	private static JLabel labelForInputText = new JLabel("Input text");
	private static JLabel labelForOutputText = new JLabel("Output text");
	private static JRadioButton ecrypt = new JRadioButton("Ecrypt");
	private static JRadioButton decrypt = new JRadioButton("Decrypt");
	
	static Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	public static int sizeWidth = 800;
	public static int sizeHeight = 600;
	public static int locationX = (screenSize.width - sizeWidth) / 2;
	public static int locationY = (screenSize.height - sizeHeight) / 2;
	
	public Graphic() {
		super("Puggmy");
		this.setBounds(locationX, locationY, sizeWidth, sizeHeight);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container container = this.getContentPane();
		container.setLayout(new GridLayout(5, 2, 2, 2));
		container.add(labelForKey);
		container.add(getInputForKey());
		container.add(labelForInputText);
		container.add(getInputText());
		container.add(labelForOutputText);
		container.add(getOutputText());
		
		ButtonGroup radioGroup = new ButtonGroup();
		radioGroup.add(getEcrypt());
		radioGroup.add(decrypt);
		container.add(getEcrypt());
		getEcrypt().setSelected(true);
		container.add(decrypt);
		
		getNewKeyButton().addActionListener(new ButtonEventListener());
		getGoButton().addActionListener(new ButtonEventListener());
		container.add(getNewKeyButton());
		container.add(getGoButton());
		
		
		
		
	}

	public static JTextField getInputForKey() {
		return inputForKey;
	}

	public void setInputForKey(JTextField inputForKey) {
		this.inputForKey = inputForKey;
	}

	public static JRadioButton getEcrypt() {
		return ecrypt;
	}

	public void setEcrypt(JRadioButton ecrypt) {
		this.ecrypt = ecrypt;
	}

	public static JTextField getInputText() {
		return inputText;
	}

	public static void setInputText(JTextField inputText) {
		Graphic.inputText = inputText;
	}

	public static JTextField getOutputText() {
		return outputText;
	}

	public static void setOutputText(JTextField outputText) {
		Graphic.outputText = outputText;
	}

	public static JButton getNewKeyButton() {
		return newKeyButton;
	}

	public static void setNewKeyButton(JButton newKeyButton) {
		Graphic.newKeyButton = newKeyButton;
	}

	public static JButton getGoButton() {
		return goButton;
	}

	public static void setGoButton(JButton goButton) {
		Graphic.goButton = goButton;
	}


	
	
	
	
//	public static void init() {
//		JFrame newJ = new JFrame("Puggmy 1.0.0");
//		//newJ.setSize(1500, 500);
//        newJ.setResizable(false); 
//       // newJ.setUndecorated(true);
//        newJ.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        
//        JButton button = new JButton("Button 1 (PAGE_START)");
//        newJ.add(button, BorderLayout.PAGE_START);
//
//       
//        
// 
//     
//       
//        
//       
//        newJ.setBounds(locationX, locationY, sizeWidth, sizeHeight);
//        newJ.setVisible(true);
//	}
	
	
}
