package view.actionListeners;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import garage.Garage;

public class ExitAction implements ActionListener{

	private Garage garage;
	private Component parent;
	private Object[] options = { "Yes", "No", "Cancel" };
	
	public ExitAction(Component parent, Garage garage){
		this.garage = garage;
		this.parent = parent;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JOptionPane.showOptionDialog(parent, "Save before exit ?", "Exit" , JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.QUESTION_MESSAGE, null, this.options, options[0]);
		System.exit(0);	
	}

}
