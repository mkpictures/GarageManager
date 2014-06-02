/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import garage.Car;
import garage.Garage;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import view.actionListeners.CancelAction;

/**
 *
 * @author Arakhnor
 */
public class ViewCarDialog extends JDialog{
    
    
    private Garage model; 
    private Car car;
    
    private JPanel panel;
    private JPanel buttonPanel;
    private CarInformationsPanel carInfoPanel;
    
    private JButton applyButton;
    private JButton cancelButton;
    
    public ViewCarDialog(Garage model_, Car car){
        this.model = model_;
        this.car = car;
        init();
        
    }
    
    private void init(){
        
        this.setTitle("View/edit car informations");
        
        panel = new JPanel();
        panel.setLayout(new BorderLayout());
        
        buttonPanel = new JPanel();
        carInfoPanel = new CarInformationsPanel();
        
        carInfoPanel.setMark(car.getMark());
        carInfoPanel.setModel(car.getModel());
        carInfoPanel.setColor(car.getColor());
        carInfoPanel.setKilometers(car.getKilometers());
        carInfoPanel.setYear(car.getYear());
        carInfoPanel.setPrice(car.getPrice());
        
        applyButton = new JButton("Apply changes");
        applyButton.addActionListener(new ApplyAction());
        cancelButton = new JButton("Cancel");
        cancelButton.addActionListener(new CancelAction(this));
        buttonPanel.add(applyButton);
        buttonPanel.add(cancelButton);
        
        this.panel.add(carInfoPanel, BorderLayout.CENTER);
        this.panel.add(buttonPanel, BorderLayout.SOUTH);
        
        this.getContentPane().add(panel);
        
        pack();
        this.setVisible(true);
        
    }

    private class ApplyAction implements ActionListener {

        public ApplyAction(){
        }

        @Override
        public void actionPerformed(ActionEvent ae) {
            throw new UnsupportedOperationException("Not supported yet.");
        }
    }
    
}
