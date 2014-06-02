package view;

import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class CarInformationsPanel extends JPanel {
	
	private JTextField markTF;
	private JTextField modelTF;
	private JTextField colorTF;
	private JTextField yearTF;
	private JTextField kilometersTF;
	private JTextField priceTF;

	/**
	 * Create the panel.
	 */
	public CarInformationsPanel() {
		setBorder(new TitledBorder(null, "Car informations", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		setLayout(null);
		
		JLabel markLabel = new JLabel("Mark:");
		markLabel.setBounds(25, 38, 46, 14);
		add(markLabel);
		
		JLabel modelLabel = new JLabel("Model:");
		modelLabel.setBounds(25, 63, 46, 14);
		add(modelLabel);
		
		JLabel colorLabel = new JLabel("Color: ");
		colorLabel.setBounds(25, 92, 46, 14);
		add(colorLabel);
		
		JLabel yearLabel = new JLabel("Year: ");
		yearLabel.setBounds(25, 117, 46, 14);
		add(yearLabel);
		
		JLabel kilometersLabel = new JLabel("Kilometers:");
		kilometersLabel.setBounds(25, 142, 63, 14);
		add(kilometersLabel);
		
		JLabel priceLabel = new JLabel("Price: ");
		priceLabel.setBounds(25, 167, 46, 14);
		add(priceLabel);
		
		markTF = new JTextField();
		markTF.setBounds(100, 33, 250, 20);
		add(markTF);
		markTF.setColumns(10);
		
		modelTF = new JTextField();
		modelTF.setBounds(100, 59, 250, 20);
		add(modelTF);
		modelTF.setColumns(10);
		
		colorTF = new JTextField();
		colorTF.setBounds(100, 86, 250, 20);
		add(colorTF);
		colorTF.setColumns(10);
		
		yearTF = new JTextField();
		yearTF.setBounds(100, 114, 250, 17);
		add(yearTF);
		yearTF.setColumns(10);
		
		kilometersTF = new JTextField();
		kilometersTF.setBounds(98, 139, 252, 20);
		add(kilometersTF);
		kilometersTF.setColumns(10);
		
		priceTF = new JTextField();
		priceTF.setBounds(100, 164, 250, 20);
		add(priceTF);
		priceTF.setColumns(10);
                
                this.setPreferredSize(new Dimension(400,250));
                this.setSize(getPreferredSize());
	}
        
        public String getMark(){
            return this.markTF.getText();
        }
        
        public void setMark(String mark){
            this.markTF.setText(mark);
        }
        
        public String getModel(){
            return this.modelTF.getText();
        }
        
        public void setModel(String model){
            this.modelTF.setText(model);
        }
        
        public String getColor(){
            return this.colorTF.getText();
        }
        
        public void setColor(String color){
            this.colorTF.setText(color);
        }
        
        public int getYear(){
            return Integer.parseInt(this.yearTF.getText());
        }
        
        public void setYear(int year){
            this.yearTF.setText(""+year);
        }
        
        public int getKilometers(){
            return Integer.parseInt(this.kilometersTF.getText());
        }
        
        public void setKilometers(int kilometers){
            this.kilometersTF.setText(""+kilometers);
        }
        
        public int getPrice(){
            return Integer.parseInt(this.priceTF.getText());
        }
        
        public void setPrice(int price){
            this.priceTF.setText(""+price);
        }
        
}
