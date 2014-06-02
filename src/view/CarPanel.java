package view;

import javax.swing.JPanel;
import javax.swing.JButton;

public class CarPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public CarPanel() {
		setLayout(null);
		
		CarInformationsPanel carInformationsPanel = new CarInformationsPanel();
		carInformationsPanel.setBounds(10, 11, 404, 211);
		add(carInformationsPanel);
		
		JButton btnEdit = new JButton("Edit");
		btnEdit.setBounds(52, 247, 89, 23);
		add(btnEdit);
		
		JButton btnApply = new JButton("Apply");
		btnApply.setBounds(182, 247, 89, 23);
		add(btnApply);
		
		JButton btnClose = new JButton("Close");
		btnClose.setBounds(298, 247, 89, 23);
		add(btnClose);

	}

}
