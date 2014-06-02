package view.actionListeners;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import business.Garage;

public class NewGarageAction implements ActionListener{

	private Garage model;
	private Component parent;
	
	public NewGarageAction(Component parent, Garage model){
		this.model = model;
		this.parent = parent;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not implemented yet");
	}
	
}
