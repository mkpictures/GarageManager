/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import garage.Garage;
import garage.Vendor;
import java.awt.Dimension;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.TitledBorder;

/**
 *
 * @author Arakhnor
 */
public class VendorsPanel extends JPanel implements PropertyChangeListener{

    private Garage model;
    private DefaultListModel<Vendor> vendors = new DefaultListModel<>();;
    private JList list = new JList();
    private JScrollPane scrollPane;
    
    private JButton viewButton;
    
    
    public VendorsPanel(){
        
    }
    
    public VendorsPanel(Garage model){
        this.model = model;
        
        loadVendors();
        scrollPane = new JScrollPane(list);
        this.add(scrollPane);
        
        this.setBorder(new TitledBorder("Vendors"));
        
        this.setPreferredSize(new Dimension(450, 300));
        
    }
    
    private void loadVendors(){
        vendors.clear();
        for(Vendor vendor : model.getVendors(true)){
            vendors.addElement(vendor);
        }
        list = new JList(vendors);
        //list.setListData(vendors.toArray());
        
    }
    
    @Override
    public void propertyChange(PropertyChangeEvent pce) {
        
        if(pce.getPropertyName().equals("VENDOR_ADDED")){
            loadVendors();
            System.out.println("Vendors added");
            repaint();
        }
    }
    
}
