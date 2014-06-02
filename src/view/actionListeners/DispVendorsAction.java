/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view.actionListeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import view.GarageFrame;

/**
 *
 * @author Arakhnor
 */
public class DispVendorsAction implements ActionListener {

    private JPanel parentPanel;
    private JPanel vendorsPanel;
    private GarageFrame parentFrame;
    
    public DispVendorsAction(JPanel parentPanel, JPanel vendorsPanel){
        this.vendorsPanel = vendorsPanel;
        this.parentPanel = parentPanel;
    }
    
    public DispVendorsAction(GarageFrame parentFrame, JPanel parentPanel, JPanel vendorsPanel){
        this(parentPanel, vendorsPanel);
        this.parentFrame = parentFrame;
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(parentFrame.getShowroom().isVisible()){
            parentFrame.getShowroom().setVisible(false);
        }
        if(!vendorsPanel.isVisible()) {
            //parentPanel.remove(showroomPanel);
            vendorsPanel.setVisible(true);
        }
        parentPanel.add(vendorsPanel);
    }
    
}
