package puggmy;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;

import javax.swing.JButton;
import javax.swing.JOptionPane;

public class ButtonEventListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		String actualKey ;
		String actualInputText = Graphic.getInputText().getText();
		String  message = "";
		if (e.getSource() == Graphic.getNewKeyButton()){
				String newKey = Logic.randomNewKey();
				Graphic.getInputForKey().setText(newKey);
				message += newKey;
				actualKey = newKey;
		} else {
			actualKey = Graphic.getInputForKey().getText();
		}
		if (e.getSource() == Graphic.getGoButton()){
				if (Graphic.getEcrypt().isSelected()) {
					Graphic.getOutputText().setText(Logic.encrypter(actualInputText, actualKey));
				} else if (Graphic.getDecrypt().isSelected()) {
					Graphic.getOutputText().setText(Logic.decrypter(actualInputText, actualKey));
				}
				
			}
		
//		message += "Button1 was pressed\n";
//		message += "Key is " + Graphic.getInputForKey().getText() + "\n";
//		message += "inputText is " + Graphic.getInputText().getText() + "\n";
//		message += "outPutText is " + Graphic.getOutputText().getText() + "\n";
//		message += (Graphic.getEcrypt().isSelected() ? "Radio 1" : "Radio 2") + " is selected\n";
		JOptionPane.showMessageDialog(null, message, "output", JOptionPane.PLAIN_MESSAGE);
	
	}
}
