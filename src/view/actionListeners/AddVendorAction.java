/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view.actionListeners;

import garage.Garage;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.AddVendorDialog;
import view.GarageFrame;

/**
 *
 * @author Arakhnor
 */
public class AddVendorAction implements ActionListener{

    private Garage model;
    private GarageFrame parentFrame;
    
    public AddVendorAction(Garage model, GarageFrame parent){
        this.model = model;
        this.parentFrame = parent;
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        AddVendorDialog addVendorDialog = new AddVendorDialog(this.model, this.parentFrame, true);
        addVendorDialog.addListener(parentFrame.getVendorsPanel());
        addVendorDialog.setVisible(true);
    }
    
    
    
}
