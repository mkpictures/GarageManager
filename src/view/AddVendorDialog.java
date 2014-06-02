package view;

import garage.Garage;
import garage.PersonException;
import garage.Vendor;
import garage.VendorException;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import view.actionListeners.CancelAction;

public class AddVendorDialog extends JDialog {

    private JPanel panel;
    private JPanel buttonPanel;
    private VendorInformationsPanel vendorPanel; 
    private Garage model;
    
    private JButton saveButton;
    private JButton cancelButton;
    
    public AddVendorDialog() {
        init();
    }
    
    public AddVendorDialog(Garage model_, JFrame parent, boolean modal){
        super(parent, modal);
        this.model = model_;
        init();
    }
    
    /**
     * need to add button actions here
     */
    private void init(){
        
        panel = new JPanel();
        buttonPanel = new JPanel();
        
        saveButton = new JButton("Save");
        saveButton.addActionListener(new SaveVendorAction());
        cancelButton = new JButton("Cancel");
        cancelButton.addActionListener(new CancelAction(this));
        
        buttonPanel.add(saveButton);
        buttonPanel.add(cancelButton);
        
        this.setLayout(new BorderLayout());
        
        this.vendorPanel = new VendorInformationsPanel();
        
        panel.add(vendorPanel, BorderLayout.NORTH);
        panel.add(buttonPanel, BorderLayout.CENTER);   
        
        this.setContentPane(panel);
        
        pack();
        
    }
    
    public VendorInformationsPanel getVendorInformations(){
        return this.vendorPanel;
    }
    
    public void addListener(PropertyChangeListener listener){
        this.addPropertyChangeListener("VENDOR_ADDED", listener);
    }
    
    
    private class SaveVendorAction implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            try {
                Vendor vendor = new Vendor(vendorPanel.getName(), vendorPanel.getFirstname(),
                        vendorPanel.getMail(),
                        vendorPanel.getCarsSold() );
                model.addVendor(vendor);
                firePropertyChange("VENDOR_ADDED", null, model);
                JOptionPane.showMessageDialog(null, "Vendor added");
                dispose();
            } catch (    PersonException | VendorException ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
        }
        
    }
    
}
